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

import org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.AuditEventObject;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventObjectDetail;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventObjectImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventObjectImpl extends BackboneElementImpl implements AuditEventObject {
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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Resource reference;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

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
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected Coding lifecycle;

	/**
	 * The cached value of the '{@link #getSecurityLabels() <em>Security Label</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabels;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

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
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary query;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventObjectDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAuditEventObject();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Resource)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Resource newReference) {
		Resource oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getLifecycle() {
		if (lifecycle != null && lifecycle.eIsProxy()) {
			InternalEObject oldLifecycle = (InternalEObject)lifecycle;
			lifecycle = (Coding)eResolveProxy(oldLifecycle);
			if (lifecycle != oldLifecycle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE, oldLifecycle, lifecycle));
			}
		}
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle(Coding newLifecycle) {
		Coding oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE, oldLifecycle, lifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurityLabels() {
		if (securityLabels == null) {
			securityLabels = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.AUDIT_EVENT_OBJECT__SECURITY_LABEL);
		}
		return securityLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (Base64Binary)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Base64Binary newQuery) {
		Base64Binary oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventObjectDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<AuditEventObjectDetail>(AuditEventObjectDetail.class, this, FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				if (resolve) return getLifecycle();
				return basicGetLifecycle();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__SECURITY_LABEL:
				return getSecurityLabels();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL:
				return getDetails();
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
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE:
				setReference((Resource)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE:
				setRole((Coding)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				setLifecycle((Coding)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__SECURITY_LABEL:
				getSecurityLabels().clear();
				getSecurityLabels().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY:
				setQuery((Base64Binary)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends AuditEventObjectDetail>)newValue);
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
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE:
				setReference((Resource)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE:
				setRole((Coding)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				setLifecycle((Coding)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__SECURITY_LABEL:
				getSecurityLabels().clear();
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY:
				setQuery((Base64Binary)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL:
				getDetails().clear();
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
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__REFERENCE:
				return reference != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__TYPE:
				return type != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__ROLE:
				return role != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__LIFECYCLE:
				return lifecycle != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__SECURITY_LABEL:
				return securityLabels != null && !securityLabels.isEmpty();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__NAME:
				return name != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__QUERY:
				return query != null;
			case FhirResourcePackage.AUDIT_EVENT_OBJECT__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventObjectImpl
