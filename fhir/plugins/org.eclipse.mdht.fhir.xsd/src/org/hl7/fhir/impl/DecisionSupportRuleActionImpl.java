/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DecisionSupportRuleAction;
import org.hl7.fhir.DecisionSupportRuleActionType;
import org.hl7.fhir.DecisionSupportRuleCustomization;
import org.hl7.fhir.DecisionSupportRuleParticipantType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Rule Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getCustomization <em>Customization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleActionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportRuleActionImpl extends BackboneElementImpl implements DecisionSupportRuleAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String number;

	/**
	 * The cached value of the '{@link #getSupportingEvidence() <em>Supporting Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> supportingEvidence;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> documentation;

	/**
	 * The cached value of the '{@link #getParticipantType() <em>Participant Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantType()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleParticipantType> participantType;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String textEquivalent;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> concept;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecisionSupportRuleActionType type;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Reference resource;

	/**
	 * The cached value of the '{@link #getCustomization() <em>Customization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomization()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleCustomization> customization;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportRuleActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDecisionSupportRuleAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(org.hl7.fhir.String newNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(org.hl7.fhir.String newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getSupportingEvidence() {
		if (supportingEvidence == null) {
			supportingEvidence = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE);
		}
		return supportingEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleParticipantType> getParticipantType() {
		if (participantType == null) {
			participantType = new EObjectContainmentEList<DecisionSupportRuleParticipantType>(DecisionSupportRuleParticipantType.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE);
		}
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(org.hl7.fhir.String newTextEquivalent, NotificationChain msgs) {
		org.hl7.fhir.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.hl7.fhir.String newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleActionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DecisionSupportRuleActionType newType, NotificationChain msgs) {
		DecisionSupportRuleActionType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DecisionSupportRuleActionType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Reference newResource, NotificationChain msgs) {
		Reference oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Reference newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleCustomization> getCustomization() {
		if (customization == null) {
			customization = new EObjectContainmentEList<DecisionSupportRuleCustomization>(DecisionSupportRuleCustomization.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION);
		}
		return customization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<DecisionSupportRuleAction>(DecisionSupportRuleAction.class, this, FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS);
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
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE:
				return ((InternalEList<?>)getSupportingEvidence()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE:
				return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION:
				return ((InternalEList<?>)getCustomization()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS:
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
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER:
				return getNumber();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE:
				return getParticipantType();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE:
				return getTitle();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT:
				return getConcept();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE:
				return getType();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE:
				return getResource();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION:
				return getCustomization();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS:
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
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER:
				setNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				getSupportingEvidence().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE:
				getParticipantType().clear();
				getParticipantType().addAll((Collection<? extends DecisionSupportRuleParticipantType>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE:
				setType((DecisionSupportRuleActionType)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE:
				setResource((Reference)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION:
				getCustomization().clear();
				getCustomization().addAll((Collection<? extends DecisionSupportRuleCustomization>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends DecisionSupportRuleAction>)newValue);
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
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER:
				setNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE:
				getParticipantType().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE:
				setType((DecisionSupportRuleActionType)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE:
				setResource((Reference)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION:
				getCustomization().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS:
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
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__NUMBER:
				return number != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__SUPPORTING_EVIDENCE:
				return supportingEvidence != null && !supportingEvidence.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__PARTICIPANT_TYPE:
				return participantType != null && !participantType.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TITLE:
				return title != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__TYPE:
				return type != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__RESOURCE:
				return resource != null;
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__CUSTOMIZATION:
				return customization != null && !customization.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE_ACTION__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportRuleActionImpl
