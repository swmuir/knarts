/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ContractTerm;
import org.eclipse.mdht.uml.fhir.core.resource.ContractTermTermActor;
import org.eclipse.mdht.uml.fhir.core.resource.ContractTermTermValuedItem;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getActionReasons <em>Action Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getActors <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getValuedItems <em>Valued Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ContractTermImpl#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermImpl extends BackboneElementImpl implements ContractTerm {
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
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actions;

	/**
	 * The cached value of the '{@link #getActionReasons() <em>Action Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actionReasons;

	/**
	 * The cached value of the '{@link #getActors() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermTermActor> actors;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * The cached value of the '{@link #getValuedItems() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermTermValuedItem> valuedItems;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getContractTerm();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getIssued() {
		if (issued != null && issued.eIsProxy()) {
			InternalEObject oldIssued = (InternalEObject)issued;
			issued = (DateTime)eResolveProxy(oldIssued);
			if (issued != oldIssued) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__ISSUED, oldIssued, issued));
			}
		}
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateTime newIssued) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getApplies() {
		if (applies != null && applies.eIsProxy()) {
			InternalEObject oldApplies = (InternalEObject)applies;
			applies = (Period)eResolveProxy(oldApplies);
			if (applies != oldApplies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__APPLIES, oldApplies, applies));
			}
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplies(Period newApplies) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__APPLIES, oldApplies, applies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubType() {
		if (subType != null && subType.eIsProxy()) {
			InternalEObject oldSubType = (InternalEObject)subType;
			subType = (CodeableConcept)eResolveProxy(oldSubType);
			if (subType != oldSubType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__SUB_TYPE, oldSubType, subType));
			}
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(CodeableConcept newSubType) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__SUB_TYPE, oldSubType, subType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CONTRACT_TERM__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActionReasons() {
		if (actionReasons == null) {
			actionReasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CONTRACT_TERM__ACTION_REASON);
		}
		return actionReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermTermActor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<ContractTermTermActor>(ContractTermTermActor.class, this, FhirResourcePackage.CONTRACT_TERM__ACTOR);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONTRACT_TERM__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONTRACT_TERM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermTermValuedItem> getValuedItems() {
		if (valuedItems == null) {
			valuedItems = new EObjectContainmentEList<ContractTermTermValuedItem>(ContractTermTermValuedItem.class, this, FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM);
		}
		return valuedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirResourcePackage.CONTRACT_TERM__GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONTRACT_TERM__ACTOR:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONTRACT_TERM__GROUP:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONTRACT_TERM__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.CONTRACT_TERM__ISSUED:
				if (resolve) return getIssued();
				return basicGetIssued();
			case FhirResourcePackage.CONTRACT_TERM__APPLIES:
				if (resolve) return getApplies();
				return basicGetApplies();
			case FhirResourcePackage.CONTRACT_TERM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.CONTRACT_TERM__SUB_TYPE:
				if (resolve) return getSubType();
				return basicGetSubType();
			case FhirResourcePackage.CONTRACT_TERM__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.CONTRACT_TERM__ACTION:
				return getActions();
			case FhirResourcePackage.CONTRACT_TERM__ACTION_REASON:
				return getActionReasons();
			case FhirResourcePackage.CONTRACT_TERM__ACTOR:
				return getActors();
			case FhirResourcePackage.CONTRACT_TERM__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM:
				return getValuedItems();
			case FhirResourcePackage.CONTRACT_TERM__GROUP:
				return getGroups();
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
			case FhirResourcePackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTION_REASON:
				getActionReasons().clear();
				getActionReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTOR:
				getActors().clear();
				getActors().addAll((Collection<? extends ContractTermTermActor>)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM:
				getValuedItems().clear();
				getValuedItems().addAll((Collection<? extends ContractTermTermValuedItem>)newValue);
				return;
			case FhirResourcePackage.CONTRACT_TERM__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ContractTerm>)newValue);
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
			case FhirResourcePackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTION:
				getActions().clear();
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTION_REASON:
				getActionReasons().clear();
				return;
			case FhirResourcePackage.CONTRACT_TERM__ACTOR:
				getActors().clear();
				return;
			case FhirResourcePackage.CONTRACT_TERM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM:
				getValuedItems().clear();
				return;
			case FhirResourcePackage.CONTRACT_TERM__GROUP:
				getGroups().clear();
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
			case FhirResourcePackage.CONTRACT_TERM__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.CONTRACT_TERM__ISSUED:
				return issued != null;
			case FhirResourcePackage.CONTRACT_TERM__APPLIES:
				return applies != null;
			case FhirResourcePackage.CONTRACT_TERM__TYPE:
				return type != null;
			case FhirResourcePackage.CONTRACT_TERM__SUB_TYPE:
				return subType != null;
			case FhirResourcePackage.CONTRACT_TERM__SUBJECT:
				return subject != null;
			case FhirResourcePackage.CONTRACT_TERM__ACTION:
				return actions != null && !actions.isEmpty();
			case FhirResourcePackage.CONTRACT_TERM__ACTION_REASON:
				return actionReasons != null && !actionReasons.isEmpty();
			case FhirResourcePackage.CONTRACT_TERM__ACTOR:
				return actors != null && !actors.isEmpty();
			case FhirResourcePackage.CONTRACT_TERM__TEXT:
				return text != null;
			case FhirResourcePackage.CONTRACT_TERM__VALUED_ITEM:
				return valuedItems != null && !valuedItems.isEmpty();
			case FhirResourcePackage.CONTRACT_TERM__GROUP:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermImpl
