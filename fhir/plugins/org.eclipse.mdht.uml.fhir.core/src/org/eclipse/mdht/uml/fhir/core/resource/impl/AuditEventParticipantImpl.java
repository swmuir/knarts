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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.AuditEventParticipant;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventParticipantNetwork;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventParticipantImpl#getPurposeOfUses <em>Purpose Of Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventParticipantImpl extends BackboneElementImpl implements AuditEventParticipant {
	/**
	 * The cached value of the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> roles;

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
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected Identifier userId;

	/**
	 * The cached value of the '{@link #getAltId() <em>Alt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String altId;

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
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean requestor;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policies;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Coding media;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected AuditEventParticipantNetwork network;

	/**
	 * The cached value of the '{@link #getPurposeOfUses() <em>Purpose Of Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposeOfUses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAuditEventParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ROLE);
		}
		return roles;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE, oldReference, reference));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID, oldUserId, userId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getAltId() {
		if (altId != null && altId.eIsProxy()) {
			InternalEObject oldAltId = (InternalEObject)altId;
			altId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldAltId);
			if (altId != oldAltId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, oldAltId, altId));
			}
		}
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetAltId() {
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltId(org.eclipse.mdht.uml.fhir.core.datatype.String newAltId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldAltId = altId;
		altId = newAltId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID, oldAltId, altId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRequestor() {
		if (requestor != null && requestor.eIsProxy()) {
			InternalEObject oldRequestor = (InternalEObject)requestor;
			requestor = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldRequestor);
			if (requestor != oldRequestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, oldRequestor, requestor));
			}
		}
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newRequestor) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR, oldRequestor, requestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<Uri>(Uri.class, this, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMedia() {
		if (media != null && media.eIsProxy()) {
			InternalEObject oldMedia = (InternalEObject)media;
			media = (Coding)eResolveProxy(oldMedia);
			if (media != oldMedia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA, oldMedia, media));
			}
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Coding newMedia) {
		Coding oldMedia = media;
		media = newMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA, oldMedia, media));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipantNetwork getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(AuditEventParticipantNetwork newNetwork, NotificationChain msgs) {
		AuditEventParticipantNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(AuditEventParticipantNetwork newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposeOfUses() {
		if (purposeOfUses == null) {
			purposeOfUses = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE);
		}
		return purposeOfUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return basicSetNetwork(null, msgs);
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
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				return getRoles();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				if (resolve) return getUserId();
				return basicGetUserId();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				if (resolve) return getAltId();
				return basicGetAltId();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				if (resolve) return getRequestor();
				return basicGetRequestor();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				return getPolicies();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				if (resolve) return getMedia();
				return basicGetMedia();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return getNetwork();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				return getPurposeOfUses();
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
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				getRoles().clear();
				getRoles().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				setReference((Resource)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				setUserId((Identifier)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				setAltId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				setRequestor((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				setMedia((Coding)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				setNetwork((AuditEventParticipantNetwork)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
				getPurposeOfUses().addAll((Collection<? extends Coding>)newValue);
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
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				getRoles().clear();
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				setReference((Resource)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				setUserId((Identifier)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				setAltId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				setRequestor((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				setLocation((Location)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				getPolicies().clear();
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				setMedia((Coding)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				setNetwork((AuditEventParticipantNetwork)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
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
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ROLE:
				return roles != null && !roles.isEmpty();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REFERENCE:
				return reference != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__USER_ID:
				return userId != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__ALT_ID:
				return altId != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NAME:
				return name != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__REQUESTOR:
				return requestor != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__LOCATION:
				return location != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__POLICY:
				return policies != null && !policies.isEmpty();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__MEDIA:
				return media != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__NETWORK:
				return network != null;
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT__PURPOSE_OF_USE:
				return purposeOfUses != null && !purposeOfUses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventParticipantImpl
