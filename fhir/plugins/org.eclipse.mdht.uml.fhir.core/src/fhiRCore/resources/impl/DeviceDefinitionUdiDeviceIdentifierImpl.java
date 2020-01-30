/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Udi Device Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DeviceDefinitionUdiDeviceIdentifierImpl#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceDefinitionUdiDeviceIdentifierImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceDefinitionUdiDeviceIdentifierImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionUdiDeviceIdentifierImpl extends BackboneElementImpl implements DeviceDefinitionUdiDeviceIdentifier {
	/**
	 * The cached value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String deviceIdentifier;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected Uri issuer;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected Uri jurisdiction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionUdiDeviceIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceDefinitionUdiDeviceIdentifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDeviceIdentifier() {
		return deviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceIdentifier(fhiRCore.dataTypes.String newDeviceIdentifier, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDeviceIdentifier = deviceIdentifier;
		deviceIdentifier = newDeviceIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER, oldDeviceIdentifier, newDeviceIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceIdentifier(fhiRCore.dataTypes.String newDeviceIdentifier) {
		if (newDeviceIdentifier != deviceIdentifier) {
			NotificationChain msgs = null;
			if (deviceIdentifier != null)
				msgs = ((InternalEObject)deviceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER, null, msgs);
			if (newDeviceIdentifier != null)
				msgs = ((InternalEObject)newDeviceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER, null, msgs);
			msgs = basicSetDeviceIdentifier(newDeviceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER, newDeviceIdentifier, newDeviceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(Uri newIssuer, NotificationChain msgs) {
		Uri oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER, oldIssuer, newIssuer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(Uri newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(Uri newJurisdiction, NotificationChain msgs) {
		Uri oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION, oldJurisdiction, newJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(Uri newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER:
				return basicSetDeviceIdentifier(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER:
				return basicSetIssuer(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
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
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER:
				return getDeviceIdentifier();
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER:
				return getIssuer();
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION:
				return getJurisdiction();
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
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER:
				setDeviceIdentifier((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER:
				setIssuer((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION:
				setJurisdiction((Uri)newValue);
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
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER:
				setDeviceIdentifier((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER:
				setIssuer((Uri)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION:
				setJurisdiction((Uri)null);
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
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__DEVICE_IDENTIFIER:
				return deviceIdentifier != null;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__ISSUER:
				return issuer != null;
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER__JURISDICTION:
				return jurisdiction != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionUdiDeviceIdentifierImpl
