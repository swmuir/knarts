/**
 */
package org.hl7.knowledgeartifact.r2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.cdsdt.r2.ANY;
import org.hl7.cdsdt.r2.HXIT;
import org.hl7.cdsdt.r2.II;

import org.hl7.knowledgeartifact.r2.*;

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
 * @see org.hl7.knowledgeartifact.r2.R2Package
 * @generated
 */
public class R2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Switch() {
		if (modelPackage == null) {
			modelPackage = R2Package.eINSTANCE;
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
			case R2Package.ACTION_BASE: {
				ActionBase actionBase = (ActionBase)theEObject;
				T result = caseActionBase(actionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				T result = caseActionGroup(actionGroup);
				if (result == null) result = caseActionBase(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ACTION_REF: {
				ActionRef actionRef = (ActionRef)theEObject;
				T result = caseActionRef(actionRef);
				if (result == null) result = caseActionBase(actionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ACTORS_TYPE: {
				ActorsType actorsType = (ActorsType)theEObject;
				T result = caseActorsType(actorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ADDRESSES_TYPE: {
				AddressesType addressesType = (AddressesType)theEObject;
				T result = caseAddressesType(addressesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.APPLICABILITY_TYPE: {
				ApplicabilityType applicabilityType = (ApplicabilityType)theEObject;
				T result = caseApplicabilityType(applicabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT: {
				ArtifactLifeCycleEvent artifactLifeCycleEvent = (ArtifactLifeCycleEvent)theEObject;
				T result = caseArtifactLifeCycleEvent(artifactLifeCycleEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ARTIFACT_SUMMARY: {
				ArtifactSummary artifactSummary = (ArtifactSummary)theEObject;
				T result = caseArtifactSummary(artifactSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ARTIFACT_TYPE_TYPE: {
				ArtifactTypeType artifactTypeType = (ArtifactTypeType)theEObject;
				T result = caseArtifactTypeType(artifactTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ARTIFACT_TYPE_TYPE1: {
				ArtifactTypeType1 artifactTypeType1 = (ArtifactTypeType1)theEObject;
				T result = caseArtifactTypeType1(artifactTypeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ATOMIC_ACTION: {
				AtomicAction atomicAction = (AtomicAction)theEObject;
				T result = caseAtomicAction(atomicAction);
				if (result == null) result = caseActionBase(atomicAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BEHAVIORS: {
				Behaviors behaviors = (Behaviors)theEObject;
				T result = caseBehaviors(behaviors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BINDING_MODEL_TYPE: {
				BindingModelType bindingModelType = (BindingModelType)theEObject;
				T result = caseBindingModelType(bindingModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BINDING_MODEL_TYPE1: {
				BindingModelType1 bindingModelType1 = (BindingModelType1)theEObject;
				T result = caseBindingModelType1(bindingModelType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BINDING_NAME_TYPE: {
				BindingNameType bindingNameType = (BindingNameType)theEObject;
				T result = caseBindingNameType(bindingNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BINDING_TYPE: {
				BindingType bindingType = (BindingType)theEObject;
				T result = caseBindingType(bindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BINDING_TYPE_TYPE: {
				BindingTypeType bindingTypeType = (BindingTypeType)theEObject;
				T result = caseBindingTypeType(bindingTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CARDINALITY_BEHAVIOR: {
				CardinalityBehavior cardinalityBehavior = (CardinalityBehavior)theEObject;
				T result = caseCardinalityBehavior(cardinalityBehavior);
				if (result == null) result = caseBehavior(cardinalityBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CATEGORIES_TYPE: {
				CategoriesType categoriesType = (CategoriesType)theEObject;
				T result = caseCategoriesType(categoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CODES_TYPE: {
				CodesType codesType = (CodesType)theEObject;
				T result = caseCodesType(codesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CODING: {
				Coding coding = (Coding)theEObject;
				T result = caseCoding(coding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COLLECT_INFORMATION_ACTION: {
				CollectInformationAction collectInformationAction = (CollectInformationAction)theEObject;
				T result = caseCollectInformationAction(collectInformationAction);
				if (result == null) result = caseAtomicAction(collectInformationAction);
				if (result == null) result = caseActionBase(collectInformationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COMPLETION: {
				Completion completion = (Completion)theEObject;
				T result = caseCompletion(completion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COMPONENT_EVENT_BINDING: {
				ComponentEventBinding componentEventBinding = (ComponentEventBinding)theEObject;
				T result = caseComponentEventBinding(componentEventBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COMPONENT_EVENT_MAPPINGS: {
				ComponentEventMappings componentEventMappings = (ComponentEventMappings)theEObject;
				T result = caseComponentEventMappings(componentEventMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONDITION_ROLE_TYPE1: {
				ConditionRoleType1 conditionRoleType1 = (ConditionRoleType1)theEObject;
				T result = caseConditionRoleType1(conditionRoleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONDITIONS: {
				Conditions conditions = (Conditions)theEObject;
				T result = caseConditions(conditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONSTRAINT_TYPE_TYPE: {
				ConstraintTypeType constraintTypeType = (ConstraintTypeType)theEObject;
				T result = caseConstraintTypeType(constraintTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTACTS_TYPE: {
				ContactsType contactsType = (ContactsType)theEObject;
				T result = caseContactsType(contactsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTAINED_ARTIFACT: {
				ContainedArtifact containedArtifact = (ContainedArtifact)theEObject;
				T result = caseContainedArtifact(containedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTAINED_ARTIFACT_LIST: {
				ContainedArtifactList containedArtifactList = (ContainedArtifactList)theEObject;
				T result = caseContainedArtifactList(containedArtifactList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTENT_HASH_TYPE: {
				ContentHashType contentHashType = (ContentHashType)theEObject;
				T result = caseContentHashType(contentHashType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTENT_SIGNIFIER: {
				ContentSignifier contentSignifier = (ContentSignifier)theEObject;
				T result = caseContentSignifier(contentSignifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTENT_TYPE: {
				ContentType contentType = (ContentType)theEObject;
				T result = caseContentType(contentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTRIBUTIONS_TYPE: {
				ContributionsType contributionsType = (ContributionsType)theEObject;
				T result = caseContributionsType(contributionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTROL_BLOCK: {
				ControlBlock controlBlock = (ControlBlock)theEObject;
				T result = caseControlBlock(controlBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CONTROLLING_ARTIFACT_TYPE: {
				ControllingArtifactType controllingArtifactType = (ControllingArtifactType)theEObject;
				T result = caseControllingArtifactType(controllingArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CREATE_ACTION: {
				CreateAction createAction = (CreateAction)theEObject;
				T result = caseCreateAction(createAction);
				if (result == null) result = caseAtomicAction(createAction);
				if (result == null) result = caseActionBase(createAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.DATA_EVENT_TRIGGER: {
				DataEventTrigger dataEventTrigger = (DataEventTrigger)theEObject;
				T result = caseDataEventTrigger(dataEventTrigger);
				if (result == null) result = caseTrigger(dataEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.DATA_MODELS_TYPE: {
				DataModelsType dataModelsType = (DataModelsType)theEObject;
				T result = caseDataModelsType(dataModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.DECLARE_RESPONSE_ACTION: {
				DeclareResponseAction declareResponseAction = (DeclareResponseAction)theEObject;
				T result = caseDeclareResponseAction(declareResponseAction);
				if (result == null) result = caseAtomicAction(declareResponseAction);
				if (result == null) result = caseActionBase(declareResponseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.DOCUMENTATION_ITEM: {
				DocumentationItem documentationItem = (DocumentationItem)theEObject;
				T result = caseDocumentationItem(documentationItem);
				if (result == null) result = caseItemDefinition(documentationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ENUMERATION_CONSTRAINT: {
				EnumerationConstraint enumerationConstraint = (EnumerationConstraint)theEObject;
				T result = caseEnumerationConstraint(enumerationConstraint);
				if (result == null) result = caseRangeConstraint(enumerationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ENUMERATION_ITEM: {
				EnumerationItem enumerationItem = (EnumerationItem)theEObject;
				T result = caseEnumerationItem(enumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_BINDING: {
				EventBinding eventBinding = (EventBinding)theEObject;
				T result = caseEventBinding(eventBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_BINDING_TYPE_TYPE: {
				EventBindingTypeType eventBindingTypeType = (EventBindingTypeType)theEObject;
				T result = caseEventBindingTypeType(eventBindingTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_DEF_TYPE: {
				EventDefType eventDefType = (EventDefType)theEObject;
				T result = caseEventDefType(eventDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_HISTORY_TYPE: {
				EventHistoryType eventHistoryType = (EventHistoryType)theEObject;
				T result = caseEventHistoryType(eventHistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_NAME_TYPE: {
				EventNameType eventNameType = (EventNameType)theEObject;
				T result = caseEventNameType(eventNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVENT_TYPE_TYPE: {
				EventTypeType eventTypeType = (EventTypeType)theEObject;
				T result = caseEventTypeType(eventTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EXPRESSION_CONSTRAINT: {
				ExpressionConstraint expressionConstraint = (ExpressionConstraint)theEObject;
				T result = caseExpressionConstraint(expressionConstraint);
				if (result == null) result = caseRangeConstraint(expressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EXPRESSIONS_TYPE: {
				ExpressionsType expressionsType = (ExpressionsType)theEObject;
				T result = caseExpressionsType(expressionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EXTERNAL_DATA_TYPE: {
				ExternalDataType externalDataType = (ExternalDataType)theEObject;
				T result = caseExternalDataType(externalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.FIRE_EVENT_ACTION: {
				FireEventAction fireEventAction = (FireEventAction)theEObject;
				T result = caseFireEventAction(fireEventAction);
				if (result == null) result = caseAtomicAction(fireEventAction);
				if (result == null) result = caseActionBase(fireEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.FOCUS_TYPE: {
				FocusType focusType = (FocusType)theEObject;
				T result = caseFocusType(focusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.FORMATTED_NUMBER: {
				FormattedNumber formattedNumber = (FormattedNumber)theEObject;
				T result = caseFormattedNumber(formattedNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.FORMATTED_TEXT: {
				FormattedText formattedText = (FormattedText)theEObject;
				T result = caseFormattedText(formattedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR: {
				GroupOrganizationBehavior groupOrganizationBehavior = (GroupOrganizationBehavior)theEObject;
				T result = caseGroupOrganizationBehavior(groupOrganizationBehavior);
				if (result == null) result = caseBehavior(groupOrganizationBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.GROUP_SELECTION_BEHAVIOR: {
				GroupSelectionBehavior groupSelectionBehavior = (GroupSelectionBehavior)theEObject;
				T result = caseGroupSelectionBehavior(groupSelectionBehavior);
				if (result == null) result = caseBehavior(groupSelectionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IDENTIFIERS_TYPE: {
				IdentifiersType identifiersType = (IdentifiersType)theEObject;
				T result = caseIdentifiersType(identifiersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IDENTIFIERS_TYPE1: {
				IdentifiersType1 identifiersType1 = (IdentifiersType1)theEObject;
				T result = caseIdentifiersType1(identifiersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IDENTIFIERS_TYPE2: {
				IdentifiersType2 identifiersType2 = (IdentifiersType2)theEObject;
				T result = caseIdentifiersType2(identifiersType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.INITIAL_ARTIFACT_TYPE: {
				InitialArtifactType initialArtifactType = (InitialArtifactType)theEObject;
				T result = caseInitialArtifactType(initialArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.INLINE_RESOURCE: {
				InlineResource inlineResource = (InlineResource)theEObject;
				T result = caseInlineResource(inlineResource);
				if (result == null) result = caseKnowledgeResource(inlineResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ITEM_CODES_TYPE: {
				ItemCodesType itemCodesType = (ItemCodesType)theEObject;
				T result = caseItemCodesType(itemCodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ITEM_DEFINITION: {
				ItemDefinition itemDefinition = (ItemDefinition)theEObject;
				T result = caseItemDefinition(itemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.KEY_TERMS_TYPE: {
				KeyTermsType keyTermsType = (KeyTermsType)theEObject;
				T result = caseKeyTermsType(keyTermsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.KNOWLEDGE_DOCUMENT: {
				KnowledgeDocument knowledgeDocument = (KnowledgeDocument)theEObject;
				T result = caseKnowledgeDocument(knowledgeDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.KNOWLEDGE_RESOURCE: {
				KnowledgeResource knowledgeResource = (KnowledgeResource)theEObject;
				T result = caseKnowledgeResource(knowledgeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.LIBRARIES_TYPE: {
				LibrariesType librariesType = (LibrariesType)theEObject;
				T result = caseLibrariesType(librariesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.LIBRARY_REFERENCE: {
				LibraryReference libraryReference = (LibraryReference)theEObject;
				T result = caseLibraryReference(libraryReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.LOOKUP_CONSTRAINT: {
				LookupConstraint lookupConstraint = (LookupConstraint)theEObject;
				T result = caseLookupConstraint(lookupConstraint);
				if (result == null) result = caseRangeConstraint(lookupConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.MANIFEST: {
				Manifest manifest = (Manifest)theEObject;
				T result = caseManifest(manifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.MAPPING_TYPE: {
				MappingType mappingType = (MappingType)theEObject;
				T result = caseMappingType(mappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.MASK_CONSTRAINT: {
				MaskConstraint maskConstraint = (MaskConstraint)theEObject;
				T result = caseMaskConstraint(maskConstraint);
				if (result == null) result = caseRangeConstraint(maskConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.METADATA_BINDING: {
				MetadataBinding metadataBinding = (MetadataBinding)theEObject;
				T result = caseMetadataBinding(metadataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.NAMED_EVENT_DEF: {
				NamedEventDef namedEventDef = (NamedEventDef)theEObject;
				T result = caseNamedEventDef(namedEventDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.NAMED_EVENT_TRIGGER: {
				NamedEventTrigger namedEventTrigger = (NamedEventTrigger)theEObject;
				T result = caseNamedEventTrigger(namedEventTrigger);
				if (result == null) result = caseTrigger(namedEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseParty(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PERIODIC_EVENT_TRIGGER: {
				PeriodicEventTrigger periodicEventTrigger = (PeriodicEventTrigger)theEObject;
				T result = casePeriodicEventTrigger(periodicEventTrigger);
				if (result == null) result = caseTrigger(periodicEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PERMISSIONS_TYPE: {
				PermissionsType permissionsType = (PermissionsType)theEObject;
				T result = casePermissionsType(permissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseParty(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PRECHECK_BEHAVIOR: {
				PrecheckBehavior precheckBehavior = (PrecheckBehavior)theEObject;
				T result = casePrecheckBehavior(precheckBehavior);
				if (result == null) result = caseBehavior(precheckBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PUBLISHERS_TYPE: {
				PublishersType publishersType = (PublishersType)theEObject;
				T result = casePublishersType(publishersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RANGE_CONSTRAINT: {
				RangeConstraint rangeConstraint = (RangeConstraint)theEObject;
				T result = caseRangeConstraint(rangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.READ_ONLY_BEHAVIOR: {
				ReadOnlyBehavior readOnlyBehavior = (ReadOnlyBehavior)theEObject;
				T result = caseReadOnlyBehavior(readOnlyBehavior);
				if (result == null) result = caseBehavior(readOnlyBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REFERENCED_MODEL_TYPE: {
				ReferencedModelType referencedModelType = (ReferencedModelType)theEObject;
				T result = caseReferencedModelType(referencedModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REFERENCE_LIST: {
				ReferenceList referenceList = (ReferenceList)theEObject;
				T result = caseReferenceList(referenceList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RELATED_RESOURCES_TYPE: {
				RelatedResourcesType relatedResourcesType = (RelatedResourcesType)theEObject;
				T result = caseRelatedResourcesType(relatedResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REMOVE_ACTION: {
				RemoveAction removeAction = (RemoveAction)theEObject;
				T result = caseRemoveAction(removeAction);
				if (result == null) result = caseAtomicAction(removeAction);
				if (result == null) result = caseActionBase(removeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REPRESENTED_CONCEPTS_TYPE: {
				RepresentedConceptsType representedConceptsType = (RepresentedConceptsType)theEObject;
				T result = caseRepresentedConceptsType(representedConceptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REQUIRED_BEHAVIOR: {
				RequiredBehavior requiredBehavior = (RequiredBehavior)theEObject;
				T result = caseRequiredBehavior(requiredBehavior);
				if (result == null) result = caseBehavior(requiredBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE: {
				ResourceRelationshipReference resourceRelationshipReference = (ResourceRelationshipReference)theEObject;
				T result = caseResourceRelationshipReference(resourceRelationshipReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RESOURCES_TYPE: {
				ResourcesType resourcesType = (ResourcesType)theEObject;
				T result = caseResourcesType(resourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RESPONSE_BINDING: {
				ResponseBinding responseBinding = (ResponseBinding)theEObject;
				T result = caseResponseBinding(responseBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RESPONSE_CARDINALITY_TYPE: {
				ResponseCardinalityType responseCardinalityType = (ResponseCardinalityType)theEObject;
				T result = caseResponseCardinalityType(responseCardinalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RESPONSE_DATA_TYPE_TYPE: {
				ResponseDataTypeType responseDataTypeType = (ResponseDataTypeType)theEObject;
				T result = caseResponseDataTypeType(responseDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RIGHTS_DECLARATION: {
				RightsDeclaration rightsDeclaration = (RightsDeclaration)theEObject;
				T result = caseRightsDeclaration(rightsDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.SPECIFIC_EVENT_BINDING: {
				SpecificEventBinding specificEventBinding = (SpecificEventBinding)theEObject;
				T result = caseSpecificEventBinding(specificEventBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.SPECIFIC_METADATA_BINDING: {
				SpecificMetadataBinding specificMetadataBinding = (SpecificMetadataBinding)theEObject;
				T result = caseSpecificMetadataBinding(specificMetadataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.SUB_ELEMENTS_TYPE: {
				SubElementsType subElementsType = (SubElementsType)theEObject;
				T result = caseSubElementsType(subElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.SUPPORTING_EVIDENCE: {
				SupportingEvidence supportingEvidence = (SupportingEvidence)theEObject;
				T result = caseSupportingEvidence(supportingEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.SUPPORTING_RESOURCE: {
				SupportingResource supportingResource = (SupportingResource)theEObject;
				T result = caseSupportingResource(supportingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TEMPLATE_IDS_TYPE: {
				TemplateIdsType templateIdsType = (TemplateIdsType)theEObject;
				T result = caseTemplateIdsType(templateIdsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TEMPLATE_IDS_TYPE1: {
				TemplateIdsType1 templateIdsType1 = (TemplateIdsType1)theEObject;
				T result = caseTemplateIdsType1(templateIdsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TRIGGER_BINDINGS: {
				TriggerBindings triggerBindings = (TriggerBindings)theEObject;
				T result = caseTriggerBindings(triggerBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TRIGGERS: {
				Triggers triggers = (Triggers)theEObject;
				T result = caseTriggers(triggers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.UPDATE_ACTION: {
				UpdateAction updateAction = (UpdateAction)theEObject;
				T result = caseUpdateAction(updateAction);
				if (result == null) result = caseAtomicAction(updateAction);
				if (result == null) result = caseActionBase(updateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.URL_TYPE: {
				UrlType urlType = (UrlType)theEObject;
				T result = caseUrlType(urlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.USAGE_TERMS_TYPE: {
				UsageTermsType usageTermsType = (UsageTermsType)theEObject;
				T result = caseUsageTermsType(usageTermsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.UUID_TYPE: {
				UuidType uuidType = (UuidType)theEObject;
				T result = caseUuidType(uuidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.VALUE_SET_CONSTRAINT: {
				ValueSetConstraint valueSetConstraint = (ValueSetConstraint)theEObject;
				T result = caseValueSetConstraint(valueSetConstraint);
				if (result == null) result = caseRangeConstraint(valueSetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.VERSIONED_IDENTIFIER: {
				VersionedIdentifier versionedIdentifier = (VersionedIdentifier)theEObject;
				T result = caseVersionedIdentifier(versionedIdentifier);
				if (result == null) result = caseII(versionedIdentifier);
				if (result == null) result = caseANY(versionedIdentifier);
				if (result == null) result = caseHXIT(versionedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.VISUAL_STYLE_BEHAVIOR: {
				VisualStyleBehavior visualStyleBehavior = (VisualStyleBehavior)theEObject;
				T result = caseVisualStyleBehavior(visualStyleBehavior);
				if (result == null) result = caseBehavior(visualStyleBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.WRAPPED_CONTENT: {
				WrappedContent wrappedContent = (WrappedContent)theEObject;
				T result = caseWrappedContent(wrappedContent);
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
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactSummary(ArtifactSummary object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Type Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Type Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactTypeType1(ArtifactTypeType1 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Binding Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingModelType(BindingModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Model Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Model Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingModelType1(BindingModelType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingNameType(BindingNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingType(BindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingTypeType(BindingTypeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletion(Completion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Event Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentEventBinding(ComponentEventBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Event Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Event Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentEventMappings(ComponentEventMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contained Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedArtifact(ContainedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained Artifact List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained Artifact List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedArtifactList(ContainedArtifactList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Hash Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Hash Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentHashType(ContentHashType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Signifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Signifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentSignifier(ContentSignifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Control Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlBlock(ControlBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlling Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlling Artifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllingArtifactType(ControllingArtifactType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBinding(EventBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Binding Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Binding Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBindingTypeType(EventBindingTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefType(EventDefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventNameType(EventNameType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Identifiers Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiers Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiersType2(IdentifiersType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Artifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialArtifactType(InitialArtifactType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest(Manifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingType(MappingType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataBinding(MetadataBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Event Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Event Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEventDef(NamedEventDef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType(NameType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reference List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceList(ReferenceList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Specific Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Event Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificEventBinding(SpecificEventBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Metadata Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Metadata Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificMetadataBinding(SpecificMetadataBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerBindings(TriggerBindings object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlType(UrlType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuidType(UuidType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Wrapped Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapped Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappedContent(WrappedContent object) {
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

} //R2Switch
