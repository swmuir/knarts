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

import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.BundleEntry;
import org.eclipse.mdht.uml.fhir.core.resource.BundleEntryRequest;
import org.eclipse.mdht.uml.fhir.core.resource.BundleEntryResponse;
import org.eclipse.mdht.uml.fhir.core.resource.BundleEntrySearch;
import org.eclipse.mdht.uml.fhir.core.resource.BundleLink;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getFullUrl <em>Full Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleEntryImpl extends BackboneElementImpl implements BundleEntry {
	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleLink> links;

	/**
	 * The cached value of the '{@link #getFullUrl() <em>Full Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri fullUrl;

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
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected BundleEntrySearch search;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected BundleEntryRequest request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected BundleEntryResponse response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getBundleEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<BundleLink>(BundleLink.class, this, FhirResourcePackage.BUNDLE_ENTRY__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getFullUrl() {
		if (fullUrl != null && fullUrl.eIsProxy()) {
			InternalEObject oldFullUrl = (InternalEObject)fullUrl;
			fullUrl = (Uri)eResolveProxy(oldFullUrl);
			if (fullUrl != oldFullUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY__FULL_URL, oldFullUrl, fullUrl));
			}
		}
		return fullUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetFullUrl() {
		return fullUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullUrl(Uri newFullUrl) {
		Uri oldFullUrl = fullUrl;
		fullUrl = newFullUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__FULL_URL, oldFullUrl, fullUrl));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY__RESOURCE, oldResource, resource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntrySearch getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearch(BundleEntrySearch newSearch, NotificationChain msgs) {
		BundleEntrySearch oldSearch = search;
		search = newSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__SEARCH, oldSearch, newSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(BundleEntrySearch newSearch) {
		if (newSearch != search) {
			NotificationChain msgs = null;
			if (search != null)
				msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			if (newSearch != null)
				msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			msgs = basicSetSearch(newSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__SEARCH, newSearch, newSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryRequest getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(BundleEntryRequest newRequest, NotificationChain msgs) {
		BundleEntryRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(BundleEntryRequest newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryResponse getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(BundleEntryResponse newResponse, NotificationChain msgs) {
		BundleEntryResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(BundleEntryResponse newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.BUNDLE_ENTRY__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.BUNDLE_ENTRY__SEARCH:
				return basicSetSearch(null, msgs);
			case FhirResourcePackage.BUNDLE_ENTRY__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirResourcePackage.BUNDLE_ENTRY__RESPONSE:
				return basicSetResponse(null, msgs);
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
			case FhirResourcePackage.BUNDLE_ENTRY__LINK:
				return getLinks();
			case FhirResourcePackage.BUNDLE_ENTRY__FULL_URL:
				if (resolve) return getFullUrl();
				return basicGetFullUrl();
			case FhirResourcePackage.BUNDLE_ENTRY__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case FhirResourcePackage.BUNDLE_ENTRY__SEARCH:
				return getSearch();
			case FhirResourcePackage.BUNDLE_ENTRY__REQUEST:
				return getRequest();
			case FhirResourcePackage.BUNDLE_ENTRY__RESPONSE:
				return getResponse();
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
			case FhirResourcePackage.BUNDLE_ENTRY__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__RESOURCE:
				setResource((Resource)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleEntrySearch)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleEntryRequest)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__RESPONSE:
				setResponse((BundleEntryResponse)newValue);
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
			case FhirResourcePackage.BUNDLE_ENTRY__LINK:
				getLinks().clear();
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__RESOURCE:
				setResource((Resource)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleEntrySearch)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleEntryRequest)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY__RESPONSE:
				setResponse((BundleEntryResponse)null);
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
			case FhirResourcePackage.BUNDLE_ENTRY__LINK:
				return links != null && !links.isEmpty();
			case FhirResourcePackage.BUNDLE_ENTRY__FULL_URL:
				return fullUrl != null;
			case FhirResourcePackage.BUNDLE_ENTRY__RESOURCE:
				return resource != null;
			case FhirResourcePackage.BUNDLE_ENTRY__SEARCH:
				return search != null;
			case FhirResourcePackage.BUNDLE_ENTRY__REQUEST:
				return request != null;
			case FhirResourcePackage.BUNDLE_ENTRY__RESPONSE:
				return response != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryImpl
