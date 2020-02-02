/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.cdsdt.r2.R2Package;

import org.hl7.cdsdt.r2.impl.R2PackageImpl;

import org.hl7.knowledgeartifact.r1.ActionBase;
import org.hl7.knowledgeartifact.r1.ActionGroup;
import org.hl7.knowledgeartifact.r1.ActionRef;
import org.hl7.knowledgeartifact.r1.Actor;
import org.hl7.knowledgeartifact.r1.ActorsType;
import org.hl7.knowledgeartifact.r1.AddressesType;
import org.hl7.knowledgeartifact.r1.ApplicabilityType;
import org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent;
import org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType;
import org.hl7.knowledgeartifact.r1.ArtifactStatusType;
import org.hl7.knowledgeartifact.r1.ArtifactType;
import org.hl7.knowledgeartifact.r1.ArtifactTypeType;
import org.hl7.knowledgeartifact.r1.AtomicAction;
import org.hl7.knowledgeartifact.r1.Behavior;
import org.hl7.knowledgeartifact.r1.Behaviors;
import org.hl7.knowledgeartifact.r1.Cardinality;
import org.hl7.knowledgeartifact.r1.CardinalityBehavior;
import org.hl7.knowledgeartifact.r1.CardinalityBehaviorType;
import org.hl7.knowledgeartifact.r1.CategoriesType;
import org.hl7.knowledgeartifact.r1.CodesType;
import org.hl7.knowledgeartifact.r1.CollectInformationAction;
import org.hl7.knowledgeartifact.r1.CompondArtifactType;
import org.hl7.knowledgeartifact.r1.Condition;
import org.hl7.knowledgeartifact.r1.ConditionRoleType;
import org.hl7.knowledgeartifact.r1.ConditionRoleType1;
import org.hl7.knowledgeartifact.r1.Conditions;
import org.hl7.knowledgeartifact.r1.ConstraintTypeType;
import org.hl7.knowledgeartifact.r1.ContactsType;
import org.hl7.knowledgeartifact.r1.ContentType;
import org.hl7.knowledgeartifact.r1.Contribution;
import org.hl7.knowledgeartifact.r1.ContributionsType;
import org.hl7.knowledgeartifact.r1.ContributorType;
import org.hl7.knowledgeartifact.r1.Coverage;
import org.hl7.knowledgeartifact.r1.CoverageType;
import org.hl7.knowledgeartifact.r1.CreateAction;
import org.hl7.knowledgeartifact.r1.DataEventTrigger;
import org.hl7.knowledgeartifact.r1.DataEventType;
import org.hl7.knowledgeartifact.r1.DataModelsType;
import org.hl7.knowledgeartifact.r1.DeclareResponseAction;
import org.hl7.knowledgeartifact.r1.DocumentRoot;
import org.hl7.knowledgeartifact.r1.DocumentationItem;
import org.hl7.knowledgeartifact.r1.EnumerationConstraint;
import org.hl7.knowledgeartifact.r1.EnumerationItem;
import org.hl7.knowledgeartifact.r1.EventHistoryType;
import org.hl7.knowledgeartifact.r1.EventType;
import org.hl7.knowledgeartifact.r1.EventTypeType;
import org.hl7.knowledgeartifact.r1.Evidence;
import org.hl7.knowledgeartifact.r1.ExpressionConstraint;
import org.hl7.knowledgeartifact.r1.ExpressionsType;
import org.hl7.knowledgeartifact.r1.ExternalDataType;
import org.hl7.knowledgeartifact.r1.FireEventAction;
import org.hl7.knowledgeartifact.r1.FocusType;
import org.hl7.knowledgeartifact.r1.FormattedNumber;
import org.hl7.knowledgeartifact.r1.FormattedText;
import org.hl7.knowledgeartifact.r1.GroupOrganizationBehavior;
import org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType;
import org.hl7.knowledgeartifact.r1.GroupSelectionBehavior;
import org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType;
import org.hl7.knowledgeartifact.r1.IdentifiersType;
import org.hl7.knowledgeartifact.r1.IdentifiersType1;
import org.hl7.knowledgeartifact.r1.InlineResource;
import org.hl7.knowledgeartifact.r1.ItemCodesType;
import org.hl7.knowledgeartifact.r1.ItemDefinition;
import org.hl7.knowledgeartifact.r1.KeyTermsType;
import org.hl7.knowledgeartifact.r1.KnowledgeDocument;
import org.hl7.knowledgeartifact.r1.KnowledgeResource;
import org.hl7.knowledgeartifact.r1.LibrariesType;
import org.hl7.knowledgeartifact.r1.LibraryReference;
import org.hl7.knowledgeartifact.r1.LookupConstraint;
import org.hl7.knowledgeartifact.r1.MaskConstraint;
import org.hl7.knowledgeartifact.r1.Metadata;
import org.hl7.knowledgeartifact.r1.ModelReference;
import org.hl7.knowledgeartifact.r1.NamedEventTrigger;
import org.hl7.knowledgeartifact.r1.Organization;
import org.hl7.knowledgeartifact.r1.Party;
import org.hl7.knowledgeartifact.r1.PeriodicEventTrigger;
import org.hl7.knowledgeartifact.r1.PermissionsType;
import org.hl7.knowledgeartifact.r1.Person;
import org.hl7.knowledgeartifact.r1.PrecheckBehavior;
import org.hl7.knowledgeartifact.r1.PrecheckBehaviorType;
import org.hl7.knowledgeartifact.r1.PublishersType;
import org.hl7.knowledgeartifact.r1.R1Factory;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RangeConstraint;
import org.hl7.knowledgeartifact.r1.RangeConstraintType;
import org.hl7.knowledgeartifact.r1.ReadOnlyBehavior;
import org.hl7.knowledgeartifact.r1.ReferencedModelType;
import org.hl7.knowledgeartifact.r1.RelatedResourcesType;
import org.hl7.knowledgeartifact.r1.RelationshipType;
import org.hl7.knowledgeartifact.r1.RemoveAction;
import org.hl7.knowledgeartifact.r1.RepresentedConceptsType;
import org.hl7.knowledgeartifact.r1.RequiredBehavior;
import org.hl7.knowledgeartifact.r1.RequiredBehaviorType;
import org.hl7.knowledgeartifact.r1.ResourceRelationshipReference;
import org.hl7.knowledgeartifact.r1.ResourceRelationshipType;
import org.hl7.knowledgeartifact.r1.ResourcesType;
import org.hl7.knowledgeartifact.r1.ResponseBinding;
import org.hl7.knowledgeartifact.r1.ResponseCardinalityType;
import org.hl7.knowledgeartifact.r1.ResponseDataTypeType;
import org.hl7.knowledgeartifact.r1.RightsDeclaration;
import org.hl7.knowledgeartifact.r1.RoleType;
import org.hl7.knowledgeartifact.r1.StatusType;
import org.hl7.knowledgeartifact.r1.SubElementsType;
import org.hl7.knowledgeartifact.r1.SupportingEvidence;
import org.hl7.knowledgeartifact.r1.SupportingResource;
import org.hl7.knowledgeartifact.r1.TemplateIdsType;
import org.hl7.knowledgeartifact.r1.TemplateIdsType1;
import org.hl7.knowledgeartifact.r1.Trigger;
import org.hl7.knowledgeartifact.r1.Triggers;
import org.hl7.knowledgeartifact.r1.UpdateAction;
import org.hl7.knowledgeartifact.r1.UsageTermsType;
import org.hl7.knowledgeartifact.r1.ValueSetConstraint;
import org.hl7.knowledgeartifact.r1.ValueType;
import org.hl7.knowledgeartifact.r1.VersionedIdentifier;
import org.hl7.knowledgeartifact.r1.VisualStyleBehavior;

import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R1PackageImpl extends EPackageImpl implements R1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactLifeCycleEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectInformationActionEClass = null;

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
	private EClass conditionRoleType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionsTypeEClass = null;

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
	private EClass createActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareResponseActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHistoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fireEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass focusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formattedNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formattedTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupOrganizationBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupSelectionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiersType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemCodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyTermsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass librariesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEventTriggerEClass = null;

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
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeEClass = null;

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
	private EClass precheckBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readOnlyBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representedConceptsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRelationshipReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseCardinalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightsDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateIdsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateIdsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageTermsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualStyleBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactLifeCycleEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compondArtifactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupOrganizationBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupSelectionBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum precheckBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeConstraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requiredBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactLifeCycleEventTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compondArtifactTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conditionRoleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contributorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coverageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataEventTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType groupOrganizationBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType groupSelectionBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType precheckBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rangeConstraintTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requiredBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceRelationshipTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeObjectEDataType = null;

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
	 * @see org.hl7.knowledgeartifact.r1.R1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private R1PackageImpl() {
		super(eNS_URI, R1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link R1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static R1Package init() {
		if (isInited) return (R1Package)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI);

		// Obtain or create and register package
		R1PackageImpl theR1Package = (R1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof R1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new R1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		R2PackageImpl theR2Package = (R2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI) instanceof R2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI) : R2Package.eINSTANCE);
		org.hl7.elm.r1.impl.R1PackageImpl theR1Package_1 = (org.hl7.elm.r1.impl.R1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.hl7.elm.r1.R1Package.eNS_URI) instanceof org.hl7.elm.r1.impl.R1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.hl7.elm.r1.R1Package.eNS_URI) : org.hl7.elm.r1.R1Package.eINSTANCE);

		// Load packages
		theR1Package_1.loadPackage();

		// Create package meta-data objects
		theR1Package.createPackageContents();
		theR2Package.createPackageContents();

		// Initialize created meta-data
		theR1Package.initializePackageContents();
		theR2Package.initializePackageContents();

		// Fix loaded packages
		theR1Package_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theR1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(R1Package.eNS_URI, theR1Package);
		return theR1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBase() {
		return actionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_ActionId() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Number() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_SupportingEvidence() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_SupportingResources() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Actors() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Behaviors() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Conditions() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBase_Order() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionGroup() {
		return actionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Title() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Description() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_RepresentedConcepts() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_SubElements() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRef() {
		return actionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRef_LibraryName() {
		return (EAttribute)actionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRef_ReferencedActionId() {
		return (EAttribute)actionRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Actor() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorsType() {
		return actorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorsType_Actor() {
		return (EReference)actorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressesType() {
		return addressesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressesType_Address() {
		return (EReference)addressesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicabilityType() {
		return applicabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicabilityType_Coverage() {
		return (EReference)applicabilityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactLifeCycleEvent() {
		return artifactLifeCycleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactLifeCycleEvent_EventType() {
		return (EReference)artifactLifeCycleEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactLifeCycleEvent_EventDateTime() {
		return (EReference)artifactLifeCycleEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactTypeType() {
		return artifactTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeType_Value() {
		return (EAttribute)artifactTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicAction() {
		return atomicActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicAction_TextEquivalent() {
		return (EReference)atomicActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Value() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviors() {
		return behaviorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviors_Behavior() {
		return (EReference)behaviorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityBehavior() {
		return cardinalityBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoriesType() {
		return categoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoriesType_Category() {
		return (EReference)categoriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodesType() {
		return codesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodesType_Code() {
		return (EReference)codesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectInformationAction() {
		return collectInformationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_DocumentationConcept() {
		return (EReference)collectInformationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_InitialValue() {
		return (EReference)collectInformationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_ResponseBinding() {
		return (EReference)collectInformationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Logic() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionRole() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionRoleType1() {
		return conditionRoleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionRoleType1_Value() {
		return (EAttribute)conditionRoleType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditions() {
		return conditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditions_Condition() {
		return (EReference)conditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintTypeType() {
		return constraintTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintTypeType_Value() {
		return (EAttribute)constraintTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactsType() {
		return contactsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactsType_Contact() {
		return (EReference)contactsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType() {
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Div() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Contributor() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Role() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributionsType() {
		return contributionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionsType_Contribution() {
		return (EReference)contributionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Focus() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Description() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Value() {
		return (EReference)coverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAction() {
		return createActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateAction_ActionSentence() {
		return (EReference)createActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEventTrigger() {
		return dataEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEventTrigger_TriggerType() {
		return (EAttribute)dataEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModelsType() {
		return dataModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModelsType_ModelReference() {
		return (EReference)dataModelsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareResponseAction() {
		return declareResponseActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareResponseAction_Name() {
		return (EAttribute)declareResponseActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationItem() {
		return documentationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_Prompt() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_AdditionalInstructions() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_TextAfterResponse() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_Description() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ItemCodes() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseDataType() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseCardinality() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseRange() {
		return (EReference)documentationItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KnowledgeDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationConstraint() {
		return enumerationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationConstraint_Item() {
		return (EReference)enumerationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationConstraint_StrictSelection() {
		return (EAttribute)enumerationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationItem() {
		return enumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Identifier() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Number() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Value() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Codes() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_DisplayText() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_AdditionalInstructions() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_ValueMeaning() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationItem_FillIn() {
		return (EAttribute)enumerationItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHistoryType() {
		return eventHistoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHistoryType_ArtifactLifeCycleEvent() {
		return (EReference)eventHistoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTypeType() {
		return eventTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTypeType_Value() {
		return (EAttribute)eventTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_QualityOfEvidence() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_StrengthOfRecommendation() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_Resources() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionConstraint() {
		return expressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionConstraint_Constraint() {
		return (EReference)expressionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionsType() {
		return expressionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionsType_Def() {
		return (EReference)expressionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataType() {
		return externalDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Codesystem() {
		return (EReference)externalDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Valueset() {
		return (EReference)externalDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Parameter() {
		return (EReference)externalDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Def() {
		return (EReference)externalDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Trigger() {
		return (EReference)externalDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFireEventAction() {
		return fireEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFireEventAction_EventType() {
		return (EAttribute)fireEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFireEventAction_ActionSentence() {
		return (EReference)fireEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFocusType() {
		return focusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocusType_Value() {
		return (EAttribute)focusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattedNumber() {
		return formattedNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Label() {
		return (EAttribute)formattedNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Style() {
		return (EAttribute)formattedNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Value() {
		return (EAttribute)formattedNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattedText() {
		return formattedTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Label() {
		return (EAttribute)formattedTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Style() {
		return (EAttribute)formattedTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Value() {
		return (EAttribute)formattedTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupOrganizationBehavior() {
		return groupOrganizationBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupSelectionBehavior() {
		return groupSelectionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiersType() {
		return identifiersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiersType_Identifier() {
		return (EReference)identifiersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiersType1() {
		return identifiersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiersType1_Identifier() {
		return (EReference)identifiersType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineResource() {
		return inlineResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineResource_Content() {
		return (EReference)inlineResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemCodesType() {
		return itemCodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemCodesType_ItemCode() {
		return (EReference)itemCodesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemDefinition() {
		return itemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_Identifier() {
		return (EReference)itemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_ScopedIdentifier() {
		return (EReference)itemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyTermsType() {
		return keyTermsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyTermsType_Term() {
		return (EReference)keyTermsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeDocument() {
		return knowledgeDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Metadata() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_ExternalData() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Expressions() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Triggers() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Conditions() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Behaviors() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_ActionGroup() {
		return (EReference)knowledgeDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeResource() {
		return knowledgeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Identifiers() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_TemplateIds() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Title() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Location() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Description() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Citation() {
		return (EReference)knowledgeResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrariesType() {
		return librariesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrariesType_LibraryReference() {
		return (EReference)librariesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryReference() {
		return libraryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_MediaType() {
		return (EAttribute)libraryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Name() {
		return (EAttribute)libraryReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Path() {
		return (EAttribute)libraryReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Version() {
		return (EAttribute)libraryReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupConstraint() {
		return lookupConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupConstraint_Items() {
		return (EReference)lookupConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupConstraint_DisplayField() {
		return (EAttribute)lookupConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupConstraint_StrictSelection() {
		return (EAttribute)lookupConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskConstraint() {
		return maskConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskConstraint_MaskExpression() {
		return (EReference)maskConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskConstraint_MaskHelp() {
		return (EReference)maskConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Identifiers() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_ArtifactType() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_SchemaIdentifier() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_TemplateIds() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_DataModels() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Libraries() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Title() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Description() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Documentation() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_RelatedResources() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_SupportingEvidence() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Applicability() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_KeyTerms() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Categories() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Language() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Status() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_EventHistory() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Contributions() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Publishers() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_UsageTerms() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Description() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_ReferencedModel() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedEventTrigger() {
		return namedEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedEventTrigger_Name() {
		return (EAttribute)namedEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Name() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Addresses() {
		return (EReference)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Contacts() {
		return (EReference)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicEventTrigger() {
		return periodicEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissionsType() {
		return permissionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissionsType_Permissions() {
		return (EReference)permissionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Affiliation() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecheckBehavior() {
		return precheckBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishersType() {
		return publishersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishersType_Publisher() {
		return (EReference)publishersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeConstraint() {
		return rangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConstraint_ConstraintType() {
		return (EReference)rangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadOnlyBehavior() {
		return readOnlyBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedModelType() {
		return referencedModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencedModelType_Value() {
		return (EAttribute)referencedModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedResourcesType() {
		return relatedResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedResourcesType_RelatedResource() {
		return (EReference)relatedResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Value() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAction() {
		return removeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveAction_ActionSentence() {
		return (EReference)removeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentedConceptsType() {
		return representedConceptsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentedConceptsType_Concept() {
		return (EReference)representedConceptsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBehavior() {
		return requiredBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRelationshipReference() {
		return resourceRelationshipReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRelationshipReference_Relationship() {
		return (EReference)resourceRelationshipReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRelationshipReference_Resources() {
		return (EReference)resourceRelationshipReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesType() {
		return resourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesType_Resource() {
		return (EReference)resourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBinding() {
		return responseBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBinding_Container() {
		return (EAttribute)responseBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBinding_Property() {
		return (EAttribute)responseBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseCardinalityType() {
		return responseCardinalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseCardinalityType_Value() {
		return (EAttribute)responseCardinalityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDataTypeType() {
		return responseDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseDataTypeType_Value() {
		return (EAttribute)responseDataTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightsDeclaration() {
		return rightsDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_AssertedRights() {
		return (EReference)rightsDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_RightsHolder() {
		return (EReference)rightsDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_Permissions() {
		return (EReference)rightsDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Value() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusType() {
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_Value() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubElementsType() {
		return subElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubElementsType_Group() {
		return (EAttribute)subElementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_SimpleAction() {
		return (EReference)subElementsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_ActionGroup() {
		return (EReference)subElementsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_ActionRef() {
		return (EReference)subElementsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingEvidence() {
		return supportingEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportingEvidence_Evidence() {
		return (EReference)supportingEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingResource() {
		return supportingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportingResource_Resource() {
		return (EReference)supportingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateIdsType() {
		return templateIdsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateIdsType_TemplateId() {
		return (EReference)templateIdsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateIdsType1() {
		return templateIdsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateIdsType1_TemplateId() {
		return (EReference)templateIdsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Def() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Identifiers() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_TextEquivalent() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggers() {
		return triggersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggers_Trigger() {
		return (EReference)triggersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAction() {
		return updateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAction_ActionSentence() {
		return (EReference)updateActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageTermsType() {
		return usageTermsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageTermsType_RightsDeclaration() {
		return (EReference)usageTermsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConstraint_ValueSet() {
		return (EReference)valueSetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedIdentifier() {
		return versionedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedIdentifier_Version() {
		return (EAttribute)versionedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualStyleBehavior() {
		return visualStyleBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactLifeCycleEventType() {
		return artifactLifeCycleEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactStatusType() {
		return artifactStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactType() {
		return artifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalityBehaviorType() {
		return cardinalityBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompondArtifactType() {
		return compondArtifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionRoleType() {
		return conditionRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributorType() {
		return contributorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoverageType() {
		return coverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEventType() {
		return dataEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupOrganizationBehaviorType() {
		return groupOrganizationBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupSelectionBehaviorType() {
		return groupSelectionBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrecheckBehaviorType() {
		return precheckBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeConstraintType() {
		return rangeConstraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequiredBehaviorType() {
		return requiredBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceRelationshipType() {
		return resourceRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueType() {
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactLifeCycleEventTypeObject() {
		return artifactLifeCycleEventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactStatusTypeObject() {
		return artifactStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactTypeObject() {
		return artifactTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityBehaviorTypeObject() {
		return cardinalityBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityObject() {
		return cardinalityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompondArtifactTypeObject() {
		return compondArtifactTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionRoleTypeObject() {
		return conditionRoleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContributorTypeObject() {
		return contributorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoverageTypeObject() {
		return coverageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataEventTypeObject() {
		return dataEventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeObject() {
		return eventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupOrganizationBehaviorTypeObject() {
		return groupOrganizationBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupSelectionBehaviorTypeObject() {
		return groupSelectionBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrecheckBehaviorTypeObject() {
		return precheckBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRangeConstraintTypeObject() {
		return rangeConstraintTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequiredBehaviorTypeObject() {
		return requiredBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceRelationshipTypeObject() {
		return resourceRelationshipTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeObject() {
		return valueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Factory getR1Factory() {
		return (R1Factory)getEFactoryInstance();
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

		// Create classes and their features
		actionBaseEClass = createEClass(ACTION_BASE);
		createEReference(actionBaseEClass, ACTION_BASE__ACTION_ID);
		createEReference(actionBaseEClass, ACTION_BASE__NUMBER);
		createEReference(actionBaseEClass, ACTION_BASE__SUPPORTING_EVIDENCE);
		createEReference(actionBaseEClass, ACTION_BASE__SUPPORTING_RESOURCES);
		createEReference(actionBaseEClass, ACTION_BASE__ACTORS);
		createEReference(actionBaseEClass, ACTION_BASE__BEHAVIORS);
		createEReference(actionBaseEClass, ACTION_BASE__CONDITIONS);
		createEAttribute(actionBaseEClass, ACTION_BASE__ORDER);

		actionGroupEClass = createEClass(ACTION_GROUP);
		createEReference(actionGroupEClass, ACTION_GROUP__TITLE);
		createEReference(actionGroupEClass, ACTION_GROUP__DESCRIPTION);
		createEReference(actionGroupEClass, ACTION_GROUP__REPRESENTED_CONCEPTS);
		createEReference(actionGroupEClass, ACTION_GROUP__SUB_ELEMENTS);

		actionRefEClass = createEClass(ACTION_REF);
		createEAttribute(actionRefEClass, ACTION_REF__LIBRARY_NAME);
		createEAttribute(actionRefEClass, ACTION_REF__REFERENCED_ACTION_ID);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ACTOR);

		actorsTypeEClass = createEClass(ACTORS_TYPE);
		createEReference(actorsTypeEClass, ACTORS_TYPE__ACTOR);

		addressesTypeEClass = createEClass(ADDRESSES_TYPE);
		createEReference(addressesTypeEClass, ADDRESSES_TYPE__ADDRESS);

		applicabilityTypeEClass = createEClass(APPLICABILITY_TYPE);
		createEReference(applicabilityTypeEClass, APPLICABILITY_TYPE__COVERAGE);

		artifactLifeCycleEventEClass = createEClass(ARTIFACT_LIFE_CYCLE_EVENT);
		createEReference(artifactLifeCycleEventEClass, ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE);
		createEReference(artifactLifeCycleEventEClass, ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME);

		artifactTypeTypeEClass = createEClass(ARTIFACT_TYPE_TYPE);
		createEAttribute(artifactTypeTypeEClass, ARTIFACT_TYPE_TYPE__VALUE);

		atomicActionEClass = createEClass(ATOMIC_ACTION);
		createEReference(atomicActionEClass, ATOMIC_ACTION__TEXT_EQUIVALENT);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__VALUE);

		behaviorsEClass = createEClass(BEHAVIORS);
		createEReference(behaviorsEClass, BEHAVIORS__BEHAVIOR);

		cardinalityBehaviorEClass = createEClass(CARDINALITY_BEHAVIOR);

		categoriesTypeEClass = createEClass(CATEGORIES_TYPE);
		createEReference(categoriesTypeEClass, CATEGORIES_TYPE__CATEGORY);

		codesTypeEClass = createEClass(CODES_TYPE);
		createEReference(codesTypeEClass, CODES_TYPE__CODE);

		collectInformationActionEClass = createEClass(COLLECT_INFORMATION_ACTION);
		createEReference(collectInformationActionEClass, COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT);
		createEReference(collectInformationActionEClass, COLLECT_INFORMATION_ACTION__INITIAL_VALUE);
		createEReference(collectInformationActionEClass, COLLECT_INFORMATION_ACTION__RESPONSE_BINDING);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__LOGIC);
		createEReference(conditionEClass, CONDITION__CONDITION_ROLE);

		conditionRoleType1EClass = createEClass(CONDITION_ROLE_TYPE1);
		createEAttribute(conditionRoleType1EClass, CONDITION_ROLE_TYPE1__VALUE);

		conditionsEClass = createEClass(CONDITIONS);
		createEReference(conditionsEClass, CONDITIONS__CONDITION);

		constraintTypeTypeEClass = createEClass(CONSTRAINT_TYPE_TYPE);
		createEAttribute(constraintTypeTypeEClass, CONSTRAINT_TYPE_TYPE__VALUE);

		contactsTypeEClass = createEClass(CONTACTS_TYPE);
		createEReference(contactsTypeEClass, CONTACTS_TYPE__CONTACT);

		contentTypeEClass = createEClass(CONTENT_TYPE);
		createEReference(contentTypeEClass, CONTENT_TYPE__DIV);

		contributionEClass = createEClass(CONTRIBUTION);
		createEReference(contributionEClass, CONTRIBUTION__CONTRIBUTOR);
		createEReference(contributionEClass, CONTRIBUTION__ROLE);

		contributionsTypeEClass = createEClass(CONTRIBUTIONS_TYPE);
		createEReference(contributionsTypeEClass, CONTRIBUTIONS_TYPE__CONTRIBUTION);

		coverageEClass = createEClass(COVERAGE);
		createEReference(coverageEClass, COVERAGE__FOCUS);
		createEReference(coverageEClass, COVERAGE__DESCRIPTION);
		createEReference(coverageEClass, COVERAGE__VALUE);

		createActionEClass = createEClass(CREATE_ACTION);
		createEReference(createActionEClass, CREATE_ACTION__ACTION_SENTENCE);

		dataEventTriggerEClass = createEClass(DATA_EVENT_TRIGGER);
		createEAttribute(dataEventTriggerEClass, DATA_EVENT_TRIGGER__TRIGGER_TYPE);

		dataModelsTypeEClass = createEClass(DATA_MODELS_TYPE);
		createEReference(dataModelsTypeEClass, DATA_MODELS_TYPE__MODEL_REFERENCE);

		declareResponseActionEClass = createEClass(DECLARE_RESPONSE_ACTION);
		createEAttribute(declareResponseActionEClass, DECLARE_RESPONSE_ACTION__NAME);

		documentationItemEClass = createEClass(DOCUMENTATION_ITEM);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__PROMPT);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__DESCRIPTION);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__ITEM_CODES);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__RESPONSE_CARDINALITY);
		createEReference(documentationItemEClass, DOCUMENTATION_ITEM__RESPONSE_RANGE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KNOWLEDGE_DOCUMENT);

		enumerationConstraintEClass = createEClass(ENUMERATION_CONSTRAINT);
		createEReference(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__ITEM);
		createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__STRICT_SELECTION);

		enumerationItemEClass = createEClass(ENUMERATION_ITEM);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__IDENTIFIER);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__NUMBER);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__VALUE);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__CODES);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__DISPLAY_TEXT);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__VALUE_MEANING);
		createEAttribute(enumerationItemEClass, ENUMERATION_ITEM__FILL_IN);

		eventHistoryTypeEClass = createEClass(EVENT_HISTORY_TYPE);
		createEReference(eventHistoryTypeEClass, EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT);

		eventTypeTypeEClass = createEClass(EVENT_TYPE_TYPE);
		createEAttribute(eventTypeTypeEClass, EVENT_TYPE_TYPE__VALUE);

		evidenceEClass = createEClass(EVIDENCE);
		createEReference(evidenceEClass, EVIDENCE__QUALITY_OF_EVIDENCE);
		createEReference(evidenceEClass, EVIDENCE__STRENGTH_OF_RECOMMENDATION);
		createEReference(evidenceEClass, EVIDENCE__RESOURCES);

		expressionConstraintEClass = createEClass(EXPRESSION_CONSTRAINT);
		createEReference(expressionConstraintEClass, EXPRESSION_CONSTRAINT__CONSTRAINT);

		expressionsTypeEClass = createEClass(EXPRESSIONS_TYPE);
		createEReference(expressionsTypeEClass, EXPRESSIONS_TYPE__DEF);

		externalDataTypeEClass = createEClass(EXTERNAL_DATA_TYPE);
		createEReference(externalDataTypeEClass, EXTERNAL_DATA_TYPE__CODESYSTEM);
		createEReference(externalDataTypeEClass, EXTERNAL_DATA_TYPE__VALUESET);
		createEReference(externalDataTypeEClass, EXTERNAL_DATA_TYPE__PARAMETER);
		createEReference(externalDataTypeEClass, EXTERNAL_DATA_TYPE__DEF);
		createEReference(externalDataTypeEClass, EXTERNAL_DATA_TYPE__TRIGGER);

		fireEventActionEClass = createEClass(FIRE_EVENT_ACTION);
		createEAttribute(fireEventActionEClass, FIRE_EVENT_ACTION__EVENT_TYPE);
		createEReference(fireEventActionEClass, FIRE_EVENT_ACTION__ACTION_SENTENCE);

		focusTypeEClass = createEClass(FOCUS_TYPE);
		createEAttribute(focusTypeEClass, FOCUS_TYPE__VALUE);

		formattedNumberEClass = createEClass(FORMATTED_NUMBER);
		createEAttribute(formattedNumberEClass, FORMATTED_NUMBER__LABEL);
		createEAttribute(formattedNumberEClass, FORMATTED_NUMBER__STYLE);
		createEAttribute(formattedNumberEClass, FORMATTED_NUMBER__VALUE);

		formattedTextEClass = createEClass(FORMATTED_TEXT);
		createEAttribute(formattedTextEClass, FORMATTED_TEXT__LABEL);
		createEAttribute(formattedTextEClass, FORMATTED_TEXT__STYLE);
		createEAttribute(formattedTextEClass, FORMATTED_TEXT__VALUE);

		groupOrganizationBehaviorEClass = createEClass(GROUP_ORGANIZATION_BEHAVIOR);

		groupSelectionBehaviorEClass = createEClass(GROUP_SELECTION_BEHAVIOR);

		identifiersTypeEClass = createEClass(IDENTIFIERS_TYPE);
		createEReference(identifiersTypeEClass, IDENTIFIERS_TYPE__IDENTIFIER);

		identifiersType1EClass = createEClass(IDENTIFIERS_TYPE1);
		createEReference(identifiersType1EClass, IDENTIFIERS_TYPE1__IDENTIFIER);

		inlineResourceEClass = createEClass(INLINE_RESOURCE);
		createEReference(inlineResourceEClass, INLINE_RESOURCE__CONTENT);

		itemCodesTypeEClass = createEClass(ITEM_CODES_TYPE);
		createEReference(itemCodesTypeEClass, ITEM_CODES_TYPE__ITEM_CODE);

		itemDefinitionEClass = createEClass(ITEM_DEFINITION);
		createEReference(itemDefinitionEClass, ITEM_DEFINITION__IDENTIFIER);
		createEReference(itemDefinitionEClass, ITEM_DEFINITION__SCOPED_IDENTIFIER);

		keyTermsTypeEClass = createEClass(KEY_TERMS_TYPE);
		createEReference(keyTermsTypeEClass, KEY_TERMS_TYPE__TERM);

		knowledgeDocumentEClass = createEClass(KNOWLEDGE_DOCUMENT);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__METADATA);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__EXTERNAL_DATA);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__EXPRESSIONS);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__TRIGGERS);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__CONDITIONS);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__BEHAVIORS);
		createEReference(knowledgeDocumentEClass, KNOWLEDGE_DOCUMENT__ACTION_GROUP);

		knowledgeResourceEClass = createEClass(KNOWLEDGE_RESOURCE);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__IDENTIFIERS);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__TEMPLATE_IDS);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__TITLE);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__LOCATION);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__DESCRIPTION);
		createEReference(knowledgeResourceEClass, KNOWLEDGE_RESOURCE__CITATION);

		librariesTypeEClass = createEClass(LIBRARIES_TYPE);
		createEReference(librariesTypeEClass, LIBRARIES_TYPE__LIBRARY_REFERENCE);

		libraryReferenceEClass = createEClass(LIBRARY_REFERENCE);
		createEAttribute(libraryReferenceEClass, LIBRARY_REFERENCE__MEDIA_TYPE);
		createEAttribute(libraryReferenceEClass, LIBRARY_REFERENCE__NAME);
		createEAttribute(libraryReferenceEClass, LIBRARY_REFERENCE__PATH);
		createEAttribute(libraryReferenceEClass, LIBRARY_REFERENCE__VERSION);

		lookupConstraintEClass = createEClass(LOOKUP_CONSTRAINT);
		createEReference(lookupConstraintEClass, LOOKUP_CONSTRAINT__ITEMS);
		createEAttribute(lookupConstraintEClass, LOOKUP_CONSTRAINT__DISPLAY_FIELD);
		createEAttribute(lookupConstraintEClass, LOOKUP_CONSTRAINT__STRICT_SELECTION);

		maskConstraintEClass = createEClass(MASK_CONSTRAINT);
		createEReference(maskConstraintEClass, MASK_CONSTRAINT__MASK_EXPRESSION);
		createEReference(maskConstraintEClass, MASK_CONSTRAINT__MASK_HELP);

		metadataEClass = createEClass(METADATA);
		createEReference(metadataEClass, METADATA__IDENTIFIERS);
		createEReference(metadataEClass, METADATA__ARTIFACT_TYPE);
		createEReference(metadataEClass, METADATA__SCHEMA_IDENTIFIER);
		createEReference(metadataEClass, METADATA__TEMPLATE_IDS);
		createEReference(metadataEClass, METADATA__DATA_MODELS);
		createEReference(metadataEClass, METADATA__LIBRARIES);
		createEReference(metadataEClass, METADATA__TITLE);
		createEReference(metadataEClass, METADATA__DESCRIPTION);
		createEReference(metadataEClass, METADATA__DOCUMENTATION);
		createEReference(metadataEClass, METADATA__RELATED_RESOURCES);
		createEReference(metadataEClass, METADATA__SUPPORTING_EVIDENCE);
		createEReference(metadataEClass, METADATA__APPLICABILITY);
		createEReference(metadataEClass, METADATA__KEY_TERMS);
		createEReference(metadataEClass, METADATA__CATEGORIES);
		createEReference(metadataEClass, METADATA__LANGUAGE);
		createEReference(metadataEClass, METADATA__STATUS);
		createEReference(metadataEClass, METADATA__EVENT_HISTORY);
		createEReference(metadataEClass, METADATA__CONTRIBUTIONS);
		createEReference(metadataEClass, METADATA__PUBLISHERS);
		createEReference(metadataEClass, METADATA__USAGE_TERMS);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__DESCRIPTION);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__REFERENCED_MODEL);

		namedEventTriggerEClass = createEClass(NAMED_EVENT_TRIGGER);
		createEAttribute(namedEventTriggerEClass, NAMED_EVENT_TRIGGER__NAME);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__NAME);

		partyEClass = createEClass(PARTY);
		createEReference(partyEClass, PARTY__ADDRESSES);
		createEReference(partyEClass, PARTY__CONTACTS);

		periodicEventTriggerEClass = createEClass(PERIODIC_EVENT_TRIGGER);

		permissionsTypeEClass = createEClass(PERMISSIONS_TYPE);
		createEReference(permissionsTypeEClass, PERMISSIONS_TYPE__PERMISSIONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__AFFILIATION);

		precheckBehaviorEClass = createEClass(PRECHECK_BEHAVIOR);

		publishersTypeEClass = createEClass(PUBLISHERS_TYPE);
		createEReference(publishersTypeEClass, PUBLISHERS_TYPE__PUBLISHER);

		rangeConstraintEClass = createEClass(RANGE_CONSTRAINT);
		createEReference(rangeConstraintEClass, RANGE_CONSTRAINT__CONSTRAINT_TYPE);

		readOnlyBehaviorEClass = createEClass(READ_ONLY_BEHAVIOR);

		referencedModelTypeEClass = createEClass(REFERENCED_MODEL_TYPE);
		createEAttribute(referencedModelTypeEClass, REFERENCED_MODEL_TYPE__VALUE);

		relatedResourcesTypeEClass = createEClass(RELATED_RESOURCES_TYPE);
		createEReference(relatedResourcesTypeEClass, RELATED_RESOURCES_TYPE__RELATED_RESOURCE);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__VALUE);

		removeActionEClass = createEClass(REMOVE_ACTION);
		createEReference(removeActionEClass, REMOVE_ACTION__ACTION_SENTENCE);

		representedConceptsTypeEClass = createEClass(REPRESENTED_CONCEPTS_TYPE);
		createEReference(representedConceptsTypeEClass, REPRESENTED_CONCEPTS_TYPE__CONCEPT);

		requiredBehaviorEClass = createEClass(REQUIRED_BEHAVIOR);

		resourceRelationshipReferenceEClass = createEClass(RESOURCE_RELATIONSHIP_REFERENCE);
		createEReference(resourceRelationshipReferenceEClass, RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP);
		createEReference(resourceRelationshipReferenceEClass, RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES);

		resourcesTypeEClass = createEClass(RESOURCES_TYPE);
		createEReference(resourcesTypeEClass, RESOURCES_TYPE__RESOURCE);

		responseBindingEClass = createEClass(RESPONSE_BINDING);
		createEAttribute(responseBindingEClass, RESPONSE_BINDING__CONTAINER);
		createEAttribute(responseBindingEClass, RESPONSE_BINDING__PROPERTY);

		responseCardinalityTypeEClass = createEClass(RESPONSE_CARDINALITY_TYPE);
		createEAttribute(responseCardinalityTypeEClass, RESPONSE_CARDINALITY_TYPE__VALUE);

		responseDataTypeTypeEClass = createEClass(RESPONSE_DATA_TYPE_TYPE);
		createEAttribute(responseDataTypeTypeEClass, RESPONSE_DATA_TYPE_TYPE__VALUE);

		rightsDeclarationEClass = createEClass(RIGHTS_DECLARATION);
		createEReference(rightsDeclarationEClass, RIGHTS_DECLARATION__ASSERTED_RIGHTS);
		createEReference(rightsDeclarationEClass, RIGHTS_DECLARATION__RIGHTS_HOLDER);
		createEReference(rightsDeclarationEClass, RIGHTS_DECLARATION__PERMISSIONS);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__VALUE);

		statusTypeEClass = createEClass(STATUS_TYPE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__VALUE);

		subElementsTypeEClass = createEClass(SUB_ELEMENTS_TYPE);
		createEAttribute(subElementsTypeEClass, SUB_ELEMENTS_TYPE__GROUP);
		createEReference(subElementsTypeEClass, SUB_ELEMENTS_TYPE__SIMPLE_ACTION);
		createEReference(subElementsTypeEClass, SUB_ELEMENTS_TYPE__ACTION_GROUP);
		createEReference(subElementsTypeEClass, SUB_ELEMENTS_TYPE__ACTION_REF);

		supportingEvidenceEClass = createEClass(SUPPORTING_EVIDENCE);
		createEReference(supportingEvidenceEClass, SUPPORTING_EVIDENCE__EVIDENCE);

		supportingResourceEClass = createEClass(SUPPORTING_RESOURCE);
		createEReference(supportingResourceEClass, SUPPORTING_RESOURCE__RESOURCE);

		templateIdsTypeEClass = createEClass(TEMPLATE_IDS_TYPE);
		createEReference(templateIdsTypeEClass, TEMPLATE_IDS_TYPE__TEMPLATE_ID);

		templateIdsType1EClass = createEClass(TEMPLATE_IDS_TYPE1);
		createEReference(templateIdsType1EClass, TEMPLATE_IDS_TYPE1__TEMPLATE_ID);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__DEF);
		createEReference(triggerEClass, TRIGGER__IDENTIFIERS);
		createEReference(triggerEClass, TRIGGER__TEXT_EQUIVALENT);

		triggersEClass = createEClass(TRIGGERS);
		createEReference(triggersEClass, TRIGGERS__TRIGGER);

		updateActionEClass = createEClass(UPDATE_ACTION);
		createEReference(updateActionEClass, UPDATE_ACTION__ACTION_SENTENCE);

		usageTermsTypeEClass = createEClass(USAGE_TERMS_TYPE);
		createEReference(usageTermsTypeEClass, USAGE_TERMS_TYPE__RIGHTS_DECLARATION);

		valueSetConstraintEClass = createEClass(VALUE_SET_CONSTRAINT);
		createEReference(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__VALUE_SET);

		versionedIdentifierEClass = createEClass(VERSIONED_IDENTIFIER);
		createEAttribute(versionedIdentifierEClass, VERSIONED_IDENTIFIER__VERSION);

		visualStyleBehaviorEClass = createEClass(VISUAL_STYLE_BEHAVIOR);

		// Create enums
		artifactLifeCycleEventTypeEEnum = createEEnum(ARTIFACT_LIFE_CYCLE_EVENT_TYPE);
		artifactStatusTypeEEnum = createEEnum(ARTIFACT_STATUS_TYPE);
		artifactTypeEEnum = createEEnum(ARTIFACT_TYPE);
		cardinalityEEnum = createEEnum(CARDINALITY);
		cardinalityBehaviorTypeEEnum = createEEnum(CARDINALITY_BEHAVIOR_TYPE);
		compondArtifactTypeEEnum = createEEnum(COMPOND_ARTIFACT_TYPE);
		conditionRoleTypeEEnum = createEEnum(CONDITION_ROLE_TYPE);
		contributorTypeEEnum = createEEnum(CONTRIBUTOR_TYPE);
		coverageTypeEEnum = createEEnum(COVERAGE_TYPE);
		dataEventTypeEEnum = createEEnum(DATA_EVENT_TYPE);
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		groupOrganizationBehaviorTypeEEnum = createEEnum(GROUP_ORGANIZATION_BEHAVIOR_TYPE);
		groupSelectionBehaviorTypeEEnum = createEEnum(GROUP_SELECTION_BEHAVIOR_TYPE);
		precheckBehaviorTypeEEnum = createEEnum(PRECHECK_BEHAVIOR_TYPE);
		rangeConstraintTypeEEnum = createEEnum(RANGE_CONSTRAINT_TYPE);
		requiredBehaviorTypeEEnum = createEEnum(REQUIRED_BEHAVIOR_TYPE);
		resourceRelationshipTypeEEnum = createEEnum(RESOURCE_RELATIONSHIP_TYPE);
		valueTypeEEnum = createEEnum(VALUE_TYPE);

		// Create data types
		artifactLifeCycleEventTypeObjectEDataType = createEDataType(ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT);
		artifactStatusTypeObjectEDataType = createEDataType(ARTIFACT_STATUS_TYPE_OBJECT);
		artifactTypeObjectEDataType = createEDataType(ARTIFACT_TYPE_OBJECT);
		cardinalityBehaviorTypeObjectEDataType = createEDataType(CARDINALITY_BEHAVIOR_TYPE_OBJECT);
		cardinalityObjectEDataType = createEDataType(CARDINALITY_OBJECT);
		compondArtifactTypeObjectEDataType = createEDataType(COMPOND_ARTIFACT_TYPE_OBJECT);
		conditionRoleTypeObjectEDataType = createEDataType(CONDITION_ROLE_TYPE_OBJECT);
		contributorTypeObjectEDataType = createEDataType(CONTRIBUTOR_TYPE_OBJECT);
		coverageTypeObjectEDataType = createEDataType(COVERAGE_TYPE_OBJECT);
		dataEventTypeObjectEDataType = createEDataType(DATA_EVENT_TYPE_OBJECT);
		eventTypeObjectEDataType = createEDataType(EVENT_TYPE_OBJECT);
		groupOrganizationBehaviorTypeObjectEDataType = createEDataType(GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT);
		groupSelectionBehaviorTypeObjectEDataType = createEDataType(GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT);
		precheckBehaviorTypeObjectEDataType = createEDataType(PRECHECK_BEHAVIOR_TYPE_OBJECT);
		rangeConstraintTypeObjectEDataType = createEDataType(RANGE_CONSTRAINT_TYPE_OBJECT);
		requiredBehaviorTypeObjectEDataType = createEDataType(REQUIRED_BEHAVIOR_TYPE_OBJECT);
		resourceRelationshipTypeObjectEDataType = createEDataType(RESOURCE_RELATIONSHIP_TYPE_OBJECT);
		valueTypeObjectEDataType = createEDataType(VALUE_TYPE_OBJECT);
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

		// Obtain other dependent packages
		R2Package theR2Package = (R2Package)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		org.hl7.elm.r1.R1Package theR1Package_1 = (org.hl7.elm.r1.R1Package)EPackage.Registry.INSTANCE.getEPackage(org.hl7.elm.r1.R1Package.eNS_URI);
		XhtmlPackage theXhtmlPackage = (XhtmlPackage)EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionGroupEClass.getESuperTypes().add(this.getActionBase());
		actionRefEClass.getESuperTypes().add(this.getActionBase());
		atomicActionEClass.getESuperTypes().add(this.getActionBase());
		cardinalityBehaviorEClass.getESuperTypes().add(this.getBehavior());
		collectInformationActionEClass.getESuperTypes().add(this.getAtomicAction());
		createActionEClass.getESuperTypes().add(this.getAtomicAction());
		dataEventTriggerEClass.getESuperTypes().add(this.getTrigger());
		declareResponseActionEClass.getESuperTypes().add(this.getAtomicAction());
		documentationItemEClass.getESuperTypes().add(this.getItemDefinition());
		enumerationConstraintEClass.getESuperTypes().add(this.getRangeConstraint());
		expressionConstraintEClass.getESuperTypes().add(this.getRangeConstraint());
		fireEventActionEClass.getESuperTypes().add(this.getAtomicAction());
		groupOrganizationBehaviorEClass.getESuperTypes().add(this.getBehavior());
		groupSelectionBehaviorEClass.getESuperTypes().add(this.getBehavior());
		inlineResourceEClass.getESuperTypes().add(this.getKnowledgeResource());
		lookupConstraintEClass.getESuperTypes().add(this.getRangeConstraint());
		maskConstraintEClass.getESuperTypes().add(this.getRangeConstraint());
		namedEventTriggerEClass.getESuperTypes().add(this.getTrigger());
		organizationEClass.getESuperTypes().add(this.getParty());
		periodicEventTriggerEClass.getESuperTypes().add(this.getTrigger());
		personEClass.getESuperTypes().add(this.getParty());
		precheckBehaviorEClass.getESuperTypes().add(this.getBehavior());
		readOnlyBehaviorEClass.getESuperTypes().add(this.getBehavior());
		removeActionEClass.getESuperTypes().add(this.getAtomicAction());
		requiredBehaviorEClass.getESuperTypes().add(this.getBehavior());
		updateActionEClass.getESuperTypes().add(this.getAtomicAction());
		valueSetConstraintEClass.getESuperTypes().add(this.getRangeConstraint());
		versionedIdentifierEClass.getESuperTypes().add(theR2Package.getII());
		visualStyleBehaviorEClass.getESuperTypes().add(this.getBehavior());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionBaseEClass, ActionBase.class, "ActionBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBase_ActionId(), theR2Package.getII(), null, "actionId", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Number(), this.getFormattedText(), null, "number", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_SupportingEvidence(), this.getSupportingEvidence(), null, "supportingEvidence", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_SupportingResources(), this.getSupportingResource(), null, "supportingResources", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Actors(), this.getActorsType(), null, "actors", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Behaviors(), this.getBehaviors(), null, "behaviors", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Conditions(), this.getConditions(), null, "conditions", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Order(), theXMLTypePackage.getInt(), "order", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionGroupEClass, ActionGroup.class, "ActionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionGroup_Title(), this.getFormattedText(), null, "title", null, 0, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Description(), this.getFormattedText(), null, "description", null, 0, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_RepresentedConcepts(), this.getRepresentedConceptsType(), null, "representedConcepts", null, 0, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_SubElements(), this.getSubElementsType(), null, "subElements", null, 1, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRefEClass, ActionRef.class, "ActionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionRef_LibraryName(), theXMLTypePackage.getString(), "libraryName", null, 0, 1, ActionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionRef_ReferencedActionId(), theXMLTypePackage.getString(), "referencedActionId", null, 0, 1, ActionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Actor(), this.getParty(), null, "actor", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorsTypeEClass, ActorsType.class, "ActorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorsType_Actor(), this.getActor(), null, "actor", null, 1, -1, ActorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressesTypeEClass, AddressesType.class, "AddressesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressesType_Address(), theR2Package.getAD(), null, "address", null, 1, -1, AddressesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicabilityTypeEClass, ApplicabilityType.class, "ApplicabilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicabilityType_Coverage(), this.getCoverage(), null, "coverage", null, 1, -1, ApplicabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactLifeCycleEventEClass, ArtifactLifeCycleEvent.class, "ArtifactLifeCycleEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactLifeCycleEvent_EventType(), this.getEventTypeType(), null, "eventType", null, 1, 1, ArtifactLifeCycleEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactLifeCycleEvent_EventDateTime(), theR2Package.getTS(), null, "eventDateTime", null, 1, 1, ArtifactLifeCycleEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactTypeTypeEClass, ArtifactTypeType.class, "ArtifactTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactTypeType_Value(), this.getArtifactType(), "value", null, 1, 1, ArtifactTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicAction_TextEquivalent(), theR2Package.getST(), null, "textEquivalent", null, 0, 1, AtomicAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavior_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorsEClass, Behaviors.class, "Behaviors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviors_Behavior(), this.getBehavior(), null, "behavior", null, 1, -1, Behaviors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityBehaviorEClass, CardinalityBehavior.class, "CardinalityBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoriesTypeEClass, CategoriesType.class, "CategoriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoriesType_Category(), theR2Package.getCD(), null, "category", null, 1, -1, CategoriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesTypeEClass, CodesType.class, "CodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodesType_Code(), theR2Package.getCD(), null, "code", null, 0, -1, CodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectInformationActionEClass, CollectInformationAction.class, "CollectInformationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectInformationAction_DocumentationConcept(), this.getDocumentationItem(), null, "documentationConcept", null, 1, 1, CollectInformationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectInformationAction_InitialValue(), theR1Package_1.getExpression(), null, "initialValue", null, 0, 1, CollectInformationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectInformationAction_ResponseBinding(), this.getResponseBinding(), null, "responseBinding", null, 0, 1, CollectInformationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Logic(), theR1Package_1.getExpression(), null, "logic", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_ConditionRole(), this.getConditionRoleType1(), null, "conditionRole", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionRoleType1EClass, ConditionRoleType1.class, "ConditionRoleType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionRoleType1_Value(), this.getConditionRoleType(), "value", null, 0, 1, ConditionRoleType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionsEClass, Conditions.class, "Conditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditions_Condition(), this.getCondition(), null, "condition", null, 1, -1, Conditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintTypeTypeEClass, ConstraintTypeType.class, "ConstraintTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraintTypeType_Value(), this.getRangeConstraintType(), "value", null, 0, 1, ConstraintTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactsTypeEClass, ContactsType.class, "ContactsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactsType_Contact(), theR2Package.getTEL(), null, "contact", null, 1, -1, ContactsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTypeEClass, ContentType.class, "ContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentType_Div(), theXhtmlPackage.getDivType(), null, "div", null, 1, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContribution_Contributor(), this.getParty(), null, "contributor", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContribution_Role(), this.getRoleType(), null, "role", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionsTypeEClass, ContributionsType.class, "ContributionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributionsType_Contribution(), this.getContribution(), null, "contribution", null, 1, -1, ContributionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageEClass, Coverage.class, "Coverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverage_Focus(), this.getFocusType(), null, "focus", null, 1, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_Description(), theR2Package.getST(), null, "description", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverage_Value(), theR2Package.getCD(), null, "value", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createActionEClass, CreateAction.class, "CreateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateAction_ActionSentence(), theR1Package_1.getExpression(), null, "actionSentence", null, 0, 1, CreateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEventTriggerEClass, DataEventTrigger.class, "DataEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataEventTrigger_TriggerType(), this.getDataEventType(), "triggerType", null, 0, 1, DataEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelsTypeEClass, DataModelsType.class, "DataModelsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataModelsType_ModelReference(), this.getModelReference(), null, "modelReference", null, 1, -1, DataModelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareResponseActionEClass, DeclareResponseAction.class, "DeclareResponseAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclareResponseAction_Name(), theXMLTypePackage.getString(), "name", "Responses", 0, 1, DeclareResponseAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationItemEClass, DocumentationItem.class, "DocumentationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationItem_Prompt(), this.getFormattedText(), null, "prompt", null, 1, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_AdditionalInstructions(), this.getFormattedText(), null, "additionalInstructions", null, 0, -1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_TextAfterResponse(), this.getFormattedText(), null, "textAfterResponse", null, 0, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_Description(), this.getFormattedText(), null, "description", null, 0, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_ItemCodes(), this.getItemCodesType(), null, "itemCodes", null, 0, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_ResponseDataType(), this.getResponseDataTypeType(), null, "responseDataType", null, 1, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_ResponseCardinality(), this.getResponseCardinalityType(), null, "responseCardinality", null, 0, 1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationItem_ResponseRange(), this.getRangeConstraint(), null, "responseRange", null, 0, -1, DocumentationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KnowledgeDocument(), this.getKnowledgeDocument(), null, "knowledgeDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumerationConstraintEClass, EnumerationConstraint.class, "EnumerationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationConstraint_Item(), this.getEnumerationItem(), null, "item", null, 1, -1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationConstraint_StrictSelection(), theXMLTypePackage.getBoolean(), "strictSelection", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationItemEClass, EnumerationItem.class, "EnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationItem_Identifier(), this.getVersionedIdentifier(), null, "identifier", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_Number(), this.getFormattedText(), null, "number", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_Value(), theR1Package_1.getExpression(), null, "value", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_Codes(), this.getCodesType(), null, "codes", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_DisplayText(), this.getFormattedText(), null, "displayText", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_AdditionalInstructions(), this.getFormattedText(), null, "additionalInstructions", null, 0, -1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItem_ValueMeaning(), this.getFormattedText(), null, "valueMeaning", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationItem_FillIn(), theXMLTypePackage.getBoolean(), "fillIn", "false", 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHistoryTypeEClass, EventHistoryType.class, "EventHistoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHistoryType_ArtifactLifeCycleEvent(), this.getArtifactLifeCycleEvent(), null, "artifactLifeCycleEvent", null, 1, -1, EventHistoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTypeTypeEClass, EventTypeType.class, "EventTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventTypeType_Value(), this.getArtifactLifeCycleEventType(), "value", null, 1, 1, EventTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvidence_QualityOfEvidence(), theR2Package.getCD(), null, "qualityOfEvidence", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvidence_StrengthOfRecommendation(), theR2Package.getCD(), null, "strengthOfRecommendation", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvidence_Resources(), this.getSupportingResource(), null, "resources", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionConstraintEClass, ExpressionConstraint.class, "ExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionConstraint_Constraint(), theR1Package_1.getExpression(), null, "constraint", null, 1, 1, ExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionsTypeEClass, ExpressionsType.class, "ExpressionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionsType_Def(), theR1Package_1.getExpressionDef(), null, "def", null, 0, -1, ExpressionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDataTypeEClass, ExternalDataType.class, "ExternalDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalDataType_Codesystem(), theR1Package_1.getCodeSystemDef(), null, "codesystem", null, 0, -1, ExternalDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalDataType_Valueset(), theR1Package_1.getValueSetDef(), null, "valueset", null, 0, -1, ExternalDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalDataType_Parameter(), theR1Package_1.getParameterDef(), null, "parameter", null, 0, -1, ExternalDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalDataType_Def(), theR1Package_1.getExpressionDef(), null, "def", null, 0, -1, ExternalDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalDataType_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, ExternalDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fireEventActionEClass, FireEventAction.class, "FireEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFireEventAction_EventType(), this.getEventType(), "eventType", null, 1, 1, FireEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFireEventAction_ActionSentence(), theR1Package_1.getExpression(), null, "actionSentence", null, 0, 1, FireEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(focusTypeEClass, FocusType.class, "FocusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFocusType_Value(), this.getCoverageType(), "value", null, 1, 1, FocusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formattedNumberEClass, FormattedNumber.class, "FormattedNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormattedNumber_Label(), theXMLTypePackage.getInt(), "label", null, 0, 1, FormattedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattedNumber_Style(), theXMLTypePackage.getString(), "style", null, 0, -1, FormattedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattedNumber_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, FormattedNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formattedTextEClass, FormattedText.class, "FormattedText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormattedText_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, FormattedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattedText_Style(), theXMLTypePackage.getString(), "style", null, 0, -1, FormattedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattedText_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FormattedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupOrganizationBehaviorEClass, GroupOrganizationBehavior.class, "GroupOrganizationBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupSelectionBehaviorEClass, GroupSelectionBehavior.class, "GroupSelectionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifiersTypeEClass, IdentifiersType.class, "IdentifiersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiersType_Identifier(), this.getVersionedIdentifier(), null, "identifier", null, 1, -1, IdentifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiersType1EClass, IdentifiersType1.class, "IdentifiersType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiersType1_Identifier(), this.getVersionedIdentifier(), null, "identifier", null, 1, -1, IdentifiersType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineResourceEClass, InlineResource.class, "InlineResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineResource_Content(), this.getContentType(), null, "content", null, 0, 1, InlineResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemCodesTypeEClass, ItemCodesType.class, "ItemCodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemCodesType_ItemCode(), theR2Package.getCD(), null, "itemCode", null, 0, -1, ItemCodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemDefinitionEClass, ItemDefinition.class, "ItemDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemDefinition_Identifier(), this.getVersionedIdentifier(), null, "identifier", null, 0, 1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemDefinition_ScopedIdentifier(), this.getVersionedIdentifier(), null, "scopedIdentifier", null, 0, 1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyTermsTypeEClass, KeyTermsType.class, "KeyTermsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyTermsType_Term(), theR2Package.getCD(), null, "term", null, 1, -1, KeyTermsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeDocumentEClass, KnowledgeDocument.class, "KnowledgeDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeDocument_Metadata(), this.getMetadata(), null, "metadata", null, 1, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_ExternalData(), this.getExternalDataType(), null, "externalData", null, 0, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_Expressions(), this.getExpressionsType(), null, "expressions", null, 0, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_Triggers(), this.getTriggers(), null, "triggers", null, 0, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_Conditions(), this.getConditions(), null, "conditions", null, 0, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_Behaviors(), this.getBehaviors(), null, "behaviors", null, 0, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeDocument_ActionGroup(), this.getActionGroup(), null, "actionGroup", null, 1, 1, KnowledgeDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeResourceEClass, KnowledgeResource.class, "KnowledgeResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeResource_Identifiers(), this.getIdentifiersType(), null, "identifiers", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeResource_TemplateIds(), this.getTemplateIdsType(), null, "templateIds", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeResource_Title(), this.getFormattedText(), null, "title", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeResource_Location(), theR2Package.getTEL(), null, "location", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeResource_Description(), this.getFormattedText(), null, "description", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeResource_Citation(), this.getFormattedText(), null, "citation", null, 0, 1, KnowledgeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(librariesTypeEClass, LibrariesType.class, "LibrariesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrariesType_LibraryReference(), this.getLibraryReference(), null, "libraryReference", null, 1, -1, LibrariesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryReferenceEClass, LibraryReference.class, "LibraryReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibraryReference_MediaType(), theXMLTypePackage.getAnyURI(), "mediaType", "application/hed+xml", 0, 1, LibraryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibraryReference_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LibraryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibraryReference_Path(), theXMLTypePackage.getAnyURI(), "path", null, 1, 1, LibraryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibraryReference_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, LibraryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupConstraintEClass, LookupConstraint.class, "LookupConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLookupConstraint_Items(), theR1Package_1.getExpression(), null, "items", null, 1, 1, LookupConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupConstraint_DisplayField(), theXMLTypePackage.getString(), "displayField", null, 0, 1, LookupConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupConstraint_StrictSelection(), theXMLTypePackage.getBoolean(), "strictSelection", null, 0, 1, LookupConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maskConstraintEClass, MaskConstraint.class, "MaskConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaskConstraint_MaskExpression(), theR2Package.getST(), null, "maskExpression", null, 1, 1, MaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaskConstraint_MaskHelp(), theR2Package.getST(), null, "maskHelp", null, 1, 1, MaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadata_Identifiers(), this.getIdentifiersType1(), null, "identifiers", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_ArtifactType(), this.getArtifactTypeType(), null, "artifactType", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_SchemaIdentifier(), this.getVersionedIdentifier(), null, "schemaIdentifier", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_TemplateIds(), this.getTemplateIdsType1(), null, "templateIds", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_DataModels(), this.getDataModelsType(), null, "dataModels", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Libraries(), this.getLibrariesType(), null, "libraries", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Title(), theR2Package.getST(), null, "title", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Description(), theR2Package.getST(), null, "description", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Documentation(), this.getInlineResource(), null, "documentation", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_RelatedResources(), this.getRelatedResourcesType(), null, "relatedResources", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_SupportingEvidence(), this.getSupportingEvidence(), null, "supportingEvidence", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Applicability(), this.getApplicabilityType(), null, "applicability", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_KeyTerms(), this.getKeyTermsType(), null, "keyTerms", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Categories(), this.getCategoriesType(), null, "categories", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Language(), theR2Package.getCD(), null, "language", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Status(), this.getStatusType(), null, "status", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_EventHistory(), this.getEventHistoryType(), null, "eventHistory", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Contributions(), this.getContributionsType(), null, "contributions", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Publishers(), this.getPublishersType(), null, "publishers", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_UsageTerms(), this.getUsageTermsType(), null, "usageTerms", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_Description(), theR2Package.getST(), null, "description", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelReference_ReferencedModel(), this.getReferencedModelType(), null, "referencedModel", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedEventTriggerEClass, NamedEventTrigger.class, "NamedEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedEventTrigger_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, NamedEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Name(), theR2Package.getST(), null, "name", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParty_Addresses(), this.getAddressesType(), null, "addresses", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_Contacts(), this.getContactsType(), null, "contacts", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicEventTriggerEClass, PeriodicEventTrigger.class, "PeriodicEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permissionsTypeEClass, PermissionsType.class, "PermissionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermissionsType_Permissions(), theR2Package.getST(), null, "permissions", null, 1, -1, PermissionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Name(), theR2Package.getEN(), null, "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Affiliation(), this.getOrganization(), null, "affiliation", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precheckBehaviorEClass, PrecheckBehavior.class, "PrecheckBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publishersTypeEClass, PublishersType.class, "PublishersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublishersType_Publisher(), this.getParty(), null, "publisher", null, 1, -1, PublishersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeConstraintEClass, RangeConstraint.class, "RangeConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeConstraint_ConstraintType(), this.getConstraintTypeType(), null, "constraintType", null, 1, 1, RangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readOnlyBehaviorEClass, ReadOnlyBehavior.class, "ReadOnlyBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencedModelTypeEClass, ReferencedModelType.class, "ReferencedModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferencedModelType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, ReferencedModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedResourcesTypeEClass, RelatedResourcesType.class, "RelatedResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedResourcesType_RelatedResource(), this.getResourceRelationshipReference(), null, "relatedResource", null, 1, -1, RelatedResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipType_Value(), this.getResourceRelationshipType(), "value", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeActionEClass, RemoveAction.class, "RemoveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveAction_ActionSentence(), theR1Package_1.getExpression(), null, "actionSentence", null, 1, 1, RemoveAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representedConceptsTypeEClass, RepresentedConceptsType.class, "RepresentedConceptsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentedConceptsType_Concept(), theR2Package.getCD(), null, "concept", null, 1, -1, RepresentedConceptsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredBehaviorEClass, RequiredBehavior.class, "RequiredBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceRelationshipReferenceEClass, ResourceRelationshipReference.class, "ResourceRelationshipReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRelationshipReference_Relationship(), this.getRelationshipType(), null, "relationship", null, 1, 1, ResourceRelationshipReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRelationshipReference_Resources(), this.getResourcesType(), null, "resources", null, 1, 1, ResourceRelationshipReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesTypeEClass, ResourcesType.class, "ResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcesType_Resource(), this.getKnowledgeResource(), null, "resource", null, 1, -1, ResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseBindingEClass, ResponseBinding.class, "ResponseBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseBinding_Container(), theXMLTypePackage.getString(), "container", "Responses", 0, 1, ResponseBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseBinding_Property(), theXMLTypePackage.getString(), "property", null, 1, 1, ResponseBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseCardinalityTypeEClass, ResponseCardinalityType.class, "ResponseCardinalityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseCardinalityType_Value(), this.getCardinality(), "value", null, 0, 1, ResponseCardinalityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseDataTypeTypeEClass, ResponseDataTypeType.class, "ResponseDataTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDataTypeType_Value(), this.getValueType(), "value", null, 0, 1, ResponseDataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightsDeclarationEClass, RightsDeclaration.class, "RightsDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightsDeclaration_AssertedRights(), theR2Package.getST(), null, "assertedRights", null, 1, 1, RightsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightsDeclaration_RightsHolder(), this.getParty(), null, "rightsHolder", null, 1, 1, RightsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightsDeclaration_Permissions(), this.getPermissionsType(), null, "permissions", null, 0, 1, RightsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_Value(), this.getContributorType(), "value", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusTypeEClass, StatusType.class, "StatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusType_Value(), this.getArtifactStatusType(), "value", null, 1, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subElementsTypeEClass, SubElementsType.class, "SubElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubElementsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SubElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubElementsType_SimpleAction(), this.getAtomicAction(), null, "simpleAction", null, 0, -1, SubElementsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubElementsType_ActionGroup(), this.getActionGroup(), null, "actionGroup", null, 0, -1, SubElementsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubElementsType_ActionRef(), this.getActionRef(), null, "actionRef", null, 0, -1, SubElementsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(supportingEvidenceEClass, SupportingEvidence.class, "SupportingEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportingEvidence_Evidence(), this.getEvidence(), null, "evidence", null, 1, -1, SupportingEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportingResourceEClass, SupportingResource.class, "SupportingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportingResource_Resource(), this.getKnowledgeResource(), null, "resource", null, 1, -1, SupportingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateIdsTypeEClass, TemplateIdsType.class, "TemplateIdsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateIdsType_TemplateId(), theR2Package.getII(), null, "templateId", null, 1, -1, TemplateIdsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateIdsType1EClass, TemplateIdsType1.class, "TemplateIdsType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateIdsType1_TemplateId(), this.getVersionedIdentifier(), null, "templateId", null, 1, -1, TemplateIdsType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Def(), theR1Package_1.getExpressionDef(), null, "def", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Identifiers(), this.getVersionedIdentifier(), null, "identifiers", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_TextEquivalent(), ecorePackage.getEObject(), null, "textEquivalent", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggersEClass, Triggers.class, "Triggers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggers_Trigger(), this.getTrigger(), null, "trigger", null, 1, -1, Triggers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateActionEClass, UpdateAction.class, "UpdateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAction_ActionSentence(), theR1Package_1.getExpression(), null, "actionSentence", null, 1, 1, UpdateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageTermsTypeEClass, UsageTermsType.class, "UsageTermsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageTermsType_RightsDeclaration(), this.getRightsDeclaration(), null, "rightsDeclaration", null, 1, -1, UsageTermsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSetConstraintEClass, ValueSetConstraint.class, "ValueSetConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetConstraint_ValueSet(), theR1Package_1.getValueSetRef(), null, "valueSet", null, 1, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedIdentifierEClass, VersionedIdentifier.class, "VersionedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedIdentifier_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, VersionedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualStyleBehaviorEClass, VisualStyleBehavior.class, "VisualStyleBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.class, "ArtifactLifeCycleEventType");
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.CREATED);
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.PRE_PUBLISHED);
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.PUBLISHED);
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.REVIEWED);
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.WITHDRAWN);
		addEEnumLiteral(artifactLifeCycleEventTypeEEnum, ArtifactLifeCycleEventType.SUPERSEDED);

		initEEnum(artifactStatusTypeEEnum, ArtifactStatusType.class, "ArtifactStatusType");
		addEEnumLiteral(artifactStatusTypeEEnum, ArtifactStatusType.DRAFT);
		addEEnumLiteral(artifactStatusTypeEEnum, ArtifactStatusType.IN_TEST);
		addEEnumLiteral(artifactStatusTypeEEnum, ArtifactStatusType.ACTIVE);
		addEEnumLiteral(artifactStatusTypeEEnum, ArtifactStatusType.INACTIVE);

		initEEnum(artifactTypeEEnum, ArtifactType.class, "ArtifactType");
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.RULE);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.ORDER_SET);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.DOCUMENTATION_TEMPLATE);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.LIBRARY);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.COMPOSITE);

		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.SINGLE);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MULTIPLE);

		initEEnum(cardinalityBehaviorTypeEEnum, CardinalityBehaviorType.class, "CardinalityBehaviorType");
		addEEnumLiteral(cardinalityBehaviorTypeEEnum, CardinalityBehaviorType.SINGLE);
		addEEnumLiteral(cardinalityBehaviorTypeEEnum, CardinalityBehaviorType.MULTIPLE);

		initEEnum(compondArtifactTypeEEnum, CompondArtifactType.class, "CompondArtifactType");
		addEEnumLiteral(compondArtifactTypeEEnum, CompondArtifactType.RULE);
		addEEnumLiteral(compondArtifactTypeEEnum, CompondArtifactType.ORDER_SET);
		addEEnumLiteral(compondArtifactTypeEEnum, CompondArtifactType.DOCUMENTATION_TEMPLATE);
		addEEnumLiteral(compondArtifactTypeEEnum, CompondArtifactType.LIBRARY);
		addEEnumLiteral(compondArtifactTypeEEnum, CompondArtifactType.COMPOSITE);

		initEEnum(conditionRoleTypeEEnum, ConditionRoleType.class, "ConditionRoleType");
		addEEnumLiteral(conditionRoleTypeEEnum, ConditionRoleType.APPLICABLE_SCENARIO);

		initEEnum(contributorTypeEEnum, ContributorType.class, "ContributorType");
		addEEnumLiteral(contributorTypeEEnum, ContributorType.AUTHOR);
		addEEnumLiteral(contributorTypeEEnum, ContributorType.EDITOR);
		addEEnumLiteral(contributorTypeEEnum, ContributorType.ENDORSER);
		addEEnumLiteral(contributorTypeEEnum, ContributorType.REVIEWER);

		initEEnum(coverageTypeEEnum, CoverageType.class, "CoverageType");
		addEEnumLiteral(coverageTypeEEnum, CoverageType.PATIENT_GENDER);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.PATIENT_AGE_GROUP);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.CLINICAL_FOCUS);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.TARGET_USER);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.WORKFLOW_SETTING);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.WORKFLOW_TASK);
		addEEnumLiteral(coverageTypeEEnum, CoverageType.CLINICAL_VENUE);

		initEEnum(dataEventTypeEEnum, DataEventType.class, "DataEventType");
		addEEnumLiteral(dataEventTypeEEnum, DataEventType.DATA_ELEMENT_ADDED);
		addEEnumLiteral(dataEventTypeEEnum, DataEventType.DATA_ELEMENT_MODIFIED);
		addEEnumLiteral(dataEventTypeEEnum, DataEventType.DATA_ELEMENT_REMOVED);
		addEEnumLiteral(dataEventTypeEEnum, DataEventType.DATA_ELEMENT_ACCESSED);
		addEEnumLiteral(dataEventTypeEEnum, DataEventType.DATA_ELEMENT_ACCESS_ENDED);

		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.DATA_EVENT);
		addEEnumLiteral(eventTypeEEnum, EventType.PERIODIC_EVENT);
		addEEnumLiteral(eventTypeEEnum, EventType.NAMED_EVENT);

		initEEnum(groupOrganizationBehaviorTypeEEnum, GroupOrganizationBehaviorType.class, "GroupOrganizationBehaviorType");
		addEEnumLiteral(groupOrganizationBehaviorTypeEEnum, GroupOrganizationBehaviorType.VISUAL_GROUP);
		addEEnumLiteral(groupOrganizationBehaviorTypeEEnum, GroupOrganizationBehaviorType.LOGICAL_GROUP);
		addEEnumLiteral(groupOrganizationBehaviorTypeEEnum, GroupOrganizationBehaviorType.SENTENCE_GROUP);

		initEEnum(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.class, "GroupSelectionBehaviorType");
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.ANY);
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.ALL);
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.ALL_OR_NONE);
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.EXACTLY_ONE);
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.AT_MOST_ONE);
		addEEnumLiteral(groupSelectionBehaviorTypeEEnum, GroupSelectionBehaviorType.ONE_OR_MORE);

		initEEnum(precheckBehaviorTypeEEnum, PrecheckBehaviorType.class, "PrecheckBehaviorType");
		addEEnumLiteral(precheckBehaviorTypeEEnum, PrecheckBehaviorType.YES);
		addEEnumLiteral(precheckBehaviorTypeEEnum, PrecheckBehaviorType.NO);

		initEEnum(rangeConstraintTypeEEnum, RangeConstraintType.class, "RangeConstraintType");
		addEEnumLiteral(rangeConstraintTypeEEnum, RangeConstraintType.MINIMUM);
		addEEnumLiteral(rangeConstraintTypeEEnum, RangeConstraintType.MAXIMUM);
		addEEnumLiteral(rangeConstraintTypeEEnum, RangeConstraintType.LIST);
		addEEnumLiteral(rangeConstraintTypeEEnum, RangeConstraintType.COMPONENT);

		initEEnum(requiredBehaviorTypeEEnum, RequiredBehaviorType.class, "RequiredBehaviorType");
		addEEnumLiteral(requiredBehaviorTypeEEnum, RequiredBehaviorType.MUST);
		addEEnumLiteral(requiredBehaviorTypeEEnum, RequiredBehaviorType.COULD);
		addEEnumLiteral(requiredBehaviorTypeEEnum, RequiredBehaviorType.MUST_UNLESS_DOCUMENTED);

		initEEnum(resourceRelationshipTypeEEnum, ResourceRelationshipType.class, "ResourceRelationshipType");
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.ADAPTED_FROM);
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.ASSOCIATED_RESOURCE);
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.DEPENDS_ON);
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.DERIVED_FROM);
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.SIMILAR_TO);
		addEEnumLiteral(resourceRelationshipTypeEEnum, ResourceRelationshipType.VERSION_OF);

		initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
		addEEnumLiteral(valueTypeEEnum, ValueType.BOOLEAN);
		addEEnumLiteral(valueTypeEEnum, ValueType.CODE);
		addEEnumLiteral(valueTypeEEnum, ValueType.CODED_ORDINAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.ENTITY_NAME);
		addEEnumLiteral(valueTypeEEnum, ValueType.IDENTIFIER);
		addEEnumLiteral(valueTypeEEnum, ValueType.INTEGER);
		addEEnumLiteral(valueTypeEEnum, ValueType.INTEGER_INTERVAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.PERIOD);
		addEEnumLiteral(valueTypeEEnum, ValueType.PHYSICAL_QUANTITY);
		addEEnumLiteral(valueTypeEEnum, ValueType.PHYSICAL_QUANTITY_INTERVAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.QUANTITY_INTERVAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.RATIO);
		addEEnumLiteral(valueTypeEEnum, ValueType.REAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.REAL_INTERVAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.SIMPLE_CODE);
		addEEnumLiteral(valueTypeEEnum, ValueType.STRING);
		addEEnumLiteral(valueTypeEEnum, ValueType.TIMESTAMP);
		addEEnumLiteral(valueTypeEEnum, ValueType.TIMESTAMP_INTERVAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.URL);
		addEEnumLiteral(valueTypeEEnum, ValueType.TUPLE);

		// Initialize data types
		initEDataType(artifactLifeCycleEventTypeObjectEDataType, ArtifactLifeCycleEventType.class, "ArtifactLifeCycleEventTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(artifactStatusTypeObjectEDataType, ArtifactStatusType.class, "ArtifactStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(artifactTypeObjectEDataType, ArtifactType.class, "ArtifactTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cardinalityBehaviorTypeObjectEDataType, CardinalityBehaviorType.class, "CardinalityBehaviorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cardinalityObjectEDataType, Cardinality.class, "CardinalityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compondArtifactTypeObjectEDataType, CompondArtifactType.class, "CompondArtifactTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(conditionRoleTypeObjectEDataType, ConditionRoleType.class, "ConditionRoleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contributorTypeObjectEDataType, ContributorType.class, "ContributorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coverageTypeObjectEDataType, CoverageType.class, "CoverageTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataEventTypeObjectEDataType, DataEventType.class, "DataEventTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventTypeObjectEDataType, EventType.class, "EventTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(groupOrganizationBehaviorTypeObjectEDataType, GroupOrganizationBehaviorType.class, "GroupOrganizationBehaviorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(groupSelectionBehaviorTypeObjectEDataType, GroupSelectionBehaviorType.class, "GroupSelectionBehaviorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(precheckBehaviorTypeObjectEDataType, PrecheckBehaviorType.class, "PrecheckBehaviorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rangeConstraintTypeObjectEDataType, RangeConstraintType.class, "RangeConstraintTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requiredBehaviorTypeObjectEDataType, RequiredBehaviorType.class, "RequiredBehaviorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceRelationshipTypeObjectEDataType, ResourceRelationshipType.class, "ResourceRelationshipTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueTypeObjectEDataType, ValueType.class, "ValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (actionBaseEClass, 
		   source, 
		   new String[] {
			 "name", "ActionBase",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActionBase_ActionId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_SupportingEvidence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportingEvidence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_SupportingResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportingResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_Actors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_Behaviors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "behaviors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_Conditions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionBase_Order(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "order"
		   });	
		addAnnotation
		  (actionGroupEClass, 
		   source, 
		   new String[] {
			 "name", "ActionGroup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActionGroup_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionGroup_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionGroup_RepresentedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "representedConcepts",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionGroup_SubElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subElements",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (actionRefEClass, 
		   source, 
		   new String[] {
			 "name", "ActionRef",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActionRef_LibraryName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "libraryName"
		   });	
		addAnnotation
		  (getActionRef_ReferencedActionId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "referencedActionId"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "name", "Actor",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActor_Actor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (actorsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "actors_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActorsType_Actor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (addressesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "addresses_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAddressesType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (applicabilityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "applicability_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getApplicabilityType_Coverage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coverage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (artifactLifeCycleEventEClass, 
		   source, 
		   new String[] {
			 "name", "ArtifactLifeCycleEvent",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getArtifactLifeCycleEvent_EventType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eventType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getArtifactLifeCycleEvent_EventDateTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eventDateTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (artifactLifeCycleEventTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ArtifactLifeCycleEventType"
		   });	
		addAnnotation
		  (artifactLifeCycleEventTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ArtifactLifeCycleEventType:Object",
			 "baseType", "ArtifactLifeCycleEventType"
		   });	
		addAnnotation
		  (artifactStatusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ArtifactStatusType"
		   });	
		addAnnotation
		  (artifactStatusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ArtifactStatusType:Object",
			 "baseType", "ArtifactStatusType"
		   });	
		addAnnotation
		  (artifactTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ArtifactType"
		   });	
		addAnnotation
		  (artifactTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ArtifactType:Object",
			 "baseType", "ArtifactType"
		   });	
		addAnnotation
		  (artifactTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "artifactType_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getArtifactTypeType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (atomicActionEClass, 
		   source, 
		   new String[] {
			 "name", "AtomicAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAtomicAction_TextEquivalent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textEquivalent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "name", "Behavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBehavior_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (behaviorsEClass, 
		   source, 
		   new String[] {
			 "name", "Behaviors",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBehaviors_Behavior(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "behavior",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardinalityEEnum, 
		   source, 
		   new String[] {
			 "name", "Cardinality"
		   });	
		addAnnotation
		  (cardinalityBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "CardinalityBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (cardinalityBehaviorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CardinalityBehaviorType"
		   });	
		addAnnotation
		  (cardinalityBehaviorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CardinalityBehaviorType:Object",
			 "baseType", "CardinalityBehaviorType"
		   });	
		addAnnotation
		  (cardinalityObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Cardinality:Object",
			 "baseType", "Cardinality"
		   });	
		addAnnotation
		  (categoriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "categories_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCategoriesType_Category(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (codesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "codes_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCodesType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (collectInformationActionEClass, 
		   source, 
		   new String[] {
			 "name", "CollectInformationAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCollectInformationAction_DocumentationConcept(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "documentationConcept",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCollectInformationAction_InitialValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCollectInformationAction_ResponseBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "responseBinding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (compondArtifactTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CompondArtifactType"
		   });	
		addAnnotation
		  (compondArtifactTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CompondArtifactType:Object",
			 "baseType", "CompondArtifactType"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "name", "Condition",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCondition_Logic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "logic",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCondition_ConditionRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditionRole",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (conditionRoleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ConditionRoleType"
		   });	
		addAnnotation
		  (conditionRoleType1EClass, 
		   source, 
		   new String[] {
			 "name", "conditionRole_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConditionRoleType1_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (conditionRoleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ConditionRoleType:Object",
			 "baseType", "ConditionRoleType"
		   });	
		addAnnotation
		  (conditionsEClass, 
		   source, 
		   new String[] {
			 "name", "Conditions",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConditions_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "condition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (constraintTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "constraintType_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConstraintTypeType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (contactsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "contacts_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContactsType_Contact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contact",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (contentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "content_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContentType_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "http://www.w3.org/1999/xhtml"
		   });	
		addAnnotation
		  (contributionEClass, 
		   source, 
		   new String[] {
			 "name", "Contribution",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContribution_Contributor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contributor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getContribution_Role(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (contributionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "contributions_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContributionsType_Contribution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contribution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (contributorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ContributorType"
		   });	
		addAnnotation
		  (contributorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ContributorType:Object",
			 "baseType", "ContributorType"
		   });	
		addAnnotation
		  (coverageEClass, 
		   source, 
		   new String[] {
			 "name", "Coverage",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCoverage_Focus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "focus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCoverage_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCoverage_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (coverageTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CoverageType"
		   });	
		addAnnotation
		  (coverageTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CoverageType:Object",
			 "baseType", "CoverageType"
		   });	
		addAnnotation
		  (createActionEClass, 
		   source, 
		   new String[] {
			 "name", "CreateAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCreateAction_ActionSentence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionSentence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dataEventTriggerEClass, 
		   source, 
		   new String[] {
			 "name", "DataEventTrigger",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDataEventTrigger_TriggerType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "triggerType"
		   });	
		addAnnotation
		  (dataEventTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DataEventType"
		   });	
		addAnnotation
		  (dataEventTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DataEventType:Object",
			 "baseType", "DataEventType"
		   });	
		addAnnotation
		  (dataModelsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dataModels_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDataModelsType_ModelReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (declareResponseActionEClass, 
		   source, 
		   new String[] {
			 "name", "DeclareResponseAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDeclareResponseAction_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (documentationItemEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentationItem",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDocumentationItem_Prompt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prompt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_AdditionalInstructions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "additionalInstructions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_TextAfterResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textAfterResponse",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_ItemCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_ResponseDataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "responseDataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_ResponseCardinality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "responseCardinality",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentationItem_ResponseRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "responseRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_KnowledgeDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "knowledgeDocument",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (enumerationConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "EnumerationConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnumerationConstraint_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationConstraint_StrictSelection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strictSelection"
		   });	
		addAnnotation
		  (enumerationItemEClass, 
		   source, 
		   new String[] {
			 "name", "EnumerationItem",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnumerationItem_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_Codes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_DisplayText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "displayText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_AdditionalInstructions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "additionalInstructions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_ValueMeaning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "valueMeaning",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnumerationItem_FillIn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillIn"
		   });	
		addAnnotation
		  (eventHistoryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "eventHistory_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventHistoryType_ArtifactLifeCycleEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "artifactLifeCycleEvent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "EventType"
		   });	
		addAnnotation
		  (eventTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "EventType:Object",
			 "baseType", "EventType"
		   });	
		addAnnotation
		  (eventTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "eventType_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEventTypeType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (evidenceEClass, 
		   source, 
		   new String[] {
			 "name", "Evidence",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEvidence_QualityOfEvidence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "qualityOfEvidence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEvidence_StrengthOfRecommendation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strengthOfRecommendation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEvidence_Resources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (expressionConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "ExpressionConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExpressionConstraint_Constraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constraint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (expressionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "expressions_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExpressionsType_Def(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "def",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (externalDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "externalData_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExternalDataType_Codesystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codesystem",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExternalDataType_Valueset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "valueset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExternalDataType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExternalDataType_Def(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "def",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExternalDataType_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trigger",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (fireEventActionEClass, 
		   source, 
		   new String[] {
			 "name", "FireEventAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFireEventAction_EventType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eventType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFireEventAction_ActionSentence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionSentence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (focusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "focus_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFocusType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (formattedNumberEClass, 
		   source, 
		   new String[] {
			 "name", "FormattedNumber",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFormattedNumber_Label(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattedNumber_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattedNumber_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (formattedTextEClass, 
		   source, 
		   new String[] {
			 "name", "FormattedText",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFormattedText_Label(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattedText_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattedText_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (groupOrganizationBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "GroupOrganizationBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (groupOrganizationBehaviorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "GroupOrganizationBehaviorType"
		   });	
		addAnnotation
		  (groupOrganizationBehaviorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "GroupOrganizationBehaviorType:Object",
			 "baseType", "GroupOrganizationBehaviorType"
		   });	
		addAnnotation
		  (groupSelectionBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "GroupSelectionBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (groupSelectionBehaviorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "GroupSelectionBehaviorType"
		   });	
		addAnnotation
		  (groupSelectionBehaviorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "GroupSelectionBehaviorType:Object",
			 "baseType", "GroupSelectionBehaviorType"
		   });	
		addAnnotation
		  (identifiersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "identifiers_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIdentifiersType_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (identifiersType1EClass, 
		   source, 
		   new String[] {
			 "name", "identifiers_._1_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIdentifiersType1_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (inlineResourceEClass, 
		   source, 
		   new String[] {
			 "name", "InlineResource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInlineResource_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (itemCodesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "itemCodes_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemCodesType_ItemCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemCode",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (itemDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "ItemDefinition",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemDefinition_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getItemDefinition_ScopedIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scopedIdentifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (keyTermsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "keyTerms_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getKeyTermsType_Term(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "term",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (knowledgeDocumentEClass, 
		   source, 
		   new String[] {
			 "name", "KnowledgeDocument",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getKnowledgeDocument_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_ExternalData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalData",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_Expressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expressions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_Triggers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "triggers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_Conditions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_Behaviors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "behaviors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeDocument_ActionGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionGroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (knowledgeResourceEClass, 
		   source, 
		   new String[] {
			 "name", "KnowledgeResource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getKnowledgeResource_Identifiers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifiers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeResource_TemplateIds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "templateIds",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeResource_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeResource_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeResource_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getKnowledgeResource_Citation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "citation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (librariesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "libraries_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLibrariesType_LibraryReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "libraryReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (libraryReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "LibraryReference",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLibraryReference_MediaType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mediaType"
		   });	
		addAnnotation
		  (getLibraryReference_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getLibraryReference_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });	
		addAnnotation
		  (getLibraryReference_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (lookupConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "LookupConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLookupConstraint_Items(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "items",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLookupConstraint_DisplayField(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayField"
		   });	
		addAnnotation
		  (getLookupConstraint_StrictSelection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strictSelection"
		   });	
		addAnnotation
		  (maskConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "MaskConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMaskConstraint_MaskExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maskExpression",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMaskConstraint_MaskHelp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maskHelp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (metadataEClass, 
		   source, 
		   new String[] {
			 "name", "Metadata",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMetadata_Identifiers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifiers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_ArtifactType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "artifactType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_SchemaIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schemaIdentifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_TemplateIds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "templateIds",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_DataModels(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataModels",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Libraries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "libraries",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "documentation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_RelatedResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relatedResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_SupportingEvidence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportingEvidence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Applicability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "applicability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_KeyTerms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyTerms",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Categories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categories",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_EventHistory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eventHistory",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Contributions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contributions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_Publishers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMetadata_UsageTerms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usageTerms",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (modelReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "ModelReference",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getModelReference_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getModelReference_ReferencedModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedModel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (namedEventTriggerEClass, 
		   source, 
		   new String[] {
			 "name", "NamedEventTrigger",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNamedEventTrigger_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (organizationEClass, 
		   source, 
		   new String[] {
			 "name", "Organization",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganization_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (partyEClass, 
		   source, 
		   new String[] {
			 "name", "Party",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getParty_Addresses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "addresses",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParty_Contacts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contacts",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (periodicEventTriggerEClass, 
		   source, 
		   new String[] {
			 "name", "PeriodicEventTrigger",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (permissionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "permissions_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPermissionsType_Permissions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "permissions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "Person",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPerson_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPerson_Affiliation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "affiliation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (precheckBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "PrecheckBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (precheckBehaviorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PrecheckBehaviorType"
		   });	
		addAnnotation
		  (precheckBehaviorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PrecheckBehaviorType:Object",
			 "baseType", "PrecheckBehaviorType"
		   });	
		addAnnotation
		  (publishersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "publishers_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPublishersType_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rangeConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "RangeConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRangeConstraint_ConstraintType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constraintType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rangeConstraintTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RangeConstraintType"
		   });	
		addAnnotation
		  (rangeConstraintTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RangeConstraintType:Object",
			 "baseType", "RangeConstraintType"
		   });	
		addAnnotation
		  (readOnlyBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "ReadOnlyBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (referencedModelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "referencedModel_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getReferencedModelType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (relatedResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relatedResources_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRelatedResourcesType_RelatedResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relatedResource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (relationshipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationship_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRelationshipType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (removeActionEClass, 
		   source, 
		   new String[] {
			 "name", "RemoveAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRemoveAction_ActionSentence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionSentence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (representedConceptsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "representedConcepts_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRepresentedConceptsType_Concept(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "concept",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (requiredBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "RequiredBehavior",
			 "kind", "empty"
		   });	
		addAnnotation
		  (requiredBehaviorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RequiredBehaviorType"
		   });	
		addAnnotation
		  (requiredBehaviorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RequiredBehaviorType:Object",
			 "baseType", "RequiredBehaviorType"
		   });	
		addAnnotation
		  (resourceRelationshipReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRelationshipReference",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResourceRelationshipReference_Relationship(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relationship",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceRelationshipReference_Resources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceRelationshipTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ResourceRelationshipType"
		   });	
		addAnnotation
		  (resourceRelationshipTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ResourceRelationshipType:Object",
			 "baseType", "ResourceRelationshipType"
		   });	
		addAnnotation
		  (resourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resources_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResourcesType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (responseBindingEClass, 
		   source, 
		   new String[] {
			 "name", "ResponseBinding",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResponseBinding_Container(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "container"
		   });	
		addAnnotation
		  (getResponseBinding_Property(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property"
		   });	
		addAnnotation
		  (responseCardinalityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "responseCardinality_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResponseCardinalityType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (responseDataTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "responseDataType_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResponseDataTypeType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (rightsDeclarationEClass, 
		   source, 
		   new String[] {
			 "name", "RightsDeclaration",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRightsDeclaration_AssertedRights(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assertedRights",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRightsDeclaration_RightsHolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rightsHolder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRightsDeclaration_Permissions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "permissions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (roleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "role_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRoleType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (statusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "status_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getStatusType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (subElementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "subElements_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubElementsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getSubElementsType_SimpleAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleAction",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getSubElementsType_ActionGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionGroup",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getSubElementsType_ActionRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionRef",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (supportingEvidenceEClass, 
		   source, 
		   new String[] {
			 "name", "SupportingEvidence",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSupportingEvidence_Evidence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "evidence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (supportingResourceEClass, 
		   source, 
		   new String[] {
			 "name", "SupportingResource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSupportingResource_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (templateIdsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "templateIds_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTemplateIdsType_TemplateId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "templateId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (templateIdsType1EClass, 
		   source, 
		   new String[] {
			 "name", "templateIds_._1_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTemplateIdsType1_TemplateId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "templateId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "name", "Trigger",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTrigger_Def(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "def",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Identifiers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifiers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_TextEquivalent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textEquivalent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (triggersEClass, 
		   source, 
		   new String[] {
			 "name", "Triggers",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTriggers_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trigger",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (updateActionEClass, 
		   source, 
		   new String[] {
			 "name", "UpdateAction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUpdateAction_ActionSentence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionSentence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (usageTermsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "usageTerms_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUsageTermsType_RightsDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rightsDeclaration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (valueSetConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "ValueSetConstraint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getValueSetConstraint_ValueSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "valueSet",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (valueTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ValueType"
		   });	
		addAnnotation
		  (valueTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ValueType:Object",
			 "baseType", "ValueType"
		   });	
		addAnnotation
		  (versionedIdentifierEClass, 
		   source, 
		   new String[] {
			 "name", "VersionedIdentifier",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getVersionedIdentifier_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (visualStyleBehaviorEClass, 
		   source, 
		   new String[] {
			 "name", "VisualStyleBehavior",
			 "kind", "empty"
		   });
	}

} //R1PackageImpl
