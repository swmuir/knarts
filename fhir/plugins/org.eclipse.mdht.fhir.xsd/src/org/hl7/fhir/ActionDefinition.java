/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of an action to be performed. Some aspects of the definition are specified statically, and some aspects can be specified dynamically by referencing logic defined in a library.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getCustomization <em>Customization</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getActionDefinition()
 * @model extendedMetaData="name='ActionDefinition' kind='elementOnly'"
 * @generated
 */
public interface ActionDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the action. The identifier SHALL be unique within the container in which it appears, and MAY be universally unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_ActionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getActionIdentifier <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' containment reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-visible label for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the action displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the action used to provide a summary to display to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concept represented by this action or its sub-actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getConcept();

	/**
	 * Returns the value of the '<em><b>Supporting Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The evidence grade and the sources of evidence for this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Evidence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_SupportingEvidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingEvidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getSupportingEvidence();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship to another action such as "before" or "30-60 minutes after start of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference.
	 * @see #setRelatedAction(ActionDefinitionRelatedAction)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_RelatedAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionDefinitionRelatedAction getRelatedAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getRelatedAction <em>Related Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Action</em>' containment reference.
	 * @see #getRelatedAction()
	 * @generated
	 */
	void setRelatedAction(ActionDefinitionRelatedAction value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ParticipantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_ParticipantType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParticipantType> getParticipantType();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of action to perform (create, update, remove).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ActionType)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ActionDefinitionBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior associated with the action. Behaviors define how the action is to be presented and/or executed within the receiving environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Behavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionDefinitionBehavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource that is the target of the action (e.g. CommunicationRequest). The resource described here defines any aspects of the action that can be specified statically (i.e. are known at the time of definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinition#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

	/**
	 * Returns the value of the '<em><b>Customization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ActionDefinitionCustomization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Customization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='customization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionDefinitionCustomization> getCustomization();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ActionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getActionDefinition_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionDefinition> getAction();

} // ActionDefinition
