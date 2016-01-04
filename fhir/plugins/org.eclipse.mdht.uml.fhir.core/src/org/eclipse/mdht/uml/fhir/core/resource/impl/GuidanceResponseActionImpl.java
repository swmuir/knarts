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
import org.eclipse.mdht.uml.fhir.core.resource.GuidanceResponseAction;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getSupportingEvidences <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseActionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseActionImpl extends BackboneElementImpl implements GuidanceResponseAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

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
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> participants;

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
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getGuidanceResponseAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		if (actionIdentifier != null && actionIdentifier.eIsProxy()) {
			InternalEObject oldActionIdentifier = (InternalEObject)actionIdentifier;
			actionIdentifier = (Identifier)eResolveProxy(oldActionIdentifier);
			if (actionIdentifier != oldActionIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
			}
		}
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getSupportingEvidences() {
		if (supportingEvidences == null) {
			supportingEvidences = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE);
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
			documentations = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT);
		}
		return participants;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE, oldTitle, title));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__CONCEPT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, oldResource, resource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<GuidanceResponseAction>(GuidanceResponseAction.class, this, FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS);
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
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS:
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
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				if (resolve) return getActionIdentifier();
				return basicGetActionIdentifier();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				return getSupportingEvidences();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				return getDocumentations();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				return getParticipants();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				if (resolve) return getTextEquivalent();
				return basicGetTextEquivalent();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				return getConcepts();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS:
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
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER:
				setNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidences().clear();
				getSupportingEvidences().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				setResource((Resource)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends GuidanceResponseAction>)newValue);
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
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER:
				setNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidences().clear();
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				getParticipants().clear();
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				getConcepts().clear();
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				setResource((Resource)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS:
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
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__NUMBER:
				return number != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				return supportingEvidences != null && !supportingEvidences.isEmpty();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				return title != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				return type != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				return resource != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseActionImpl
