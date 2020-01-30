/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Binary;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.BinaryImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BinaryImpl#getSecurityContext <em>Security Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BinaryImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryImpl extends ResourceImpl implements Binary {
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
	 * The cached value of the '{@link #getSecurityContext() <em>Security Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityContext()
	 * @generated
	 * @ordered
	 */
	protected Reference securityContext;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBinary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__CONTENT_TYPE, oldContentType, newContentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSecurityContext() {
		return securityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityContext(Reference newSecurityContext, NotificationChain msgs) {
		Reference oldSecurityContext = securityContext;
		securityContext = newSecurityContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__SECURITY_CONTEXT, oldSecurityContext, newSecurityContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityContext(Reference newSecurityContext) {
		if (newSecurityContext != securityContext) {
			NotificationChain msgs = null;
			if (securityContext != null)
				msgs = ((InternalEObject)securityContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__SECURITY_CONTEXT, null, msgs);
			if (newSecurityContext != null)
				msgs = ((InternalEObject)newSecurityContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__SECURITY_CONTEXT, null, msgs);
			msgs = basicSetSecurityContext(newSecurityContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__SECURITY_CONTEXT, newSecurityContext, newSecurityContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Base64Binary newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BINARY__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BINARY__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BINARY__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case ResourcesPackage.BINARY__SECURITY_CONTEXT:
				return basicSetSecurityContext(null, msgs);
			case ResourcesPackage.BINARY__DATA:
				return basicSetData(null, msgs);
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
			case ResourcesPackage.BINARY__CONTENT_TYPE:
				return getContentType();
			case ResourcesPackage.BINARY__SECURITY_CONTEXT:
				return getSecurityContext();
			case ResourcesPackage.BINARY__DATA:
				return getData();
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
			case ResourcesPackage.BINARY__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case ResourcesPackage.BINARY__SECURITY_CONTEXT:
				setSecurityContext((Reference)newValue);
				return;
			case ResourcesPackage.BINARY__DATA:
				setData((Base64Binary)newValue);
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
			case ResourcesPackage.BINARY__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case ResourcesPackage.BINARY__SECURITY_CONTEXT:
				setSecurityContext((Reference)null);
				return;
			case ResourcesPackage.BINARY__DATA:
				setData((Base64Binary)null);
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
			case ResourcesPackage.BINARY__CONTENT_TYPE:
				return contentType != null;
			case ResourcesPackage.BINARY__SECURITY_CONTEXT:
				return securityContext != null;
			case ResourcesPackage.BINARY__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryImpl
