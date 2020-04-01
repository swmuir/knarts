/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.BundleEntryRequest;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Entry Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BundleEntryRequestImpl#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleEntryRequestImpl extends BackboneElementImpl implements BundleEntryRequest {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Code method;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIfNoneMatch() <em>If None Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneMatch()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String ifNoneMatch;

	/**
	 * The cached value of the '{@link #getIfModifiedSince() <em>If Modified Since</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfModifiedSince()
	 * @generated
	 * @ordered
	 */
	protected Instant ifModifiedSince;

	/**
	 * The cached value of the '{@link #getIfMatch() <em>If Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfMatch()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String ifMatch;

	/**
	 * The cached value of the '{@link #getIfNoneExist() <em>If None Exist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneExist()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String ifNoneExist;

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
		return ResourcesPackage.eINSTANCE.getBundleEntryRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Code newMethod, NotificationChain msgs) {
		Code oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(Code newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIfNoneMatch() {
		return ifNoneMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfNoneMatch(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfNoneMatch, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIfNoneMatch = ifNoneMatch;
		ifNoneMatch = newIfNoneMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, oldIfNoneMatch, newIfNoneMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfNoneMatch(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfNoneMatch) {
		if (newIfNoneMatch != ifNoneMatch) {
			NotificationChain msgs = null;
			if (ifNoneMatch != null)
				msgs = ((InternalEObject)ifNoneMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, null, msgs);
			if (newIfNoneMatch != null)
				msgs = ((InternalEObject)newIfNoneMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, null, msgs);
			msgs = basicSetIfNoneMatch(newIfNoneMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH, newIfNoneMatch, newIfNoneMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getIfModifiedSince() {
		return ifModifiedSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfModifiedSince(Instant newIfModifiedSince, NotificationChain msgs) {
		Instant oldIfModifiedSince = ifModifiedSince;
		ifModifiedSince = newIfModifiedSince;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, oldIfModifiedSince, newIfModifiedSince);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfModifiedSince(Instant newIfModifiedSince) {
		if (newIfModifiedSince != ifModifiedSince) {
			NotificationChain msgs = null;
			if (ifModifiedSince != null)
				msgs = ((InternalEObject)ifModifiedSince).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, null, msgs);
			if (newIfModifiedSince != null)
				msgs = ((InternalEObject)newIfModifiedSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, null, msgs);
			msgs = basicSetIfModifiedSince(newIfModifiedSince, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE, newIfModifiedSince, newIfModifiedSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIfMatch() {
		return ifMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfMatch(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfMatch, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIfMatch = ifMatch;
		ifMatch = newIfMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, oldIfMatch, newIfMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfMatch(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfMatch) {
		if (newIfMatch != ifMatch) {
			NotificationChain msgs = null;
			if (ifMatch != null)
				msgs = ((InternalEObject)ifMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, null, msgs);
			if (newIfMatch != null)
				msgs = ((InternalEObject)newIfMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, null, msgs);
			msgs = basicSetIfMatch(newIfMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH, newIfMatch, newIfMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIfNoneExist() {
		return ifNoneExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfNoneExist(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfNoneExist, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIfNoneExist = ifNoneExist;
		ifNoneExist = newIfNoneExist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, oldIfNoneExist, newIfNoneExist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfNoneExist(org.eclipse.mdht.hl7.fhir.dataTypes.String newIfNoneExist) {
		if (newIfNoneExist != ifNoneExist) {
			NotificationChain msgs = null;
			if (ifNoneExist != null)
				msgs = ((InternalEObject)ifNoneExist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, null, msgs);
			if (newIfNoneExist != null)
				msgs = ((InternalEObject)newIfNoneExist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, null, msgs);
			msgs = basicSetIfNoneExist(newIfNoneExist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST, newIfNoneExist, newIfNoneExist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				return basicSetIfNoneMatch(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				return basicSetIfModifiedSince(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				return basicSetIfMatch(null, msgs);
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				return basicSetIfNoneExist(null, msgs);
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
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD:
				return getMethod();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL:
				return getUrl();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				return getIfNoneMatch();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				return getIfModifiedSince();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				return getIfMatch();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				return getIfNoneExist();
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
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD:
				setMethod((Code)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				setIfNoneMatch((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				setIfMatch((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				setIfNoneExist((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD:
				setMethod((Code)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				setIfNoneMatch((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				setIfMatch((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				setIfNoneExist((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__METHOD:
				return method != null;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__URL:
				return url != null;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_MATCH:
				return ifNoneMatch != null;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MODIFIED_SINCE:
				return ifModifiedSince != null;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_MATCH:
				return ifMatch != null;
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST__IF_NONE_EXIST:
				return ifNoneExist != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryRequestImpl
