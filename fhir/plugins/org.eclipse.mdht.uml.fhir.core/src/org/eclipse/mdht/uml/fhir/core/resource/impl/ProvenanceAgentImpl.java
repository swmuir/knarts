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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent;
import org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgentRelatedAgent;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProvenanceAgentImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProvenanceAgentImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProvenanceAgentImpl#getRelatedAgents <em>Related Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Coding role;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Resource actor;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected Identifier userId;

	/**
	 * The cached value of the '{@link #getRelatedAgents() <em>Related Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgentRelatedAgent> relatedAgents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getProvenanceAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Coding)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROVENANCE_AGENT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Coding newRole) {
		Coding oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROVENANCE_AGENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Resource)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROVENANCE_AGENT__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Resource newActor) {
		Resource oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROVENANCE_AGENT__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getUserId() {
		if (userId != null && userId.eIsProxy()) {
			InternalEObject oldUserId = (InternalEObject)userId;
			userId = (Identifier)eResolveProxy(oldUserId);
			if (userId != oldUserId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROVENANCE_AGENT__USER_ID, oldUserId, userId));
			}
		}
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(Identifier newUserId) {
		Identifier oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROVENANCE_AGENT__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceAgentRelatedAgent> getRelatedAgents() {
		if (relatedAgents == null) {
			relatedAgents = new EObjectContainmentEList<ProvenanceAgentRelatedAgent>(ProvenanceAgentRelatedAgent.class, this, FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT);
		}
		return relatedAgents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT:
				return ((InternalEList<?>)getRelatedAgents()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.PROVENANCE_AGENT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case FhirResourcePackage.PROVENANCE_AGENT__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case FhirResourcePackage.PROVENANCE_AGENT__USER_ID:
				if (resolve) return getUserId();
				return basicGetUserId();
			case FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT:
				return getRelatedAgents();
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
			case FhirResourcePackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)newValue);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__ACTOR:
				setActor((Resource)newValue);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__USER_ID:
				setUserId((Identifier)newValue);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT:
				getRelatedAgents().clear();
				getRelatedAgents().addAll((Collection<? extends ProvenanceAgentRelatedAgent>)newValue);
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
			case FhirResourcePackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)null);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__ACTOR:
				setActor((Resource)null);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__USER_ID:
				setUserId((Identifier)null);
				return;
			case FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT:
				getRelatedAgents().clear();
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
			case FhirResourcePackage.PROVENANCE_AGENT__ROLE:
				return role != null;
			case FhirResourcePackage.PROVENANCE_AGENT__ACTOR:
				return actor != null;
			case FhirResourcePackage.PROVENANCE_AGENT__USER_ID:
				return userId != null;
			case FhirResourcePackage.PROVENANCE_AGENT__RELATED_AGENT:
				return relatedAgents != null && !relatedAgents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
