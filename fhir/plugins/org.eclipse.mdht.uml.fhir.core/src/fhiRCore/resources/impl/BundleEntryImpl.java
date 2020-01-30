/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.BundleEntry;
import fhiRCore.resources.BundleEntryRequest;
import fhiRCore.resources.BundleEntryResponse;
import fhiRCore.resources.BundleEntrySearch;
import fhiRCore.resources.BundleLink;
import fhiRCore.resources.Entry_Resource;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getFullUrl <em>Full Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BundleEntryImpl#getResponse <em>Response</em>}</li>
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
	 * The cached value of the '{@link #getFullUrl() <em>Full Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri fullUrl;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Entry_Resource resource;

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
		return ResourcesPackage.eINSTANCE.getBundleEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<BundleLink>(BundleLink.class, this, ResourcesPackage.BUNDLE_ENTRY__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getFullUrl() {
		return fullUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullUrl(Uri newFullUrl, NotificationChain msgs) {
		Uri oldFullUrl = fullUrl;
		fullUrl = newFullUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__FULL_URL, oldFullUrl, newFullUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullUrl(Uri newFullUrl) {
		if (newFullUrl != fullUrl) {
			NotificationChain msgs = null;
			if (fullUrl != null)
				msgs = ((InternalEObject)fullUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__FULL_URL, null, msgs);
			if (newFullUrl != null)
				msgs = ((InternalEObject)newFullUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__FULL_URL, null, msgs);
			msgs = basicSetFullUrl(newFullUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__FULL_URL, newFullUrl, newFullUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry_Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Entry_Resource newResource, NotificationChain msgs) {
		Entry_Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Entry_Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__RESOURCE, newResource, newResource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__SEARCH, oldSearch, newSearch);
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
				msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			if (newSearch != null)
				msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			msgs = basicSetSearch(newSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__SEARCH, newSearch, newSearch));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__RESPONSE, oldResponse, newResponse);
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
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BUNDLE_ENTRY__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BUNDLE_ENTRY__FULL_URL:
				return basicSetFullUrl(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY__RESOURCE:
				return basicSetResource(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY__SEARCH:
				return basicSetSearch(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY__REQUEST:
				return basicSetRequest(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY__RESPONSE:
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
			case ResourcesPackage.BUNDLE_ENTRY__LINK:
				return getLinks();
			case ResourcesPackage.BUNDLE_ENTRY__FULL_URL:
				return getFullUrl();
			case ResourcesPackage.BUNDLE_ENTRY__RESOURCE:
				return getResource();
			case ResourcesPackage.BUNDLE_ENTRY__SEARCH:
				return getSearch();
			case ResourcesPackage.BUNDLE_ENTRY__REQUEST:
				return getRequest();
			case ResourcesPackage.BUNDLE_ENTRY__RESPONSE:
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
			case ResourcesPackage.BUNDLE_ENTRY__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((Entry_Resource)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleEntrySearch)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleEntryRequest)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__RESPONSE:
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
			case ResourcesPackage.BUNDLE_ENTRY__LINK:
				getLinks().clear();
				return;
			case ResourcesPackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((Entry_Resource)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleEntrySearch)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleEntryRequest)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY__RESPONSE:
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
			case ResourcesPackage.BUNDLE_ENTRY__LINK:
				return links != null && !links.isEmpty();
			case ResourcesPackage.BUNDLE_ENTRY__FULL_URL:
				return fullUrl != null;
			case ResourcesPackage.BUNDLE_ENTRY__RESOURCE:
				return resource != null;
			case ResourcesPackage.BUNDLE_ENTRY__SEARCH:
				return search != null;
			case ResourcesPackage.BUNDLE_ENTRY__REQUEST:
				return request != null;
			case ResourcesPackage.BUNDLE_ENTRY__RESPONSE:
				return response != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryImpl
