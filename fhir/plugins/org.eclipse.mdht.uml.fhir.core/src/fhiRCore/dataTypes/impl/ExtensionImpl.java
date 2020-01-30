/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Extension;
import fhiRCore.dataTypes.ExtensionUrl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ExtensionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ExtensionImpl#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends DataTypeImpl implements Extension {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected ExtensionUrl url;

	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionUrl getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(ExtensionUrl newUrl, NotificationChain msgs) {
		ExtensionUrl oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.EXTENSION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(ExtensionUrl newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.EXTENSION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.EXTENSION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.EXTENSION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.EXTENSION__VALUEX, oldValuex, newValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.EXTENSION__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.EXTENSION__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.EXTENSION__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.EXTENSION__URL:
				return basicSetUrl(null, msgs);
			case DataTypesPackage.EXTENSION__VALUEX:
				return basicSetValuex(null, msgs);
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
			case DataTypesPackage.EXTENSION__URL:
				return getUrl();
			case DataTypesPackage.EXTENSION__VALUEX:
				return getValuex();
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
			case DataTypesPackage.EXTENSION__URL:
				setUrl((ExtensionUrl)newValue);
				return;
			case DataTypesPackage.EXTENSION__VALUEX:
				setValuex((DataType)newValue);
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
			case DataTypesPackage.EXTENSION__URL:
				setUrl((ExtensionUrl)null);
				return;
			case DataTypesPackage.EXTENSION__VALUEX:
				setValuex((DataType)null);
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
			case DataTypesPackage.EXTENSION__URL:
				return url != null;
			case DataTypesPackage.EXTENSION__VALUEX:
				return valuex != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionImpl
