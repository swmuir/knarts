/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.elm.r1.R1Package;

import org.hl7.elm.r1.impl.R1PackageImpl;

import org.hl7.knowledgeartifact.r2.R2Factory;
import org.hl7.knowledgeartifact.r2.R2Package;

import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R2PackageImpl extends EPackageImpl implements R2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "r2.ecore";

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
	private EClass artifactSummaryEClass = null;

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
	private EClass artifactTypeType1EClass = null;

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
	private EClass bindingModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingModelType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingTypeTypeEClass = null;

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
	private EClass codingEClass = null;

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
	private EClass completionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEventBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEventMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

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
	private EClass containedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedArtifactListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentHashTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentSignifierEClass = null;

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
	private EClass contextEClass = null;

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
	private EClass controlBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllingArtifactTypeEClass = null;

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
	private EClass eventBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBindingTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefTypeEClass = null;

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
	private EClass eventNameTypeEClass = null;

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
	private EClass identifiersType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialArtifactTypeEClass = null;

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
	private EClass manifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingTypeEClass = null;

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
	private EClass metadataBindingEClass = null;

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
	private EClass namedEventDefEClass = null;

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
	private EClass nameTypeEClass = null;

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
	private EClass referenceEClass = null;

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
	private EClass referenceListEClass = null;

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
	private EClass specificEventBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificMetadataBindingEClass = null;

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
	private EClass triggerBindingsEClass = null;

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
	private EClass urlTypeEClass = null;

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
	private EClass uuidTypeEClass = null;

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
	private EClass wrappedContentEClass = null;

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
	private EEnum metadataBindingTypeEEnum = null;

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
	private EDataType metadataBindingTypeObjectEDataType = null;

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
	 * @see org.hl7.knowledgeartifact.r2.R2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private R2PackageImpl() {
		super(eNS_URI, R2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link R2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static R2Package init() {
		if (isInited) return (R2Package)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI);

		// Obtain or create and register package
		R2PackageImpl theR2Package = (R2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof R2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new R2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		org.hl7.cdsdt.r2.impl.R2PackageImpl theR2Package_1 = (org.hl7.cdsdt.r2.impl.R2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.hl7.cdsdt.r2.R2Package.eNS_URI) instanceof org.hl7.cdsdt.r2.impl.R2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.hl7.cdsdt.r2.R2Package.eNS_URI) : org.hl7.cdsdt.r2.R2Package.eINSTANCE);
		R1PackageImpl theR1Package = (R1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI) instanceof R1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI) : R1Package.eINSTANCE);

		// Load packages
		theR2Package.loadPackage();
		theR1Package.loadPackage();

		// Create package meta-data objects
		theR2Package_1.createPackageContents();

		// Initialize created meta-data
		theR2Package_1.initializePackageContents();

		// Fix loaded packages
		theR2Package.fixPackageContents();
		theR1Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theR2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(R2Package.eNS_URI, theR2Package);
		return theR2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBase() {
		if (actionBaseEClass == null) {
			actionBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(0);
		}
		return actionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_ActionId() {
        return (EReference)getActionBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Number() {
        return (EReference)getActionBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_SupportingEvidence() {
        return (EReference)getActionBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_SupportingResources() {
        return (EReference)getActionBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Actors() {
        return (EReference)getActionBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Behaviors() {
        return (EReference)getActionBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBase_Conditions() {
        return (EReference)getActionBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBase_Order() {
        return (EAttribute)getActionBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionGroup() {
		if (actionGroupEClass == null) {
			actionGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(1);
		}
		return actionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Title() {
        return (EReference)getActionGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Description() {
        return (EReference)getActionGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_RepresentedConcepts() {
        return (EReference)getActionGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_SubElements() {
        return (EReference)getActionGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRef() {
		if (actionRefEClass == null) {
			actionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(2);
		}
		return actionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRef_LibraryName() {
        return (EAttribute)getActionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRef_ReferencedActionId() {
        return (EAttribute)getActionRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		if (actorEClass == null) {
			actorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(3);
		}
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Actor() {
        return (EReference)getActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorsType() {
		if (actorsTypeEClass == null) {
			actorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(4);
		}
		return actorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorsType_Actor() {
        return (EReference)getActorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressesType() {
		if (addressesTypeEClass == null) {
			addressesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(5);
		}
		return addressesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressesType_Address() {
        return (EReference)getAddressesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicabilityType() {
		if (applicabilityTypeEClass == null) {
			applicabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(6);
		}
		return applicabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicabilityType_Coverage() {
        return (EReference)getApplicabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactLifeCycleEvent() {
		if (artifactLifeCycleEventEClass == null) {
			artifactLifeCycleEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(7);
		}
		return artifactLifeCycleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactLifeCycleEvent_EventType() {
        return (EReference)getArtifactLifeCycleEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactLifeCycleEvent_EventDateTime() {
        return (EReference)getArtifactLifeCycleEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactSummary() {
		if (artifactSummaryEClass == null) {
			artifactSummaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(12);
		}
		return artifactSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_Name() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_Identifier() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_ArtifactType() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_Size() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_Hash() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSummary_Signatures() {
        return (EReference)getArtifactSummary().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactTypeType() {
		if (artifactTypeTypeEClass == null) {
			artifactTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(15);
		}
		return artifactTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeType_Value() {
        return (EAttribute)getArtifactTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactTypeType1() {
		if (artifactTypeType1EClass == null) {
			artifactTypeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(16);
		}
		return artifactTypeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeType1_Value() {
        return (EAttribute)getArtifactTypeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicAction() {
		if (atomicActionEClass == null) {
			atomicActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(17);
		}
		return atomicActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicAction_TextEquivalent() {
        return (EReference)getAtomicAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		if (behaviorEClass == null) {
			behaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(18);
		}
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Value() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviors() {
		if (behaviorsEClass == null) {
			behaviorsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(19);
		}
		return behaviorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviors_Behavior() {
        return (EReference)getBehaviors().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingModelType() {
		if (bindingModelTypeEClass == null) {
			bindingModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(20);
		}
		return bindingModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingModelType_Model() {
        return (EAttribute)getBindingModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingModelType1() {
		if (bindingModelType1EClass == null) {
			bindingModelType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(21);
		}
		return bindingModelType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingModelType1_Model() {
        return (EAttribute)getBindingModelType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingNameType() {
		if (bindingNameTypeEClass == null) {
			bindingNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(22);
		}
		return bindingNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingNameType_Value() {
        return (EAttribute)getBindingNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingType() {
		if (bindingTypeEClass == null) {
			bindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(23);
		}
		return bindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingType_Model() {
        return (EAttribute)getBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingTypeType() {
		if (bindingTypeTypeEClass == null) {
			bindingTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(24);
		}
		return bindingTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingTypeType_Binding() {
        return (EAttribute)getBindingTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityBehavior() {
		if (cardinalityBehaviorEClass == null) {
			cardinalityBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(26);
		}
		return cardinalityBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoriesType() {
		if (categoriesTypeEClass == null) {
			categoriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(30);
		}
		return categoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoriesType_Category() {
        return (EReference)getCategoriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodesType() {
		if (codesTypeEClass == null) {
			codesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(31);
		}
		return codesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodesType_Code() {
        return (EReference)getCodesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoding() {
		if (codingEClass == null) {
			codingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(32);
		}
		return codingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_System() {
        return (EReference)getCoding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Version() {
        return (EReference)getCoding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Display() {
        return (EReference)getCoding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Code() {
        return (EReference)getCoding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_UserSeclected() {
        return (EReference)getCoding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectInformationAction() {
		if (collectInformationActionEClass == null) {
			collectInformationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(33);
		}
		return collectInformationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_DocumentationConcept() {
        return (EReference)getCollectInformationAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_InitialValue() {
        return (EReference)getCollectInformationAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectInformationAction_ResponseBinding() {
        return (EReference)getCollectInformationAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletion() {
		if (completionEClass == null) {
			completionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(34);
		}
		return completionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletion_EventDefinition() {
        return (EReference)getCompletion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletion_ActionGroup() {
        return (EReference)getCompletion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentEventBinding() {
		if (componentEventBindingEClass == null) {
			componentEventBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(37);
		}
		return componentEventBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventBinding_BindingModel() {
        return (EReference)getComponentEventBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentEventBinding_ComponentId() {
        return (EAttribute)getComponentEventBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventBinding_IncomingBindings() {
        return (EReference)getComponentEventBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventBinding_OutgoingBindings() {
        return (EReference)getComponentEventBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventBinding_Triggers() {
        return (EReference)getComponentEventBinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentEventMappings() {
		if (componentEventMappingsEClass == null) {
			componentEventMappingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(38);
		}
		return componentEventMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventMappings_ComponentId() {
        return (EReference)getComponentEventMappings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentEventMappings_Binding() {
        return (EReference)getComponentEventMappings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		if (compositeEClass == null) {
			compositeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(39);
		}
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Metadata() {
        return (EReference)getComposite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_ControlBlock() {
        return (EReference)getComposite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Manifest() {
        return (EReference)getComposite().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_ContainedArtifacts() {
        return (EReference)getComposite().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(40);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Logic() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionRole() {
        return (EReference)getCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionRoleType1() {
		if (conditionRoleType1EClass == null) {
			conditionRoleType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(42);
		}
		return conditionRoleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionRoleType1_Value() {
        return (EAttribute)getConditionRoleType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditions() {
		if (conditionsEClass == null) {
			conditionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(44);
		}
		return conditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditions_Condition() {
        return (EReference)getConditions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintTypeType() {
		if (constraintTypeTypeEClass == null) {
			constraintTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(45);
		}
		return constraintTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintTypeType_Value() {
        return (EAttribute)getConstraintTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactsType() {
		if (contactsTypeEClass == null) {
			contactsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(46);
		}
		return contactsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactsType_Contact() {
        return (EReference)getContactsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedArtifact() {
		if (containedArtifactEClass == null) {
			containedArtifactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(47);
		}
		return containedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_ArtifactType() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_Name() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_BindingName() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_InclusionCriteria() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_Context() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_EventBinding() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_MetadataBinding() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedArtifact_Group() {
        return (EAttribute)getContainedArtifact().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_WrappedContent() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_Reference() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_KnowledgeDocument() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_MustUnderstand() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifact_OnCompletion() {
        return (EReference)getContainedArtifact().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedArtifactList() {
		if (containedArtifactListEClass == null) {
			containedArtifactListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(48);
		}
		return containedArtifactListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainedArtifactList_Artifact() {
        return (EReference)getContainedArtifactList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentHashType() {
		if (contentHashTypeEClass == null) {
			contentHashTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(49);
		}
		return contentHashTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentHashType_Hashvalue() {
        return (EAttribute)getContentHashType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentSignifier() {
		if (contentSignifierEClass == null) {
			contentSignifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(50);
		}
		return contentSignifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentSignifier_Type() {
        return (EReference)getContentSignifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentSignifier_Form() {
        return (EReference)getContentSignifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType() {
		if (contentTypeEClass == null) {
			contentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(51);
		}
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Div() {
        return (EReference)getContentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		if (contextEClass == null) {
			contextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(52);
		}
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		if (contributionEClass == null) {
			contributionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(53);
		}
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Contributor() {
        return (EReference)getContribution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Role() {
        return (EReference)getContribution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributionsType() {
		if (contributionsTypeEClass == null) {
			contributionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(54);
		}
		return contributionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionsType_Contribution() {
        return (EReference)getContributionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlBlock() {
		if (controlBlockEClass == null) {
			controlBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(57);
		}
		return controlBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_Context() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_EventActivation() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_Propagation() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_Mapping() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_ControllingArtifact() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlBlock_InitialArtifact() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllingArtifactType() {
		if (controllingArtifactTypeEClass == null) {
			controllingArtifactTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(58);
		}
		return controllingArtifactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllingArtifactType_BindingName() {
        return (EAttribute)getControllingArtifactType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		if (coverageEClass == null) {
			coverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(59);
		}
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Focus() {
        return (EReference)getCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Description() {
        return (EReference)getCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Value() {
        return (EReference)getCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAction() {
		if (createActionEClass == null) {
			createActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(62);
		}
		return createActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateAction_ActionSentence() {
        return (EReference)getCreateAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEventTrigger() {
		if (dataEventTriggerEClass == null) {
			dataEventTriggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(63);
		}
		return dataEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEventTrigger_TriggerType() {
        return (EAttribute)getDataEventTrigger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModelsType() {
		if (dataModelsTypeEClass == null) {
			dataModelsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(66);
		}
		return dataModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModelsType_ModelReference() {
        return (EReference)getDataModelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareResponseAction() {
		if (declareResponseActionEClass == null) {
			declareResponseActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(67);
		}
		return declareResponseActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareResponseAction_Name() {
        return (EAttribute)getDeclareResponseAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationItem() {
		if (documentationItemEClass == null) {
			documentationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(68);
		}
		return documentationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_Prompt() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_AdditionalInstructions() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_TextAfterResponse() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_Description() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ItemCodes() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseDataType() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseCardinality() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationItem_ResponseRange() {
        return (EReference)getDocumentationItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(69);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeKnowledgeDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KnowledgeDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationConstraint() {
		if (enumerationConstraintEClass == null) {
			enumerationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(70);
		}
		return enumerationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationConstraint_Item() {
        return (EReference)getEnumerationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationConstraint_StrictSelection() {
        return (EAttribute)getEnumerationConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationItem() {
		if (enumerationItemEClass == null) {
			enumerationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(71);
		}
		return enumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Identifier() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Number() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Value() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_Codes() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_DisplayText() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_AdditionalInstructions() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_ValueMeaning() {
        return (EReference)getEnumerationItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationItem_FillIn() {
        return (EAttribute)getEnumerationItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBinding() {
		if (eventBindingEClass == null) {
			eventBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(72);
		}
		return eventBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinding_BindingModel() {
        return (EReference)getEventBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinding_IncomingBindings() {
        return (EReference)getEventBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinding_OutgoingBindings() {
        return (EReference)getEventBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinding_Triggers() {
        return (EReference)getEventBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBindingTypeType() {
		if (eventBindingTypeTypeEClass == null) {
			eventBindingTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(73);
		}
		return eventBindingTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBindingTypeType_Binding() {
        return (EAttribute)getEventBindingTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDefType() {
		if (eventDefTypeEClass == null) {
			eventDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(74);
		}
		return eventDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventDefType_EventType() {
        return (EAttribute)getEventDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHistoryType() {
		if (eventHistoryTypeEClass == null) {
			eventHistoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(75);
		}
		return eventHistoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHistoryType_ArtifactLifeCycleEvent() {
        return (EReference)getEventHistoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventNameType() {
		if (eventNameTypeEClass == null) {
			eventNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(76);
		}
		return eventNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventNameType_Name() {
        return (EAttribute)getEventNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTypeType() {
		if (eventTypeTypeEClass == null) {
			eventTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(79);
		}
		return eventTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTypeType_Value() {
        return (EAttribute)getEventTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidence() {
		if (evidenceEClass == null) {
			evidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(80);
		}
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_QualityOfEvidence() {
        return (EReference)getEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_StrengthOfRecommendation() {
        return (EReference)getEvidence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_Resources() {
        return (EReference)getEvidence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionConstraint() {
		if (expressionConstraintEClass == null) {
			expressionConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(81);
		}
		return expressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionConstraint_Constraint() {
        return (EReference)getExpressionConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionsType() {
		if (expressionsTypeEClass == null) {
			expressionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(82);
		}
		return expressionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionsType_Def() {
        return (EReference)getExpressionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataType() {
		if (externalDataTypeEClass == null) {
			externalDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(83);
		}
		return externalDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Codesystem() {
        return (EReference)getExternalDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Valueset() {
        return (EReference)getExternalDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Parameter() {
        return (EReference)getExternalDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Def() {
        return (EReference)getExternalDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDataType_Trigger() {
        return (EReference)getExternalDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFireEventAction() {
		if (fireEventActionEClass == null) {
			fireEventActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(84);
		}
		return fireEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFireEventAction_EventType() {
        return (EReference)getFireEventAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFireEventAction_ActionSentence() {
        return (EReference)getFireEventAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFocusType() {
		if (focusTypeEClass == null) {
			focusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(85);
		}
		return focusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocusType_Value() {
        return (EAttribute)getFocusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattedNumber() {
		if (formattedNumberEClass == null) {
			formattedNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(86);
		}
		return formattedNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Label() {
        return (EAttribute)getFormattedNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Style() {
        return (EAttribute)getFormattedNumber().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedNumber_Value() {
        return (EAttribute)getFormattedNumber().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattedText() {
		if (formattedTextEClass == null) {
			formattedTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(87);
		}
		return formattedTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Label() {
        return (EAttribute)getFormattedText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Style() {
        return (EAttribute)getFormattedText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedText_Value() {
        return (EAttribute)getFormattedText().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupOrganizationBehavior() {
		if (groupOrganizationBehaviorEClass == null) {
			groupOrganizationBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(88);
		}
		return groupOrganizationBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupSelectionBehavior() {
		if (groupSelectionBehaviorEClass == null) {
			groupSelectionBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(91);
		}
		return groupSelectionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiersType() {
		if (identifiersTypeEClass == null) {
			identifiersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(94);
		}
		return identifiersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiersType_Identifier() {
        return (EReference)getIdentifiersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiersType1() {
		if (identifiersType1EClass == null) {
			identifiersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(95);
		}
		return identifiersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiersType1_Identifier() {
        return (EReference)getIdentifiersType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiersType2() {
		if (identifiersType2EClass == null) {
			identifiersType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(96);
		}
		return identifiersType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiersType2_Identifier() {
        return (EReference)getIdentifiersType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialArtifactType() {
		if (initialArtifactTypeEClass == null) {
			initialArtifactTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(97);
		}
		return initialArtifactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialArtifactType_BindingName() {
        return (EAttribute)getInitialArtifactType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineResource() {
		if (inlineResourceEClass == null) {
			inlineResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(98);
		}
		return inlineResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineResource_Content() {
        return (EReference)getInlineResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemCodesType() {
		if (itemCodesTypeEClass == null) {
			itemCodesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(99);
		}
		return itemCodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemCodesType_ItemCode() {
        return (EReference)getItemCodesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemDefinition() {
		if (itemDefinitionEClass == null) {
			itemDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(100);
		}
		return itemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_Identifier() {
        return (EReference)getItemDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_ScopedIdentifier() {
        return (EReference)getItemDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyTermsType() {
		if (keyTermsTypeEClass == null) {
			keyTermsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(101);
		}
		return keyTermsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyTermsType_Term() {
        return (EReference)getKeyTermsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeDocument() {
		if (knowledgeDocumentEClass == null) {
			knowledgeDocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(102);
		}
		return knowledgeDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Metadata() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_ExternalData() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Expressions() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Triggers() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Conditions() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_Behaviors() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeDocument_ActionGroup() {
        return (EReference)getKnowledgeDocument().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeResource() {
		if (knowledgeResourceEClass == null) {
			knowledgeResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(103);
		}
		return knowledgeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Identifiers() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_TemplateIds() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Title() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Location() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Description() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeResource_Citation() {
        return (EReference)getKnowledgeResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrariesType() {
		if (librariesTypeEClass == null) {
			librariesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(104);
		}
		return librariesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrariesType_LibraryReference() {
        return (EReference)getLibrariesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryReference() {
		if (libraryReferenceEClass == null) {
			libraryReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(105);
		}
		return libraryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_MediaType() {
        return (EAttribute)getLibraryReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Name() {
        return (EAttribute)getLibraryReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Path() {
        return (EAttribute)getLibraryReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryReference_Version() {
        return (EAttribute)getLibraryReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupConstraint() {
		if (lookupConstraintEClass == null) {
			lookupConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(106);
		}
		return lookupConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupConstraint_Items() {
        return (EReference)getLookupConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupConstraint_DisplayField() {
        return (EAttribute)getLookupConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupConstraint_StrictSelection() {
        return (EAttribute)getLookupConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifest() {
		if (manifestEClass == null) {
			manifestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(107);
		}
		return manifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifest_ArtifactSummary() {
        return (EReference)getManifest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingType() {
		if (mappingTypeEClass == null) {
			mappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(108);
		}
		return mappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingType_ComponentEventMappings() {
        return (EReference)getMappingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskConstraint() {
		if (maskConstraintEClass == null) {
			maskConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(109);
		}
		return maskConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskConstraint_MaskExpression() {
        return (EReference)getMaskConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskConstraint_MaskHelp() {
        return (EReference)getMaskConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		if (metadataEClass == null) {
			metadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(110);
		}
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Identifiers() {
        return (EReference)getMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_ArtifactType() {
        return (EReference)getMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_SchemaIdentifier() {
        return (EReference)getMetadata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_TemplateIds() {
        return (EReference)getMetadata().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_DataModels() {
        return (EReference)getMetadata().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Libraries() {
        return (EReference)getMetadata().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Title() {
        return (EReference)getMetadata().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Description() {
        return (EReference)getMetadata().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Documentation() {
        return (EReference)getMetadata().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_RelatedResources() {
        return (EReference)getMetadata().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_SupportingEvidence() {
        return (EReference)getMetadata().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Applicability() {
        return (EReference)getMetadata().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_KeyTerms() {
        return (EReference)getMetadata().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Categories() {
        return (EReference)getMetadata().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Language() {
        return (EReference)getMetadata().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Status() {
        return (EReference)getMetadata().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_EventHistory() {
        return (EReference)getMetadata().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Contributions() {
        return (EReference)getMetadata().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Publishers() {
        return (EReference)getMetadata().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_UsageTerms() {
        return (EReference)getMetadata().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataBinding() {
		if (metadataBindingEClass == null) {
			metadataBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(111);
		}
		return metadataBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataBinding_Bindings() {
        return (EReference)getMetadataBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		if (modelReferenceEClass == null) {
			modelReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(114);
		}
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Description() {
        return (EReference)getModelReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_ReferencedModel() {
        return (EReference)getModelReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedEventDef() {
		if (namedEventDefEClass == null) {
			namedEventDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(115);
		}
		return namedEventDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedEventDef_EventName() {
        return (EReference)getNamedEventDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedEventTrigger() {
		if (namedEventTriggerEClass == null) {
			namedEventTriggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(116);
		}
		return namedEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedEventTrigger_OnEventName() {
        return (EAttribute)getNamedEventTrigger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType() {
		if (nameTypeEClass == null) {
			nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(117);
		}
		return nameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_Value() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		if (organizationEClass == null) {
			organizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(118);
		}
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Name() {
        return (EReference)getOrganization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParty() {
		if (partyEClass == null) {
			partyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(119);
		}
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Addresses() {
        return (EReference)getParty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Contacts() {
        return (EReference)getParty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicEventTrigger() {
		if (periodicEventTriggerEClass == null) {
			periodicEventTriggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(120);
		}
		return periodicEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissionsType() {
		if (permissionsTypeEClass == null) {
			permissionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(121);
		}
		return permissionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissionsType_Permissions() {
        return (EReference)getPermissionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		if (personEClass == null) {
			personEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(122);
		}
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name() {
        return (EReference)getPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Affiliation() {
        return (EReference)getPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecheckBehavior() {
		if (precheckBehaviorEClass == null) {
			precheckBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(123);
		}
		return precheckBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishersType() {
		if (publishersTypeEClass == null) {
			publishersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(126);
		}
		return publishersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishersType_Publisher() {
        return (EReference)getPublishersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeConstraint() {
		if (rangeConstraintEClass == null) {
			rangeConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(127);
		}
		return rangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConstraint_ConstraintType() {
        return (EReference)getRangeConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadOnlyBehavior() {
		if (readOnlyBehaviorEClass == null) {
			readOnlyBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(130);
		}
		return readOnlyBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(131);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Url() {
        return (EReference)getReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_ContentHash() {
        return (EReference)getReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Uuid() {
        return (EReference)getReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Identifiers() {
        return (EReference)getReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedModelType() {
		if (referencedModelTypeEClass == null) {
			referencedModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(132);
		}
		return referencedModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencedModelType_Value() {
        return (EAttribute)getReferencedModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceList() {
		if (referenceListEClass == null) {
			referenceListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(133);
		}
		return referenceListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceList_Reference() {
        return (EReference)getReferenceList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedResourcesType() {
		if (relatedResourcesTypeEClass == null) {
			relatedResourcesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(134);
		}
		return relatedResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedResourcesType_RelatedResource() {
        return (EReference)getRelatedResourcesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		if (relationshipTypeEClass == null) {
			relationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(135);
		}
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Value() {
        return (EAttribute)getRelationshipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAction() {
		if (removeActionEClass == null) {
			removeActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(136);
		}
		return removeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveAction_ActionSentence() {
        return (EReference)getRemoveAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentedConceptsType() {
		if (representedConceptsTypeEClass == null) {
			representedConceptsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(137);
		}
		return representedConceptsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentedConceptsType_Concept() {
        return (EReference)getRepresentedConceptsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBehavior() {
		if (requiredBehaviorEClass == null) {
			requiredBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(138);
		}
		return requiredBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRelationshipReference() {
		if (resourceRelationshipReferenceEClass == null) {
			resourceRelationshipReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(141);
		}
		return resourceRelationshipReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRelationshipReference_Relationship() {
        return (EReference)getResourceRelationshipReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRelationshipReference_Resources() {
        return (EReference)getResourceRelationshipReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesType() {
		if (resourcesTypeEClass == null) {
			resourcesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(144);
		}
		return resourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesType_Resource() {
        return (EReference)getResourcesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBinding() {
		if (responseBindingEClass == null) {
			responseBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(145);
		}
		return responseBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBinding_Container() {
        return (EAttribute)getResponseBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseBinding_Property() {
        return (EAttribute)getResponseBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseCardinalityType() {
		if (responseCardinalityTypeEClass == null) {
			responseCardinalityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(146);
		}
		return responseCardinalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseCardinalityType_Value() {
        return (EAttribute)getResponseCardinalityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDataTypeType() {
		if (responseDataTypeTypeEClass == null) {
			responseDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(147);
		}
		return responseDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseDataTypeType_Value() {
        return (EAttribute)getResponseDataTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightsDeclaration() {
		if (rightsDeclarationEClass == null) {
			rightsDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(148);
		}
		return rightsDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_AssertedRights() {
        return (EReference)getRightsDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_RightsHolder() {
        return (EReference)getRightsDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsDeclaration_Permissions() {
        return (EReference)getRightsDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		if (roleTypeEClass == null) {
			roleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(149);
		}
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Value() {
        return (EAttribute)getRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificEventBinding() {
		if (specificEventBindingEClass == null) {
			specificEventBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(150);
		}
		return specificEventBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificEventBinding_Group() {
        return (EAttribute)getSpecificEventBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificEventBinding_ContainerEvent() {
        return (EAttribute)getSpecificEventBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificEventBinding_EventBindingType() {
        return (EReference)getSpecificEventBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificEventBinding_ComponentEvent() {
        return (EAttribute)getSpecificEventBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificEventBinding_Mutability() {
        return (EReference)getSpecificEventBinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificMetadataBinding() {
		if (specificMetadataBindingEClass == null) {
			specificMetadataBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(151);
		}
		return specificMetadataBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificMetadataBinding_BindingType() {
        return (EReference)getSpecificMetadataBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificMetadataBinding_Metadata() {
        return (EReference)getSpecificMetadataBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusType() {
		if (statusTypeEClass == null) {
			statusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(152);
		}
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_Value() {
        return (EAttribute)getStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubElementsType() {
		if (subElementsTypeEClass == null) {
			subElementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(153);
		}
		return subElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubElementsType_Group() {
        return (EAttribute)getSubElementsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_SimpleAction() {
        return (EReference)getSubElementsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_ActionGroup() {
        return (EReference)getSubElementsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementsType_ActionRef() {
        return (EReference)getSubElementsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingEvidence() {
		if (supportingEvidenceEClass == null) {
			supportingEvidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(154);
		}
		return supportingEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportingEvidence_Evidence() {
        return (EReference)getSupportingEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingResource() {
		if (supportingResourceEClass == null) {
			supportingResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(155);
		}
		return supportingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportingResource_Resource() {
        return (EReference)getSupportingResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateIdsType() {
		if (templateIdsTypeEClass == null) {
			templateIdsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(156);
		}
		return templateIdsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateIdsType_TemplateId() {
        return (EReference)getTemplateIdsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateIdsType1() {
		if (templateIdsType1EClass == null) {
			templateIdsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(157);
		}
		return templateIdsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateIdsType1_TemplateId() {
        return (EReference)getTemplateIdsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		if (triggerEClass == null) {
			triggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(158);
		}
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Def() {
        return (EReference)getTrigger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Identifiers() {
        return (EReference)getTrigger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_TextEquivalent() {
        return (EReference)getTrigger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerBindings() {
		if (triggerBindingsEClass == null) {
			triggerBindingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(159);
		}
		return triggerBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerBindings_Group() {
        return (EAttribute)getTriggerBindings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerBindings_Trigger() {
        return (EReference)getTriggerBindings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggers() {
		if (triggersEClass == null) {
			triggersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(160);
		}
		return triggersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggers_Trigger() {
        return (EReference)getTriggers().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAction() {
		if (updateActionEClass == null) {
			updateActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(161);
		}
		return updateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAction_ActionSentence() {
        return (EReference)getUpdateAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlType() {
		if (urlTypeEClass == null) {
			urlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(162);
		}
		return urlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Address() {
        return (EAttribute)getUrlType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageTermsType() {
		if (usageTermsTypeEClass == null) {
			usageTermsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(163);
		}
		return usageTermsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageTermsType_RightsDeclaration() {
        return (EReference)getUsageTermsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUuidType() {
		if (uuidTypeEClass == null) {
			uuidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(164);
		}
		return uuidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUuidType_Value() {
        return (EAttribute)getUuidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		if (valueSetConstraintEClass == null) {
			valueSetConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(165);
		}
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConstraint_ValueSet() {
        return (EReference)getValueSetConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedIdentifier() {
		if (versionedIdentifierEClass == null) {
			versionedIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(168);
		}
		return versionedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedIdentifier_Version() {
        return (EAttribute)getVersionedIdentifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualStyleBehavior() {
		if (visualStyleBehaviorEClass == null) {
			visualStyleBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(169);
		}
		return visualStyleBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappedContent() {
		if (wrappedContentEClass == null) {
			wrappedContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(170);
		}
		return wrappedContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappedContent_ContentSignifier() {
        return (EReference)getWrappedContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappedContent_Content() {
        return (EReference)getWrappedContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactLifeCycleEventType() {
		if (artifactLifeCycleEventTypeEEnum == null) {
			artifactLifeCycleEventTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(8);
		}
		return artifactLifeCycleEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactStatusType() {
		if (artifactStatusTypeEEnum == null) {
			artifactStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(10);
		}
		return artifactStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactType() {
		if (artifactTypeEEnum == null) {
			artifactTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(13);
		}
		return artifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		if (cardinalityEEnum == null) {
			cardinalityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(25);
		}
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalityBehaviorType() {
		if (cardinalityBehaviorTypeEEnum == null) {
			cardinalityBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(27);
		}
		return cardinalityBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompondArtifactType() {
		if (compondArtifactTypeEEnum == null) {
			compondArtifactTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(35);
		}
		return compondArtifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionRoleType() {
		if (conditionRoleTypeEEnum == null) {
			conditionRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(41);
		}
		return conditionRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributorType() {
		if (contributorTypeEEnum == null) {
			contributorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(55);
		}
		return contributorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoverageType() {
		if (coverageTypeEEnum == null) {
			coverageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(60);
		}
		return coverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEventType() {
		if (dataEventTypeEEnum == null) {
			dataEventTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(64);
		}
		return dataEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		if (eventTypeEEnum == null) {
			eventTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(77);
		}
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupOrganizationBehaviorType() {
		if (groupOrganizationBehaviorTypeEEnum == null) {
			groupOrganizationBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(89);
		}
		return groupOrganizationBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupSelectionBehaviorType() {
		if (groupSelectionBehaviorTypeEEnum == null) {
			groupSelectionBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(92);
		}
		return groupSelectionBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetadataBindingType() {
		if (metadataBindingTypeEEnum == null) {
			metadataBindingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(112);
		}
		return metadataBindingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrecheckBehaviorType() {
		if (precheckBehaviorTypeEEnum == null) {
			precheckBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(124);
		}
		return precheckBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeConstraintType() {
		if (rangeConstraintTypeEEnum == null) {
			rangeConstraintTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(128);
		}
		return rangeConstraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequiredBehaviorType() {
		if (requiredBehaviorTypeEEnum == null) {
			requiredBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(139);
		}
		return requiredBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceRelationshipType() {
		if (resourceRelationshipTypeEEnum == null) {
			resourceRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(142);
		}
		return resourceRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueType() {
		if (valueTypeEEnum == null) {
			valueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(166);
		}
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactLifeCycleEventTypeObject() {
		if (artifactLifeCycleEventTypeObjectEDataType == null) {
			artifactLifeCycleEventTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(9);
		}
		return artifactLifeCycleEventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactStatusTypeObject() {
		if (artifactStatusTypeObjectEDataType == null) {
			artifactStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(11);
		}
		return artifactStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactTypeObject() {
		if (artifactTypeObjectEDataType == null) {
			artifactTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(14);
		}
		return artifactTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityBehaviorTypeObject() {
		if (cardinalityBehaviorTypeObjectEDataType == null) {
			cardinalityBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(28);
		}
		return cardinalityBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityObject() {
		if (cardinalityObjectEDataType == null) {
			cardinalityObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(29);
		}
		return cardinalityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompondArtifactTypeObject() {
		if (compondArtifactTypeObjectEDataType == null) {
			compondArtifactTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(36);
		}
		return compondArtifactTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionRoleTypeObject() {
		if (conditionRoleTypeObjectEDataType == null) {
			conditionRoleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(43);
		}
		return conditionRoleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContributorTypeObject() {
		if (contributorTypeObjectEDataType == null) {
			contributorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(56);
		}
		return contributorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoverageTypeObject() {
		if (coverageTypeObjectEDataType == null) {
			coverageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(61);
		}
		return coverageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataEventTypeObject() {
		if (dataEventTypeObjectEDataType == null) {
			dataEventTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(65);
		}
		return dataEventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeObject() {
		if (eventTypeObjectEDataType == null) {
			eventTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(78);
		}
		return eventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupOrganizationBehaviorTypeObject() {
		if (groupOrganizationBehaviorTypeObjectEDataType == null) {
			groupOrganizationBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(90);
		}
		return groupOrganizationBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupSelectionBehaviorTypeObject() {
		if (groupSelectionBehaviorTypeObjectEDataType == null) {
			groupSelectionBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(93);
		}
		return groupSelectionBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMetadataBindingTypeObject() {
		if (metadataBindingTypeObjectEDataType == null) {
			metadataBindingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(113);
		}
		return metadataBindingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrecheckBehaviorTypeObject() {
		if (precheckBehaviorTypeObjectEDataType == null) {
			precheckBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(125);
		}
		return precheckBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRangeConstraintTypeObject() {
		if (rangeConstraintTypeObjectEDataType == null) {
			rangeConstraintTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(129);
		}
		return rangeConstraintTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequiredBehaviorTypeObject() {
		if (requiredBehaviorTypeObjectEDataType == null) {
			requiredBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(140);
		}
		return requiredBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceRelationshipTypeObject() {
		if (resourceRelationshipTypeObjectEDataType == null) {
			resourceRelationshipTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(143);
		}
		return resourceRelationshipTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeObject() {
		if (valueTypeObjectEDataType == null) {
			valueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI).getEClassifiers().get(167);
		}
		return valueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Factory getR2Factory() {
		return (R2Factory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.hl7.knowledgeartifact.r2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //R2PackageImpl
