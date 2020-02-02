/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ContentHashType;
import org.hl7.knowledgeartifact.r2.IdentifiersType;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.Reference;
import org.hl7.knowledgeartifact.r2.UrlType;
import org.hl7.knowledgeartifact.r2.UuidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ReferenceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ReferenceImpl#getContentHash <em>Content Hash</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ReferenceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ReferenceImpl#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected UrlType url;

	/**
	 * The cached value of the '{@link #getContentHash() <em>Content Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHash()
	 * @generated
	 * @ordered
	 */
	protected ContentHashType contentHash;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected UuidType uuid;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected IdentifiersType identifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlType getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(UrlType newUrl, NotificationChain msgs) {
		UrlType oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(UrlType newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHashType getContentHash() {
		return contentHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentHash(ContentHashType newContentHash, NotificationChain msgs) {
		ContentHashType oldContentHash = contentHash;
		contentHash = newContentHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__CONTENT_HASH, oldContentHash, newContentHash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentHash(ContentHashType newContentHash) {
		if (newContentHash != contentHash) {
			NotificationChain msgs = null;
			if (contentHash != null)
				msgs = ((InternalEObject)contentHash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__CONTENT_HASH, null, msgs);
			if (newContentHash != null)
				msgs = ((InternalEObject)newContentHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__CONTENT_HASH, null, msgs);
			msgs = basicSetContentHash(newContentHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__CONTENT_HASH, newContentHash, newContentHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UuidType getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUuid(UuidType newUuid, NotificationChain msgs) {
		UuidType oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__UUID, oldUuid, newUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(UuidType newUuid) {
		if (newUuid != uuid) {
			NotificationChain msgs = null;
			if (uuid != null)
				msgs = ((InternalEObject)uuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__UUID, null, msgs);
			if (newUuid != null)
				msgs = ((InternalEObject)newUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__UUID, null, msgs);
			msgs = basicSetUuid(newUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__UUID, newUuid, newUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType getIdentifiers() {
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiers(IdentifiersType newIdentifiers, NotificationChain msgs) {
		IdentifiersType oldIdentifiers = identifiers;
		identifiers = newIdentifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__IDENTIFIERS, oldIdentifiers, newIdentifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiers(IdentifiersType newIdentifiers) {
		if (newIdentifiers != identifiers) {
			NotificationChain msgs = null;
			if (identifiers != null)
				msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__IDENTIFIERS, null, msgs);
			if (newIdentifiers != null)
				msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.REFERENCE__IDENTIFIERS, null, msgs);
			msgs = basicSetIdentifiers(newIdentifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.REFERENCE__IDENTIFIERS, newIdentifiers, newIdentifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.REFERENCE__URL:
				return basicSetUrl(null, msgs);
			case R2Package.REFERENCE__CONTENT_HASH:
				return basicSetContentHash(null, msgs);
			case R2Package.REFERENCE__UUID:
				return basicSetUuid(null, msgs);
			case R2Package.REFERENCE__IDENTIFIERS:
				return basicSetIdentifiers(null, msgs);
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
			case R2Package.REFERENCE__URL:
				return getUrl();
			case R2Package.REFERENCE__CONTENT_HASH:
				return getContentHash();
			case R2Package.REFERENCE__UUID:
				return getUuid();
			case R2Package.REFERENCE__IDENTIFIERS:
				return getIdentifiers();
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
			case R2Package.REFERENCE__URL:
				setUrl((UrlType)newValue);
				return;
			case R2Package.REFERENCE__CONTENT_HASH:
				setContentHash((ContentHashType)newValue);
				return;
			case R2Package.REFERENCE__UUID:
				setUuid((UuidType)newValue);
				return;
			case R2Package.REFERENCE__IDENTIFIERS:
				setIdentifiers((IdentifiersType)newValue);
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
			case R2Package.REFERENCE__URL:
				setUrl((UrlType)null);
				return;
			case R2Package.REFERENCE__CONTENT_HASH:
				setContentHash((ContentHashType)null);
				return;
			case R2Package.REFERENCE__UUID:
				setUuid((UuidType)null);
				return;
			case R2Package.REFERENCE__IDENTIFIERS:
				setIdentifiers((IdentifiersType)null);
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
			case R2Package.REFERENCE__URL:
				return url != null;
			case R2Package.REFERENCE__CONTENT_HASH:
				return contentHash != null;
			case R2Package.REFERENCE__UUID:
				return uuid != null;
			case R2Package.REFERENCE__IDENTIFIERS:
				return identifiers != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
