/**
 */
package org.hl7.knowledgeartifact.r1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.cdsdt.r2.ANY;
import org.hl7.cdsdt.r2.HXIT;
import org.hl7.cdsdt.r2.II;

import org.hl7.knowledgeartifact.r1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package
 * @generated
 */
public class R1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Switch() {
		if (modelPackage == null) {
			modelPackage = R1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case R1Package.ACTION_BASE: {
				ActionBase actionBase = (ActionBase)theEObject;
				T result = caseActionBase(actionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				T result = caseActionGroup(actionGroup);
				if (result == null) result = caseActionBase(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ACTION_REF: {
				ActionRef actionRef = (ActionRef)theEObject;
				T result = caseActionRef(actionRef);
				if (result == null) result = caseActionBase(actionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ACTORS_TYPE: {
				ActorsType actorsType = (ActorsType)theEObject;
				T result = caseActorsType(actorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ADDRESSES_TYPE: {
				AddressesType addressesType = (AddressesType)theEObject;
				T result = caseAddressesType(addressesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.APPLICABILITY_TYPE: {
				ApplicabilityType applicabilityType = (ApplicabilityType)theEObject;
				T result = caseApplicabilityType(applicabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT: {
				ArtifactLifeCycleEvent artifactLifeCycleEvent = (ArtifactLifeCycleEvent)theEObject;
				T result = caseArtifactLifeCycleEvent(artifactLifeCycleEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ARTIFACT_TYPE_TYPE: {
				ArtifactTypeType artifactTypeType = (ArtifactTypeType)theEObject;
				T result = caseArtifactTypeType(artifactTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ATOMIC_ACTION: {
				AtomicAction atomicAction = (AtomicAction)theEObject;
				T result = caseAtomicAction(atomicAction);
				if (result == null) result = caseActionBase(atomicAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BEHAVIORS: {
				Behaviors behaviors = (Behaviors)theEObject;
				T result = caseBehaviors(behaviors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CARDINALITY_BEHAVIOR: {
				CardinalityBehavior cardinalityBehavior = (CardinalityBehavior)theEObject;
				T result = caseCardinalityBehavior(cardinalityBehavior);
				if (result == null) result = caseBehavior(cardinalityBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CATEGORIES_TYPE: {
				CategoriesType categoriesType = (CategoriesType)theEObject;
				T result = caseCategoriesType(categoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CODES_TYPE: {
				CodesType codesType = (CodesType)theEObject;
				T result = caseCodesType(codesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COLLECT_INFORMATION_ACTION: {
				CollectInformationAction collectInformationAction = (CollectInformationAction)theEObject;
				T result = caseCollectInformationAction(collectInformationAction);
				if (result == null) result = caseAtomicAction(collectInformationAction);
				if (result == null) result = caseActionBase(collectInformationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONDITION_ROLE_TYPE1: {
				ConditionRoleType1 conditionRoleType1 = (ConditionRoleType1)theEObject;
				T result = caseConditionRoleType1(conditionRoleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONDITIONS: {
				Conditions conditions = (Conditions)theEObject;
				T result = caseConditions(conditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONSTRAINT_TYPE_TYPE: {
				ConstraintTypeType constraintTypeType = (ConstraintTypeType)theEObject;
				T result = caseConstraintTypeType(constraintTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONTACTS_TYPE: {
				ContactsType contactsType = (ContactsType)theEObject;
				T result = caseContactsType(contactsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONTENT_TYPE: {
				ContentType contentType = (ContentType)theEObject;
				T result = caseContentType(contentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONTRIBUTIONS_TYPE: {
				ContributionsType contributionsType = (ContributionsType)theEObject;
				T result = caseContributionsType(contributionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CREATE_ACTION: {
				CreateAction createAction = (CreateAction)theEObject;
				T result = caseCreateAction(createAction);
				if (result == null) result = caseAtomicAction(createAction);
				if (result == null) result = caseActionBase(createAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DATA_EVENT_TRIGGER: {
				DataEventTrigger dataEventTrigger = (DataEventTrigger)theEObject;
				T result = caseDataEventTrigger(dataEventTrigger);
				if (result == null) result = caseTrigger(dataEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DATA_MODELS_TYPE: {
				DataModelsType dataModelsType = (DataModelsType)theEObject;
				T result = caseDataModelsType(dataModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DECLARE_RESPONSE_ACTION: {
				DeclareResponseAction declareResponseAction = (DeclareResponseAction)theEObject;
				T result = caseDeclareResponseAction(declareResponseAction);
				if (result == null) result = caseAtomicAction(declareResponseAction);
				if (result == null) result = caseActionBase(declareResponseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DOCUMENTATION_ITEM: {
				DocumentationItem documentationItem = (DocumentationItem)theEObject;
				T result = caseDocumentationItem(documentationItem);
				if (result == null) result = caseItemDefinition(documentationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ENUMERATION_CONSTRAINT: {
				EnumerationConstraint enumerationConstraint = (EnumerationConstraint)theEObject;
				T result = caseEnumerationConstraint(enumerationConstraint);
				if (result == null) result = caseRangeConstraint(enumerationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ENUMERATION_ITEM: {
				EnumerationItem enumerationItem = (EnumerationItem)theEObject;
				T result = caseEnumerationItem(enumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EVENT_HISTORY_TYPE: {
				EventHistoryType eventHistoryType = (EventHistoryType)theEObject;
				T result = caseEventHistoryType(eventHistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EVENT_TYPE_TYPE: {
				EventTypeType eventTypeType = (EventTypeType)theEObject;
				T result = caseEventTypeType(eventTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPRESSION_CONSTRAINT: {
				ExpressionConstraint expressionConstraint = (ExpressionConstraint)theEObject;
				T result = caseExpressionConstraint(expressionConstraint);
				if (result == null) result = caseRangeConstraint(expressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPRESSIONS_TYPE: {
				ExpressionsType expressionsType = (ExpressionsType)theEObject;
				T result = caseExpressionsType(expressionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXTERNAL_DATA_TYPE: {
				ExternalDataType externalDataType = (ExternalDataType)theEObject;
				T result = caseExternalDataType(externalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FIRE_EVENT_ACTION: {
				FireEventAction fireEventAction = (FireEventAction)theEObject;
				T result = caseFireEventAction(fireEventAction);
				if (result == null) result = caseAtomicAction(fireEventAction);
				if (result == null) result = caseActionBase(fireEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FOCUS_TYPE: {
				FocusType focusType = (FocusType)theEObject;
				T result = caseFocusType(focusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FORMATTED_NUMBER: {
				FormattedNumber formattedNumber = (FormattedNumber)theEObject;
				T result = caseFormattedNumber(formattedNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FORMATTED_TEXT: {
				FormattedText formattedText = (FormattedText)theEObject;
				T result = caseFormattedText(formattedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR: {
				GroupOrganizationBehavior groupOrganizationBehavior = (GroupOrganizationBehavior)theEObject;
				T result = caseGroupOrganizationBehavior(groupOrganizationBehavior);
				if (result == null) result = caseBehavior(groupOrganizationBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.GROUP_SELECTION_BEHAVIOR: {
				GroupSelectionBehavior groupSelectionBehavior = (GroupSelectionBehavior)theEObject;
				T result = caseGroupSelectionBehavior(groupSelectionBehavior);
				if (result == null) result = caseBehavior(groupSelectionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IDENTIFIERS_TYPE: {
				IdentifiersType identifiersType = (IdentifiersType)theEObject;
				T result = caseIdentifiersType(identifiersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IDENTIFIERS_TYPE1: {
				IdentifiersType1 identifiersType1 = (IdentifiersType1)theEObject;
				T result = caseIdentifiersType1(identifiersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INLINE_RESOURCE: {
				InlineResource inlineResource = (InlineResource)theEObject;
				T result = caseInlineResource(inlineResource);
				if (result == null) result = caseKnowledgeResource(inlineResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ITEM_CODES_TYPE: {
				ItemCodesType itemCodesType = (ItemCodesType)theEObject;
				T result = caseItemCodesType(itemCodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ITEM_DEFINITION: {
				ItemDefinition itemDefinition = (ItemDefinition)theEObject;
				T result = caseItemDefinition(itemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.KEY_TERMS_TYPE: {
				KeyTermsType keyTermsType = (KeyTermsType)theEObject;
				T result = caseKeyTermsType(keyTermsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.KNOWLEDGE_DOCUMENT: {
				KnowledgeDocument knowledgeDocument = (KnowledgeDocument)theEObject;
				T result = caseKnowledgeDocument(knowledgeDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.KNOWLEDGE_RESOURCE: {
				KnowledgeResource knowledgeResource = (KnowledgeResource)theEObject;
				T result = caseKnowledgeResource(knowledgeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LIBRARIES_TYPE: {
				LibrariesType librariesType = (LibrariesType)theEObject;
				T result = caseLibrariesType(librariesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LIBRARY_REFERENCE: {
				LibraryReference libraryReference = (LibraryReference)theEObject;
				T result = caseLibraryReference(libraryReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LOOKUP_CONSTRAINT: {
				LookupConstraint lookupConstraint = (LookupConstraint)theEObject;
				T result = caseLookupConstraint(lookupConstraint);
				if (result == null) result = caseRangeConstraint(lookupConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MASK_CONSTRAINT: {
				MaskConstraint maskConstraint = (MaskConstraint)theEObject;
				T result = caseMaskConstraint(maskConstraint);
				if (result == null) result = caseRangeConstraint(maskConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NAMED_EVENT_TRIGGER: {
				NamedEventTrigger namedEventTrigger = (NamedEventTrigger)theEObject;
				T result = caseNamedEventTrigger(namedEventTrigger);
				if (result == null) result = caseTrigger(namedEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseParty(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PERIODIC_EVENT_TRIGGER: {
				PeriodicEventTrigger periodicEventTrigger = (PeriodicEventTrigger)theEObject;
				T result = casePeriodicEventTrigger(periodicEventTrigger);
				if (result == null) result = caseTrigger(periodicEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PERMISSIONS_TYPE: {
				PermissionsType permissionsType = (PermissionsType)theEObject;
				T result = casePermissionsType(permissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseParty(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PRECHECK_BEHAVIOR: {
				PrecheckBehavior precheckBehavior = (PrecheckBehavior)theEObject;
				T result = casePrecheckBehavior(precheckBehavior);
				if (result == null) result = caseBehavior(precheckBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PUBLISHERS_TYPE: {
				PublishersType publishersType = (PublishersType)theEObject;
				T result = casePublishersType(publishersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RANGE_CONSTRAINT: {
				RangeConstraint rangeConstraint = (RangeConstraint)theEObject;
				T result = caseRangeConstraint(rangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.READ_ONLY_BEHAVIOR: {
				ReadOnlyBehavior readOnlyBehavior = (ReadOnlyBehavior)theEObject;
				T result = caseReadOnlyBehavior(readOnlyBehavior);
				if (result == null) result = caseBehavior(readOnlyBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.REFERENCED_MODEL_TYPE: {
				ReferencedModelType referencedModelType = (ReferencedModelType)theEObject;
				T result = caseReferencedModelType(referencedModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RELATED_RESOURCES_TYPE: {
				RelatedResourcesType relatedResourcesType = (RelatedResourcesType)theEObject;
				T result = caseRelatedResourcesType(relatedResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.REMOVE_ACTION: {
				RemoveAction removeAction = (RemoveAction)theEObject;
				T result = caseRemoveAction(removeAction);
				if (result == null) result = caseAtomicAction(removeAction);
				if (result == null) result = caseActionBase(removeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.REPRESENTED_CONCEPTS_TYPE: {
				RepresentedConceptsType representedConceptsType = (RepresentedConceptsType)theEObject;
				T result = caseRepresentedConceptsType(representedConceptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.REQUIRED_BEHAVIOR: {
				RequiredBehavior requiredBehavior = (RequiredBehavior)theEObject;
				T result = caseRequiredBehavior(requiredBehavior);
				if (result == null) result = caseBehavior(requiredBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RESOURCE_RELATIONSHIP_REFERENCE: {
				ResourceRelationshipReference resourceRelationshipReference = (ResourceRelationshipReference)theEObject;
				T result = caseResourceRelationshipReference(resourceRelationshipReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RESOURCES_TYPE: {
				ResourcesType resourcesType = (ResourcesType)theEObject;
				T result = caseResourcesType(resourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RESPONSE_BINDING: {
				ResponseBinding responseBinding = (ResponseBinding)theEObject;
				T result = caseResponseBinding(responseBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RESPONSE_CARDINALITY_TYPE: {
				ResponseCardinalityType responseCardinalityType = (ResponseCardinalityType)theEObject;
				T result = caseResponseCardinalityType(responseCardinalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RESPONSE_DATA_TYPE_TYPE: {
				ResponseDataTypeType responseDataTypeType = (ResponseDataTypeType)theEObject;
				T result = caseResponseDataTypeType(responseDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RIGHTS_DECLARATION: {
				RightsDeclaration rightsDeclaration = (RightsDeclaration)theEObject;
				T result = caseRightsDeclaration(rightsDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUB_ELEMENTS_TYPE: {
				SubElementsType subElementsType = (SubElementsType)theEObject;
				T result = caseSubElementsType(subElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUPPORTING_EVIDENCE: {
				SupportingEvidence supportingEvidence = (SupportingEvidence)theEObject;
				T result = caseSupportingEvidence(supportingEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUPPORTING_RESOURCE: {
				SupportingResource supportingResource = (SupportingResource)theEObject;
				T result = caseSupportingResource(supportingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TEMPLATE_IDS_TYPE: {
				TemplateIdsType templateIdsType = (TemplateIdsType)theEObject;
				T result = caseTemplateIdsType(templateIdsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TEMPLATE_IDS_TYPE1: {
				TemplateIdsType1 templateIdsType1 = (TemplateIdsType1)theEObject;
				T result = caseTemplateIdsType1(templateIdsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TRIGGERS: {
				Triggers triggers = (Triggers)theEObject;
				T result = caseTriggers(triggers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.UPDATE_ACTION: {
				UpdateAction updateAction = (UpdateAction)theEObject;
				T result = caseUpdateAction(updateAction);
				if (result == null) result = caseAtomicAction(updateAction);
				if (result == null) result = caseActionBase(updateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.USAGE_TERMS_TYPE: {
				UsageTermsType usageTermsType = (UsageTermsType)theEObject;
				T result = caseUsageTermsType(usageTermsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VALUE_SET_CONSTRAINT: {
				ValueSetConstraint valueSetConstraint = (ValueSetConstraint)theEObject;
				T result = caseValueSetConstraint(valueSetConstraint);
				if (result == null) result = caseRangeConstraint(valueSetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VERSIONED_IDENTIFIER: {
				VersionedIdentifier versionedIdentifier = (VersionedIdentifier)theEObject;
				T result = caseVersionedIdentifier(versionedIdentifier);
				if (result == null) result = caseII(versionedIdentifier);
				if (result == null) result = caseANY(versionedIdentifier);
				if (result == null) result = caseHXIT(versionedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VISUAL_STYLE_BEHAVIOR: {
				VisualStyleBehavior visualStyleBehavior = (VisualStyleBehavior)theEObject;
				T result = caseVisualStyleBehavior(visualStyleBehavior);
				if (result == null) result = caseBehavior(visualStyleBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBase(ActionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionGroup(ActionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRef(ActionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorsType(ActorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addresses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addresses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressesType(AddressesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicabilityType(ApplicabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Life Cycle Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Life Cycle Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactLifeCycleEvent(ArtifactLifeCycleEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactTypeType(ArtifactTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicAction(AtomicAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviors(Behaviors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityBehavior(CardinalityBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoriesType(CategoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodesType(CodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collect Information Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collect Information Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectInformationAction(CollectInformationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Role Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Role Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionRoleType1(ConditionRoleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditions(Conditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintTypeType(ConstraintTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contacts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contacts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactsType(ContactsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentType(ContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionsType(ContributionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAction(CreateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEventTrigger(DataEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Models Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModelsType(DataModelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Response Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Response Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareResponseAction(DeclareResponseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationItem(DocumentationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationConstraint(EnumerationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationItem(EnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event History Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event History Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHistoryType(EventHistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTypeType(EventTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionConstraint(ExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expressions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expressions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionsType(ExpressionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDataType(ExternalDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fire Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fire Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFireEventAction(FireEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Focus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Focus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFocusType(FocusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatted Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatted Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattedNumber(FormattedNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattedText(FormattedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Organization Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Organization Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupOrganizationBehavior(GroupOrganizationBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Selection Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Selection Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupSelectionBehavior(GroupSelectionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiersType(IdentifiersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiers Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiers Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiersType1(IdentifiersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineResource(InlineResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Codes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemCodesType(ItemCodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemDefinition(ItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Terms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Terms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyTermsType(KeyTermsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeDocument(KnowledgeDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeResource(KnowledgeResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Libraries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Libraries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrariesType(LibrariesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryReference(LibraryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupConstraint(LookupConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskConstraint(MaskConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEventTrigger(NamedEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicEventTrigger(PeriodicEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionsType(PermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precheck Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precheck Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecheckBehavior(PrecheckBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishersType(PublishersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeConstraint(RangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Only Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Only Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadOnlyBehavior(ReadOnlyBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedModelType(ReferencedModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedResourcesType(RelatedResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipType(RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAction(RemoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Represented Concepts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Represented Concepts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentedConceptsType(RepresentedConceptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredBehavior(RequiredBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Relationship Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Relationship Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRelationshipReference(ResourceRelationshipReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcesType(ResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBinding(ResponseBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Cardinality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseCardinalityType(ResponseCardinalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDataTypeType(ResponseDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rights Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rights Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightsDeclaration(RightsDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusType(StatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubElementsType(SubElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingEvidence(SupportingEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingResource(SupportingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Ids Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Ids Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateIdsType(TemplateIdsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Ids Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Ids Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateIdsType1(TemplateIdsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triggers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triggers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggers(Triggers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAction(UpdateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Terms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Terms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageTermsType(UsageTermsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetConstraint(ValueSetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedIdentifier(VersionedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Style Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Style Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualStyleBehavior(VisualStyleBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HXIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HXIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHXIT(HXIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY(ANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>II</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>II</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseII(II object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //R1Switch
