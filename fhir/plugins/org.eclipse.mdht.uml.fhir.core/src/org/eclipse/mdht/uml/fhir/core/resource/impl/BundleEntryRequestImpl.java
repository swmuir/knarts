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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.BundleEntryRequest;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Entry Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleEntryRequestImpl#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleEntryRequestImpl extends BackboneElementImpl implements BundleEntryRequest {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Code method;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIfNoneMatch() <em>If None Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneMatch()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String ifNoneMatch;

	/**
	 * The cached value of the '{@link #getIfModifiedSince() <em>If Modified Since</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfModifiedSince()
	 * @generated
	 * @ordered
	 */
	protected Instant ifModifiedSince;

	/**
	 * The cached value of the '{@link #getIfMatch() <em>If Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfMatch()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String ifMatch;

	/**
	 * The cached value of the '{@link #getIfNoneExist() <em>If None Exist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneExist()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String ifNoneExist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleEntryRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getBundleEntryRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (Code)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Code newMethod) {
		Code oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getIfNoneMatch() {
		if (ifNoneMatch != null && ifNoneMatch.eIsProxy()) {
			InternalEObject oldIfNoneMatch = (InternalEObject)ifNoneMatch;
			ifNoneMatch = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldIfNoneMatch);
			if (ifNoneMatch != oldIfNoneMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, oldIfNoneMatch, ifNoneMatch));
			}
		}
		return ifNoneMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetIfNoneMatch() {
		return ifNoneMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfNoneMatch(org.eclipse.mdht.uml.fhir.core.datatype.String newIfNoneMatch) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldIfNoneMatch = ifNoneMatch;
		ifNoneMatch = newIfNoneMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, oldIfNoneMatch, ifNoneMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIfModifiedSince() {
		if (ifModifiedSince != null && ifModifiedSince.eIsProxy()) {
			InternalEObject oldIfModifiedSince = (InternalEObject)ifModifiedSince;
			ifModifiedSince = (Instant)eResolveProxy(oldIfModifiedSince);
			if (ifModifiedSince != oldIfModifiedSince) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, oldIfModifiedSince, ifModifiedSince));
			}
		}
		return ifModifiedSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetIfModifiedSince() {
		return ifModifiedSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfModifiedSince(Instant newIfModifiedSince) {
		Instant oldIfModifiedSince = ifModifiedSince;
		ifModifiedSince = newIfModifiedSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, oldIfModifiedSince, ifModifiedSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getIfMatch() {
		if (ifMatch != null && ifMatch.eIsProxy()) {
			InternalEObject oldIfMatch = (InternalEObject)ifMatch;
			ifMatch = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldIfMatch);
			if (ifMatch != oldIfMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, oldIfMatch, ifMatch));
			}
		}
		return ifMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetIfMatch() {
		return ifMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfMatch(org.eclipse.mdht.uml.fhir.core.datatype.String newIfMatch) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldIfMatch = ifMatch;
		ifMatch = newIfMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, oldIfMatch, ifMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getIfNoneExist() {
		if (ifNoneExist != null && ifNoneExist.eIsProxy()) {
			InternalEObject oldIfNoneExist = (InternalEObject)ifNoneExist;
			ifNoneExist = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldIfNoneExist);
			if (ifNoneExist != oldIfNoneExist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, oldIfNoneExist, ifNoneExist));
			}
		}
		return ifNoneExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetIfNoneExist() {
		return ifNoneExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfNoneExist(org.eclipse.mdht.uml.fhir.core.datatype.String newIfNoneExist) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldIfNoneExist = ifNoneExist;
		ifNoneExist = newIfNoneExist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, oldIfNoneExist, ifNoneExist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				if (resolve) return getIfNoneMatch();
				return basicGetIfNoneMatch();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				if (resolve) return getIfModifiedSince();
				return basicGetIfModifiedSince();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				if (resolve) return getIfMatch();
				return basicGetIfMatch();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				if (resolve) return getIfNoneExist();
				return basicGetIfNoneExist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD:
				setMethod((Code)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				setIfNoneMatch((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				setIfMatch((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				setIfNoneExist((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD:
				setMethod((Code)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				setIfNoneMatch((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				setIfMatch((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				setIfNoneExist((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__METHOD:
				return method != null;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__URL:
				return url != null;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				return ifNoneMatch != null;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				return ifModifiedSince != null;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				return ifMatch != null;
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				return ifNoneExist != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryRequestImpl
