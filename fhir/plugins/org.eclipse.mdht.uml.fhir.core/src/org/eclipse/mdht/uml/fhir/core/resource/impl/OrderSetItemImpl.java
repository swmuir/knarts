/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.OrderSetItem;
import org.eclipse.mdht.uml.fhir.core.resource.OrderSetItemCustomization;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Set Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getSupportingEvidences <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getParticipantTypes <em>Participant Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getCustomizations <em>Customization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OrderSetItemImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderSetItemImpl extends BackboneElementImpl implements OrderSetItem {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String number;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String textEquivalent;

	/**
	 * The cached value of the '{@link #getSupportingEvidences() <em>Supporting Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> supportingEvidences;

	/**
	 * The cached value of the '{@link #getDocumentations() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> documentations;

	/**
	 * The cached value of the '{@link #getParticipantTypes() <em>Participant Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> participantTypes;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> concepts;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getCustomizations() <em>Customization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderSetItemCustomization> customizations;

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
		return FhirResourcePackage.eINSTANCE.getOrderSetItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNumber() {
		if (number != null && number.eIsProxy()) {
			InternalEObject oldNumber = (InternalEObject)number;
			number = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNumber);
			if (number != oldNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__NUMBER, oldNumber, number));
			}
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(org.eclipse.mdht.uml.fhir.core.datatype.String newNumber) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTextEquivalent() {
		if (textEquivalent != null && textEquivalent.eIsProxy()) {
			InternalEObject oldTextEquivalent = (InternalEObject)textEquivalent;
			textEquivalent = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTextEquivalent);
			if (textEquivalent != oldTextEquivalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
			}
		}
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.eclipse.mdht.uml.fhir.core.datatype.String newTextEquivalent) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getSupportingEvidences() {
		if (supportingEvidences == null) {
			supportingEvidences = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE);
		}
		return supportingEvidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getDocumentations() {
		if (documentations == null) {
			documentations = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.ORDER_SET_ITEM__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getParticipantTypes() {
		if (participantTypes == null) {
			participantTypes = new EObjectResolvingEList<Code>(Code.class, this, FhirResourcePackage.ORDER_SET_ITEM__PARTICIPANT_TYPE);
		}
		return participantTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ORDER_SET_ITEM__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGroupingBehavior() {
		if (groupingBehavior != null && groupingBehavior.eIsProxy()) {
			InternalEObject oldGroupingBehavior = (InternalEObject)groupingBehavior;
			groupingBehavior = (Code)eResolveProxy(oldGroupingBehavior);
			if (groupingBehavior != oldGroupingBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
			}
		}
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(Code newGroupingBehavior) {
		Code oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSelectionBehavior() {
		if (selectionBehavior != null && selectionBehavior.eIsProxy()) {
			InternalEObject oldSelectionBehavior = (InternalEObject)selectionBehavior;
			selectionBehavior = (Code)eResolveProxy(oldSelectionBehavior);
			if (selectionBehavior != oldSelectionBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
			}
		}
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(Code newSelectionBehavior) {
		Code oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRequiredBehavior() {
		if (requiredBehavior != null && requiredBehavior.eIsProxy()) {
			InternalEObject oldRequiredBehavior = (InternalEObject)requiredBehavior;
			requiredBehavior = (Code)eResolveProxy(oldRequiredBehavior);
			if (requiredBehavior != oldRequiredBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
			}
		}
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(Code newRequiredBehavior) {
		Code oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPrecheckBehavior() {
		if (precheckBehavior != null && precheckBehavior.eIsProxy()) {
			InternalEObject oldPrecheckBehavior = (InternalEObject)precheckBehavior;
			precheckBehavior = (Code)eResolveProxy(oldPrecheckBehavior);
			if (precheckBehavior != oldPrecheckBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
			}
		}
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(Code newPrecheckBehavior) {
		Code oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCardinalityBehavior() {
		if (cardinalityBehavior != null && cardinalityBehavior.eIsProxy()) {
			InternalEObject oldCardinalityBehavior = (InternalEObject)cardinalityBehavior;
			cardinalityBehavior = (Code)eResolveProxy(oldCardinalityBehavior);
			if (cardinalityBehavior != oldCardinalityBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
			}
		}
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(Code newCardinalityBehavior) {
		Code oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ORDER_SET_ITEM__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ORDER_SET_ITEM__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderSetItemCustomization> getCustomizations() {
		if (customizations == null) {
			customizations = new EObjectContainmentEList<OrderSetItemCustomization>(OrderSetItemCustomization.class, this, FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION);
		}
		return customizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderSetItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<OrderSetItem>(OrderSetItem.class, this, FhirResourcePackage.ORDER_SET_ITEM__ITEMS);
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
			case FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return ((InternalEList<?>)getCustomizations()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.ORDER_SET_ITEM__ITEMS:
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
			case FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.ORDER_SET_ITEM__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case FhirResourcePackage.ORDER_SET_ITEM__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				if (resolve) return getTextEquivalent();
				return basicGetTextEquivalent();
			case FhirResourcePackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				return getSupportingEvidences();
			case FhirResourcePackage.ORDER_SET_ITEM__DOCUMENTATION:
				return getDocumentations();
			case FhirResourcePackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				return getParticipantTypes();
			case FhirResourcePackage.ORDER_SET_ITEM__CONCEPT:
				return getConcepts();
			case FhirResourcePackage.ORDER_SET_ITEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				if (resolve) return getGroupingBehavior();
				return basicGetGroupingBehavior();
			case FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				if (resolve) return getSelectionBehavior();
				return basicGetSelectionBehavior();
			case FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				if (resolve) return getRequiredBehavior();
				return basicGetRequiredBehavior();
			case FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				if (resolve) return getPrecheckBehavior();
				return basicGetPrecheckBehavior();
			case FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				if (resolve) return getCardinalityBehavior();
				return basicGetCardinalityBehavior();
			case FhirResourcePackage.ORDER_SET_ITEM__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return getCustomizations();
			case FhirResourcePackage.ORDER_SET_ITEM__ITEMS:
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
			case FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__NUMBER:
				setNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				getSupportingEvidences().clear();
				getSupportingEvidences().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				getParticipantTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__RESOURCE:
				setResource((Resource)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION:
				getCustomizations().clear();
				getCustomizations().addAll((Collection<? extends OrderSetItemCustomization>)newValue);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__ITEMS:
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
			case FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__NUMBER:
				setNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				getSupportingEvidences().clear();
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CONCEPT:
				getConcepts().clear();
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__RESOURCE:
				setResource((Resource)null);
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION:
				getCustomizations().clear();
				return;
			case FhirResourcePackage.ORDER_SET_ITEM__ITEMS:
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
			case FhirResourcePackage.ORDER_SET_ITEM__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.ORDER_SET_ITEM__NUMBER:
				return number != null;
			case FhirResourcePackage.ORDER_SET_ITEM__TITLE:
				return title != null;
			case FhirResourcePackage.ORDER_SET_ITEM__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.ORDER_SET_ITEM__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirResourcePackage.ORDER_SET_ITEM__SUPPORTING_EVIDENCE:
				return supportingEvidences != null && !supportingEvidences.isEmpty();
			case FhirResourcePackage.ORDER_SET_ITEM__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case FhirResourcePackage.ORDER_SET_ITEM__PARTICIPANT_TYPE:
				return participantTypes != null && !participantTypes.isEmpty();
			case FhirResourcePackage.ORDER_SET_ITEM__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case FhirResourcePackage.ORDER_SET_ITEM__TYPE:
				return type != null;
			case FhirResourcePackage.ORDER_SET_ITEM__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case FhirResourcePackage.ORDER_SET_ITEM__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case FhirResourcePackage.ORDER_SET_ITEM__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case FhirResourcePackage.ORDER_SET_ITEM__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case FhirResourcePackage.ORDER_SET_ITEM__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case FhirResourcePackage.ORDER_SET_ITEM__RESOURCE:
				return resource != null;
			case FhirResourcePackage.ORDER_SET_ITEM__CUSTOMIZATION:
				return customizations != null && !customizations.isEmpty();
			case FhirResourcePackage.ORDER_SET_ITEM__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderSetItemImpl
