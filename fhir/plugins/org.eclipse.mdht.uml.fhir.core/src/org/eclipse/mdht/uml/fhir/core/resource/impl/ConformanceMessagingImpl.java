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

import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConformanceMessaging;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceMessagingEndpoint;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceMessagingEvent;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Messaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceMessagingImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceMessagingImpl#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceMessagingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceMessagingImpl#getEvents <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceMessagingImpl extends BackboneElementImpl implements ConformanceMessaging {
	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceMessagingEndpoint> endpoints;

	/**
	 * The cached value of the '{@link #getReliableCache() <em>Reliable Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableCache()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt reliableCache;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String documentation;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceMessagingEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceMessagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConformanceMessaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceMessagingEndpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<ConformanceMessagingEndpoint>(ConformanceMessagingEndpoint.class, this, FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getReliableCache() {
		if (reliableCache != null && reliableCache.eIsProxy()) {
			InternalEObject oldReliableCache = (InternalEObject)reliableCache;
			reliableCache = (UnsignedInt)eResolveProxy(oldReliableCache);
			if (reliableCache != oldReliableCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, oldReliableCache, reliableCache));
			}
		}
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetReliableCache() {
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableCache(UnsignedInt newReliableCache) {
		UnsignedInt oldReliableCache = reliableCache;
		reliableCache = newReliableCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, oldReliableCache, reliableCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.datatype.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceMessagingEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<ConformanceMessagingEvent>(ConformanceMessagingEvent.class, this, FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return getEndpoints();
			case FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				if (resolve) return getReliableCache();
				return basicGetReliableCache();
			case FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT:
				return getEvents();
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
			case FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends ConformanceMessagingEndpoint>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends ConformanceMessagingEvent>)newValue);
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
			case FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)null);
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT:
				getEvents().clear();
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
			case FhirResourcePackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case FhirResourcePackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				return reliableCache != null;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				return documentation != null;
			case FhirResourcePackage.CONFORMANCE_MESSAGING__EVENT:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceMessagingImpl
