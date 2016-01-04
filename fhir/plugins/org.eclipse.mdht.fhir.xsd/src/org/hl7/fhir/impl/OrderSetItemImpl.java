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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.OrderSetCustomization;
import org.hl7.fhir.OrderSetItem;
import org.hl7.fhir.OrderSetItemCardinalityBehavior;
import org.hl7.fhir.OrderSetItemGroupingBehavior;
import org.hl7.fhir.OrderSetItemPrecheckBehavior;
import org.hl7.fhir.OrderSetItemRequiredBehavior;
import org.hl7.fhir.OrderSetItemSelectionBehavior;
import org.hl7.fhir.OrderSetItemType;
import org.hl7.fhir.OrderSetParticipantType;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Set Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getCustomization <em>Customization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrderSetItemImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderSetItemImpl extends BackboneElementImpl implements OrderSetItem {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	protected EList<OrderSetParticipantType> participantType;

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
	protected OrderSetItemType type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected OrderSetItemGroupingBehavior groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected OrderSetItemSelectionBehavior selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected OrderSetItemRequiredBehavior requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected OrderSetItemPrecheckBehavior precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected OrderSetItemCardinalityBehavior cardinalityBehavior;

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
	protected EList<OrderSetCustomization> customization;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderSetItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderSetItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOrderSetItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__NUMBER, oldNumber, newNumber);
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
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__NUMBER, newNumber, newNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
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
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getSupportingEvidence() {
		if (supportingEvidence == null) {
			supportingEvidence = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE);
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
			documentation = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.ORDER_SET_ITEM__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderSetParticipantType> getParticipantType() {
		if (participantType == null) {
			participantType = new EObjectContainmentEList<OrderSetParticipantType>(OrderSetParticipantType.class, this, FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE);
		}
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ORDER_SET_ITEM__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(OrderSetItemType newType, NotificationChain msgs) {
		OrderSetItemType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OrderSetItemType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemGroupingBehavior getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingBehavior(OrderSetItemGroupingBehavior newGroupingBehavior, NotificationChain msgs) {
		OrderSetItemGroupingBehavior oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, oldGroupingBehavior, newGroupingBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(OrderSetItemGroupingBehavior newGroupingBehavior) {
		if (newGroupingBehavior != groupingBehavior) {
			NotificationChain msgs = null;
			if (groupingBehavior != null)
				msgs = ((InternalEObject)groupingBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, null, msgs);
			if (newGroupingBehavior != null)
				msgs = ((InternalEObject)newGroupingBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, null, msgs);
			msgs = basicSetGroupingBehavior(newGroupingBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, newGroupingBehavior, newGroupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemSelectionBehavior getSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBehavior(OrderSetItemSelectionBehavior newSelectionBehavior, NotificationChain msgs) {
		OrderSetItemSelectionBehavior oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, oldSelectionBehavior, newSelectionBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(OrderSetItemSelectionBehavior newSelectionBehavior) {
		if (newSelectionBehavior != selectionBehavior) {
			NotificationChain msgs = null;
			if (selectionBehavior != null)
				msgs = ((InternalEObject)selectionBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, null, msgs);
			if (newSelectionBehavior != null)
				msgs = ((InternalEObject)newSelectionBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, null, msgs);
			msgs = basicSetSelectionBehavior(newSelectionBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, newSelectionBehavior, newSelectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemRequiredBehavior getRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBehavior(OrderSetItemRequiredBehavior newRequiredBehavior, NotificationChain msgs) {
		OrderSetItemRequiredBehavior oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, oldRequiredBehavior, newRequiredBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(OrderSetItemRequiredBehavior newRequiredBehavior) {
		if (newRequiredBehavior != requiredBehavior) {
			NotificationChain msgs = null;
			if (requiredBehavior != null)
				msgs = ((InternalEObject)requiredBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, null, msgs);
			if (newRequiredBehavior != null)
				msgs = ((InternalEObject)newRequiredBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, null, msgs);
			msgs = basicSetRequiredBehavior(newRequiredBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, newRequiredBehavior, newRequiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemPrecheckBehavior getPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecheckBehavior(OrderSetItemPrecheckBehavior newPrecheckBehavior, NotificationChain msgs) {
		OrderSetItemPrecheckBehavior oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, oldPrecheckBehavior, newPrecheckBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(OrderSetItemPrecheckBehavior newPrecheckBehavior) {
		if (newPrecheckBehavior != precheckBehavior) {
			NotificationChain msgs = null;
			if (precheckBehavior != null)
				msgs = ((InternalEObject)precheckBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, null, msgs);
			if (newPrecheckBehavior != null)
				msgs = ((InternalEObject)newPrecheckBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, null, msgs);
			msgs = basicSetPrecheckBehavior(newPrecheckBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, newPrecheckBehavior, newPrecheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemCardinalityBehavior getCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityBehavior(OrderSetItemCardinalityBehavior newCardinalityBehavior, NotificationChain msgs) {
		OrderSetItemCardinalityBehavior oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, newCardinalityBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(OrderSetItemCardinalityBehavior newCardinalityBehavior) {
		if (newCardinalityBehavior != cardinalityBehavior) {
			NotificationChain msgs = null;
			if (cardinalityBehavior != null)
				msgs = ((InternalEObject)cardinalityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, null, msgs);
			if (newCardinalityBehavior != null)
				msgs = ((InternalEObject)newCardinalityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, null, msgs);
			msgs = basicSetCardinalityBehavior(newCardinalityBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, newCardinalityBehavior, newCardinalityBehavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__RESOURCE, oldResource, newResource);
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
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORDER_SET_ITEM__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORDER_SET_ITEM__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderSetCustomization> getCustomization() {
		if (customization == null) {
			customization = new EObjectContainmentEList<OrderSetCustomization>(OrderSetCustomization.class, this, FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION);
		}
		return customization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderSetItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<OrderSetItem>(OrderSetItem.class, this, FhirPackage.ORDER_SET_ITEM__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ORDER_SET_ITEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				return ((InternalEList<?>)getSupportingEvidence()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_SET_ITEM__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_SET_ITEM__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_SET_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				return basicSetGroupingBehavior(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				return basicSetSelectionBehavior(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				return basicSetRequiredBehavior(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				return basicSetPrecheckBehavior(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				return basicSetCardinalityBehavior(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return ((InternalEList<?>)getCustomization()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORDER_SET_ITEM__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ORDER_SET_ITEM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ORDER_SET_ITEM__NUMBER:
				return getNumber();
			case FhirPackage.ORDER_SET_ITEM__TITLE:
				return getTitle();
			case FhirPackage.ORDER_SET_ITEM__DESCRIPTION:
				return getDescription();
			case FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case FhirPackage.ORDER_SET_ITEM__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				return getParticipantType();
			case FhirPackage.ORDER_SET_ITEM__CONCEPT:
				return getConcept();
			case FhirPackage.ORDER_SET_ITEM__TYPE:
				return getType();
			case FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				return getSelectionBehavior();
			case FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				return getRequiredBehavior();
			case FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				return getPrecheckBehavior();
			case FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				return getCardinalityBehavior();
			case FhirPackage.ORDER_SET_ITEM__RESOURCE:
				return getResource();
			case FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return getCustomization();
			case FhirPackage.ORDER_SET_ITEM__ITEMS:
				return getItems();
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
			case FhirPackage.ORDER_SET_ITEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__NUMBER:
				setNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				getSupportingEvidence().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				getParticipantType().clear();
				getParticipantType().addAll((Collection<? extends OrderSetParticipantType>)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__TYPE:
				setType((OrderSetItemType)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				setGroupingBehavior((OrderSetItemGroupingBehavior)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				setSelectionBehavior((OrderSetItemSelectionBehavior)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				setRequiredBehavior((OrderSetItemRequiredBehavior)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((OrderSetItemPrecheckBehavior)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((OrderSetItemCardinalityBehavior)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__RESOURCE:
				setResource((Reference)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION:
				getCustomization().clear();
				getCustomization().addAll((Collection<? extends OrderSetCustomization>)newValue);
				return;
			case FhirPackage.ORDER_SET_ITEM__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends OrderSetItem>)newValue);
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
			case FhirPackage.ORDER_SET_ITEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__NUMBER:
				setNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				return;
			case FhirPackage.ORDER_SET_ITEM__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				getParticipantType().clear();
				return;
			case FhirPackage.ORDER_SET_ITEM__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.ORDER_SET_ITEM__TYPE:
				setType((OrderSetItemType)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				setGroupingBehavior((OrderSetItemGroupingBehavior)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				setSelectionBehavior((OrderSetItemSelectionBehavior)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				setRequiredBehavior((OrderSetItemRequiredBehavior)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((OrderSetItemPrecheckBehavior)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((OrderSetItemCardinalityBehavior)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__RESOURCE:
				setResource((Reference)null);
				return;
			case FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION:
				getCustomization().clear();
				return;
			case FhirPackage.ORDER_SET_ITEM__ITEMS:
				getItems().clear();
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
			case FhirPackage.ORDER_SET_ITEM__IDENTIFIER:
				return identifier != null;
			case FhirPackage.ORDER_SET_ITEM__NUMBER:
				return number != null;
			case FhirPackage.ORDER_SET_ITEM__TITLE:
				return title != null;
			case FhirPackage.ORDER_SET_ITEM__DESCRIPTION:
				return description != null;
			case FhirPackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				return supportingEvidence != null && !supportingEvidence.isEmpty();
			case FhirPackage.ORDER_SET_ITEM__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				return participantType != null && !participantType.isEmpty();
			case FhirPackage.ORDER_SET_ITEM__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.ORDER_SET_ITEM__TYPE:
				return type != null;
			case FhirPackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case FhirPackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case FhirPackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case FhirPackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case FhirPackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case FhirPackage.ORDER_SET_ITEM__RESOURCE:
				return resource != null;
			case FhirPackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return customization != null && !customization.isEmpty();
			case FhirPackage.ORDER_SET_ITEM__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderSetItemImpl
