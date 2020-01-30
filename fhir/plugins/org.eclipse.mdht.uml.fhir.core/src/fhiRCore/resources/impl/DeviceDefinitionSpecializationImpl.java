/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.DeviceDefinitionSpecialization;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DeviceDefinitionSpecializationImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceDefinitionSpecializationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionSpecializationImpl extends BackboneElementImpl implements DeviceDefinitionSpecialization {
	/**
	 * The cached value of the '{@link #getSystemType() <em>System Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String systemType;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionSpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceDefinitionSpecialization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSystemType() {
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemType(fhiRCore.dataTypes.String newSystemType, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSystemType = systemType;
		systemType = newSystemType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE, oldSystemType, newSystemType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemType(fhiRCore.dataTypes.String newSystemType) {
		if (newSystemType != systemType) {
			NotificationChain msgs = null;
			if (systemType != null)
				msgs = ((InternalEObject)systemType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE, null, msgs);
			if (newSystemType != null)
				msgs = ((InternalEObject)newSystemType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE, null, msgs);
			msgs = basicSetSystemType(newSystemType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE, newSystemType, newSystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE:
				return basicSetSystemType(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION:
				return basicSetVersion(null, msgs);
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
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE:
				return getSystemType();
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION:
				return getVersion();
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
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE:
				setSystemType((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE:
				setSystemType((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__SYSTEM_TYPE:
				return systemType != null;
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionSpecializationImpl
