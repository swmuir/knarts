/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact;
import org.eclipse.mdht.hl7.fhir.dataTypes.TriggerDefinition;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionAction;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionActionCondition;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionActionDynamicValue;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionActionParticipant;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionActionRelatedAction;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.StructureMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getGoalIds <em>Goal Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getRelatedActions <em>Related Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getDynamicValues <em>Dynamic Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionActionImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionActionImpl extends BackboneElementImpl implements PlanDefinitionAction {
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String prefix;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String textEquivalent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getDocumentations() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> documentations;

	/**
	 * The cached value of the '{@link #getGoalIds() <em>Goal Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> goalIds;

	/**
	 * The cached value of the '{@link #getSubjectx() <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectx()
	 * @generated
	 * @ordered
	 */
	protected DataType subjectx;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerDefinition> triggers;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionCondition> conditions;

	/**
	 * The cached value of the '{@link #getInputs() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> outputs;

	/**
	 * The cached value of the '{@link #getRelatedActions() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionRelatedAction> relatedActions;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionParticipant> participants;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getDefinitionCanonical() <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonical()
	 * @generated
	 * @ordered
	 */
	protected Reference definitionCanonical;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected StructureMap transform;

	/**
	 * The cached value of the '{@link #getDynamicValues() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDynamicValue> dynamicValues;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPlanDefinitionAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(org.eclipse.mdht.hl7.fhir.dataTypes.String newPrefix, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(org.eclipse.mdht.hl7.fhir.dataTypes.String newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(org.eclipse.mdht.hl7.fhir.dataTypes.String newTextEquivalent, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextEquivalent(org.eclipse.mdht.hl7.fhir.dataTypes.String newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getDocumentations() {
		if (documentations == null) {
			documentations = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Id> getGoalIds() {
		if (goalIds == null) {
			goalIds = new EObjectContainmentEList<Id>(Id.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID);
		}
		return goalIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getSubjectx() {
		return subjectx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectx(DataType newSubjectx, NotificationChain msgs) {
		DataType oldSubjectx = subjectx;
		subjectx = newSubjectx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX, oldSubjectx, newSubjectx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectx(DataType newSubjectx) {
		if (newSubjectx != subjectx) {
			NotificationChain msgs = null;
			if (subjectx != null)
				msgs = ((InternalEObject)subjectx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX, null, msgs);
			if (newSubjectx != null)
				msgs = ((InternalEObject)newSubjectx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX, null, msgs);
			msgs = basicSetSubjectx(newSubjectx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX, newSubjectx, newSubjectx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TriggerDefinition> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<TriggerDefinition>(TriggerDefinition.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionActionCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<PlanDefinitionActionCondition>(PlanDefinitionActionCondition.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirement> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirement> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionActionRelatedAction> getRelatedActions() {
		if (relatedActions == null) {
			relatedActions = new EObjectContainmentEList<PlanDefinitionActionRelatedAction>(PlanDefinitionActionRelatedAction.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION);
		}
		return relatedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingx(DataType newTimingx, NotificationChain msgs) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX, oldTimingx, newTimingx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimingx(DataType newTimingx) {
		if (newTimingx != timingx) {
			NotificationChain msgs = null;
			if (timingx != null)
				msgs = ((InternalEObject)timingx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX, null, msgs);
			if (newTimingx != null)
				msgs = ((InternalEObject)newTimingx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX, null, msgs);
			msgs = basicSetTimingx(newTimingx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX, newTimingx, newTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionActionParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<PlanDefinitionActionParticipant>(PlanDefinitionActionParticipant.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingBehavior(Code newGroupingBehavior, NotificationChain msgs) {
		Code oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR, oldGroupingBehavior, newGroupingBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupingBehavior(Code newGroupingBehavior) {
		if (newGroupingBehavior != groupingBehavior) {
			NotificationChain msgs = null;
			if (groupingBehavior != null)
				msgs = ((InternalEObject)groupingBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR, null, msgs);
			if (newGroupingBehavior != null)
				msgs = ((InternalEObject)newGroupingBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR, null, msgs);
			msgs = basicSetGroupingBehavior(newGroupingBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR, newGroupingBehavior, newGroupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBehavior(Code newSelectionBehavior, NotificationChain msgs) {
		Code oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR, oldSelectionBehavior, newSelectionBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectionBehavior(Code newSelectionBehavior) {
		if (newSelectionBehavior != selectionBehavior) {
			NotificationChain msgs = null;
			if (selectionBehavior != null)
				msgs = ((InternalEObject)selectionBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR, null, msgs);
			if (newSelectionBehavior != null)
				msgs = ((InternalEObject)newSelectionBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR, null, msgs);
			msgs = basicSetSelectionBehavior(newSelectionBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR, newSelectionBehavior, newSelectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBehavior(Code newRequiredBehavior, NotificationChain msgs) {
		Code oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR, oldRequiredBehavior, newRequiredBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredBehavior(Code newRequiredBehavior) {
		if (newRequiredBehavior != requiredBehavior) {
			NotificationChain msgs = null;
			if (requiredBehavior != null)
				msgs = ((InternalEObject)requiredBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			if (newRequiredBehavior != null)
				msgs = ((InternalEObject)newRequiredBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			msgs = basicSetRequiredBehavior(newRequiredBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR, newRequiredBehavior, newRequiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecheckBehavior(Code newPrecheckBehavior, NotificationChain msgs) {
		Code oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, newPrecheckBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecheckBehavior(Code newPrecheckBehavior) {
		if (newPrecheckBehavior != precheckBehavior) {
			NotificationChain msgs = null;
			if (precheckBehavior != null)
				msgs = ((InternalEObject)precheckBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			if (newPrecheckBehavior != null)
				msgs = ((InternalEObject)newPrecheckBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			msgs = basicSetPrecheckBehavior(newPrecheckBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR, newPrecheckBehavior, newPrecheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityBehavior(Code newCardinalityBehavior, NotificationChain msgs) {
		Code oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, newCardinalityBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinalityBehavior(Code newCardinalityBehavior) {
		if (newCardinalityBehavior != cardinalityBehavior) {
			NotificationChain msgs = null;
			if (cardinalityBehavior != null)
				msgs = ((InternalEObject)cardinalityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			if (newCardinalityBehavior != null)
				msgs = ((InternalEObject)newCardinalityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			msgs = basicSetCardinalityBehavior(newCardinalityBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR, newCardinalityBehavior, newCardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefinitionCanonical() {
		return definitionCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCanonical(Reference newDefinitionCanonical, NotificationChain msgs) {
		Reference oldDefinitionCanonical = definitionCanonical;
		definitionCanonical = newDefinitionCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCanonical(Reference newDefinitionCanonical) {
		if (newDefinitionCanonical != definitionCanonical) {
			NotificationChain msgs = null;
			if (definitionCanonical != null)
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMap getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(StructureMap newTransform, NotificationChain msgs) {
		StructureMap oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransform(StructureMap newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionActionDynamicValue> getDynamicValues() {
		if (dynamicValues == null) {
			dynamicValues = new EObjectContainmentEList<PlanDefinitionActionDynamicValue>(PlanDefinitionActionDynamicValue.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE);
		}
		return dynamicValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<PlanDefinitionAction>(PlanDefinitionAction.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX:
				return basicSetPrefix(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REASON:
				return ((InternalEList<?>)getReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID:
				return ((InternalEList<?>)getGoalIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX:
				return basicSetSubjectx(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedActions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX:
				return basicSetTimingx(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR:
				return basicSetGroupingBehavior(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR:
				return basicSetSelectionBehavior(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR:
				return basicSetRequiredBehavior(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR:
				return basicSetPrecheckBehavior(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR:
				return basicSetCardinalityBehavior(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM:
				return basicSetTransform(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValues()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX:
				return getPrefix();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE:
				return getTitle();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY:
				return getPriority();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CODE:
				return getCodes();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REASON:
				return getReasons();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION:
				return getDocumentations();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID:
				return getGoalIds();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX:
				return getSubjectx();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER:
				return getTriggers();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION:
				return getConditions();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT:
				return getInputs();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT:
				return getOutputs();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION:
				return getRelatedActions();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX:
				return getTimingx();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE:
				return getType();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR:
				return getSelectionBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR:
				return getRequiredBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR:
				return getPrecheckBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR:
				return getCardinalityBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM:
				return getTransform();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE:
				return getDynamicValues();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX:
				setPrefix((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID:
				getGoalIds().clear();
				getGoalIds().addAll((Collection<? extends Id>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX:
				setSubjectx((DataType)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends TriggerDefinition>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends PlanDefinitionActionCondition>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION:
				getRelatedActions().clear();
				getRelatedActions().addAll((Collection<? extends PlanDefinitionActionRelatedAction>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends PlanDefinitionActionParticipant>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL:
				setDefinitionCanonical((Reference)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM:
				setTransform((StructureMap)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE:
				getDynamicValues().clear();
				getDynamicValues().addAll((Collection<? extends PlanDefinitionActionDynamicValue>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends PlanDefinitionAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX:
				setPrefix((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID:
				getGoalIds().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX:
				setSubjectx((DataType)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER:
				getTriggers().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT:
				getInputs().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT:
				getOutputs().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION:
				getRelatedActions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX:
				setTimingx((DataType)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL:
				setDefinitionCanonical((Reference)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM:
				setTransform((StructureMap)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE:
				getDynamicValues().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION:
				getActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX:
				return prefix != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE:
				return title != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY:
				return priority != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID:
				return goalIds != null && !goalIds.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX:
				return subjectx != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER:
				return triggers != null && !triggers.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT:
				return inputs != null && !inputs.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT:
				return outputs != null && !outputs.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION:
				return relatedActions != null && !relatedActions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX:
				return timingx != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE:
				return type != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM:
				return transform != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE:
				return dynamicValues != null && !dynamicValues.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionActionImpl
