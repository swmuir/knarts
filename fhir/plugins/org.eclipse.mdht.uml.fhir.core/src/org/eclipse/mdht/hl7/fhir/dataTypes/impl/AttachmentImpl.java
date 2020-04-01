/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.Base64Binary;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.AttachmentImpl#getCreation <em>Creation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends DataTypeImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary data;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt size;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary hash;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected DateTime creation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(Code newContentType, NotificationChain msgs) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CONTENT_TYPE, oldContentType, newContentType);
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
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Code newLanguage, NotificationChain msgs) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(Code newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Base64Binary newData, NotificationChain msgs) {
		Base64Binary oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__DATA, oldData, newData);
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
	public void setData(Base64Binary newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__URL, oldUrl, newUrl);
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
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(UnsignedInt newSize, NotificationChain msgs) {
		UnsignedInt oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__SIZE, oldSize, newSize);
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
	public void setSize(UnsignedInt newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHash(Base64Binary newHash, NotificationChain msgs) {
		Base64Binary oldHash = hash;
		hash = newHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__HASH, oldHash, newHash);
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
	public void setHash(Base64Binary newHash) {
		if (newHash != hash) {
			NotificationChain msgs = null;
			if (hash != null)
				msgs = ((InternalEObject)hash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__HASH, null, msgs);
			if (newHash != null)
				msgs = ((InternalEObject)newHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__HASH, null, msgs);
			msgs = basicSetHash(newHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__HASH, newHash, newHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreation(DateTime newCreation, NotificationChain msgs) {
		DateTime oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CREATION, oldCreation, newCreation);
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
	public void setCreation(DateTime newCreation) {
		if (newCreation != creation) {
			NotificationChain msgs = null;
			if (creation != null)
				msgs = ((InternalEObject)creation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__CREATION, null, msgs);
			if (newCreation != null)
				msgs = ((InternalEObject)newCreation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ATTACHMENT__CREATION, null, msgs);
			msgs = basicSetCreation(newCreation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CREATION, newCreation, newCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case DataTypesPackage.ATTACHMENT__DATA:
				return basicSetData(null, msgs);
			case DataTypesPackage.ATTACHMENT__URL:
				return basicSetUrl(null, msgs);
			case DataTypesPackage.ATTACHMENT__SIZE:
				return basicSetSize(null, msgs);
			case DataTypesPackage.ATTACHMENT__HASH:
				return basicSetHash(null, msgs);
			case DataTypesPackage.ATTACHMENT__TITLE:
				return basicSetTitle(null, msgs);
			case DataTypesPackage.ATTACHMENT__CREATION:
				return basicSetCreation(null, msgs);
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
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				return getContentType();
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				return getLanguage();
			case DataTypesPackage.ATTACHMENT__DATA:
				return getData();
			case DataTypesPackage.ATTACHMENT__URL:
				return getUrl();
			case DataTypesPackage.ATTACHMENT__SIZE:
				return getSize();
			case DataTypesPackage.ATTACHMENT__HASH:
				return getHash();
			case DataTypesPackage.ATTACHMENT__TITLE:
				return getTitle();
			case DataTypesPackage.ATTACHMENT__CREATION:
				return getCreation();
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
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__DATA:
				setData((Base64Binary)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__URL:
				setUrl((Url)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__SIZE:
				setSize((UnsignedInt)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)newValue);
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
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)null);
				return;
			case DataTypesPackage.ATTACHMENT__DATA:
				setData((Base64Binary)null);
				return;
			case DataTypesPackage.ATTACHMENT__URL:
				setUrl((Url)null);
				return;
			case DataTypesPackage.ATTACHMENT__SIZE:
				setSize((UnsignedInt)null);
				return;
			case DataTypesPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)null);
				return;
			case DataTypesPackage.ATTACHMENT__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)null);
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
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				return contentType != null;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				return language != null;
			case DataTypesPackage.ATTACHMENT__DATA:
				return data != null;
			case DataTypesPackage.ATTACHMENT__URL:
				return url != null;
			case DataTypesPackage.ATTACHMENT__SIZE:
				return size != null;
			case DataTypesPackage.ATTACHMENT__HASH:
				return hash != null;
			case DataTypesPackage.ATTACHMENT__TITLE:
				return title != null;
			case DataTypesPackage.ATTACHMENT__CREATION:
				return creation != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
