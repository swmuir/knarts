/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.TriggerDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getGoalIds <em>Goal Id</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getConditions <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getInputs <em>Input</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getOutputs <em>Output</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getRelatedActions <em>Related Action</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getParticipants <em>Participant</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getTransform <em>Transform</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getDynamicValues <em>Dynamic Value</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionAction#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PlanDefinition_Action'"
 * @generated
 */
public interface PlanDefinitionAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPrefix();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Equivalent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_TextEquivalent()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Reason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedArtifact> getDocumentations();

	/**
	 * Returns the value of the '<em><b>Goal Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Id}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_GoalId()
	 * @model containment="true"
	 * @generated
	 */
	EList<Id> getGoalIds();

	/**
	 * Returns the value of the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subjectx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectx</em>' containment reference.
	 * @see #setSubjectx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Subjectx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='subject[x]'"
	 * @generated
	 */
	DataType getSubjectx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getSubjectx <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectx</em>' containment reference.
	 * @see #getSubjectx()
	 * @generated
	 */
	void setSubjectx(DataType value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.TriggerDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<TriggerDefinition> getTriggers();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinitionActionCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinitionActionCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DataRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirement> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DataRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirement> getOutputs();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinitionActionRelatedAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_RelatedAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinitionActionRelatedAction> getRelatedActions();

	/**
	 * Returns the value of the '<em><b>Timingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timingx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timingx</em>' containment reference.
	 * @see #setTimingx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Timingx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='timing[x]'"
	 * @generated
	 */
	DataType getTimingx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getTimingx <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timingx</em>' containment reference.
	 * @see #getTimingx()
	 * @generated
	 */
	void setTimingx(DataType value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinitionActionParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinitionActionParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #setGroupingBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_GroupingBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getGroupingBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #setSelectionBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_SelectionBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getSelectionBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #getSelectionBehavior()
	 * @generated
	 */
	void setSelectionBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Behavior</em>' containment reference.
	 * @see #setRequiredBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_RequiredBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getRequiredBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Behavior</em>' containment reference.
	 * @see #getRequiredBehavior()
	 * @generated
	 */
	void setRequiredBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precheck Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #setPrecheckBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_PrecheckBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #getPrecheckBehavior()
	 * @generated
	 */
	void setPrecheckBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #setCardinalityBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_CardinalityBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Canonical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_DefinitionCanonical()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Reference value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(StructureMap)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Transform()
	 * @model containment="true"
	 * @generated
	 */
	StructureMap getTransform();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionAction#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(StructureMap value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinitionActionDynamicValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_DynamicValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinitionActionDynamicValue> getDynamicValues();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinitionAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionAction_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinitionAction> getActions();

} // PlanDefinitionAction
