/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Group Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getRelatedActions <em>Related Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequestGroup_Action'"
 * @generated
 */
public interface RequestGroupAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Title()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Description()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Equivalent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_TextEquivalent()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedArtifact> getDocumentations();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupActionCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestGroupActionCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupActionRelatedAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_RelatedAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestGroupActionRelatedAction> getRelatedActions();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Timingx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='timing[x]'"
	 * @generated
	 */
	DataType getTimingx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getTimingx <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timingx</em>' containment reference.
	 * @see #getTimingx()
	 * @generated
	 */
	void setTimingx(DataType value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getParticipants();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getType <em>Type</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_GroupingBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_SelectionBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getSelectionBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_RequiredBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getRequiredBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_PrecheckBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_CardinalityBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRequestGroupAction_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestGroupAction> getActions();

} // RequestGroupAction
