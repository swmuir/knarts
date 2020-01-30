/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.DeviceUdiCarrier;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Udi Carrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getCarrierAidc <em>Carrier Aidc</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getCarrierHrf <em>Carrier Hrf</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceUdiCarrierImpl#getEntryType <em>Entry Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUdiCarrierImpl extends BackboneElementImpl implements DeviceUdiCarrier {
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
	 * The cached value of the '{@link #getCarrierAidc() <em>Carrier Aidc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierAidc()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary carrierAidc;

	/**
	 * The cached value of the '{@link #getCarrierHrf() <em>Carrier Hrf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierHrf()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String carrierHrf;

	/**
	 * The cached value of the '{@link #getEntryType() <em>Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected Code entryType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUdiCarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceUdiCarrier();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER, oldDeviceIdentifier, newDeviceIdentifier);
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
				msgs = ((InternalEObject)deviceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER, null, msgs);
			if (newDeviceIdentifier != null)
				msgs = ((InternalEObject)newDeviceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER, null, msgs);
			msgs = basicSetDeviceIdentifier(newDeviceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER, newDeviceIdentifier, newDeviceIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER, oldIssuer, newIssuer);
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
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER, newIssuer, newIssuer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION, oldJurisdiction, newJurisdiction);
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
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getCarrierAidc() {
		return carrierAidc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierAidc(Base64Binary newCarrierAidc, NotificationChain msgs) {
		Base64Binary oldCarrierAidc = carrierAidc;
		carrierAidc = newCarrierAidc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC, oldCarrierAidc, newCarrierAidc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierAidc(Base64Binary newCarrierAidc) {
		if (newCarrierAidc != carrierAidc) {
			NotificationChain msgs = null;
			if (carrierAidc != null)
				msgs = ((InternalEObject)carrierAidc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC, null, msgs);
			if (newCarrierAidc != null)
				msgs = ((InternalEObject)newCarrierAidc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC, null, msgs);
			msgs = basicSetCarrierAidc(newCarrierAidc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC, newCarrierAidc, newCarrierAidc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCarrierHrf() {
		return carrierHrf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierHrf(fhiRCore.dataTypes.String newCarrierHrf, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCarrierHrf = carrierHrf;
		carrierHrf = newCarrierHrf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF, oldCarrierHrf, newCarrierHrf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierHrf(fhiRCore.dataTypes.String newCarrierHrf) {
		if (newCarrierHrf != carrierHrf) {
			NotificationChain msgs = null;
			if (carrierHrf != null)
				msgs = ((InternalEObject)carrierHrf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF, null, msgs);
			if (newCarrierHrf != null)
				msgs = ((InternalEObject)newCarrierHrf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF, null, msgs);
			msgs = basicSetCarrierHrf(newCarrierHrf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF, newCarrierHrf, newCarrierHrf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getEntryType() {
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryType(Code newEntryType, NotificationChain msgs) {
		Code oldEntryType = entryType;
		entryType = newEntryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE, oldEntryType, newEntryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryType(Code newEntryType) {
		if (newEntryType != entryType) {
			NotificationChain msgs = null;
			if (entryType != null)
				msgs = ((InternalEObject)entryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE, null, msgs);
			if (newEntryType != null)
				msgs = ((InternalEObject)newEntryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE, null, msgs);
			msgs = basicSetEntryType(newEntryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE, newEntryType, newEntryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER:
				return basicSetDeviceIdentifier(null, msgs);
			case ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER:
				return basicSetIssuer(null, msgs);
			case ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC:
				return basicSetCarrierAidc(null, msgs);
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF:
				return basicSetCarrierHrf(null, msgs);
			case ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE:
				return basicSetEntryType(null, msgs);
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
			case ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER:
				return getDeviceIdentifier();
			case ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER:
				return getIssuer();
			case ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION:
				return getJurisdiction();
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC:
				return getCarrierAidc();
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF:
				return getCarrierHrf();
			case ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE:
				return getEntryType();
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
			case ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER:
				setDeviceIdentifier((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER:
				setIssuer((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION:
				setJurisdiction((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC:
				setCarrierAidc((Base64Binary)newValue);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF:
				setCarrierHrf((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE:
				setEntryType((Code)newValue);
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
			case ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER:
				setDeviceIdentifier((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER:
				setIssuer((Uri)null);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION:
				setJurisdiction((Uri)null);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC:
				setCarrierAidc((Base64Binary)null);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF:
				setCarrierHrf((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE:
				setEntryType((Code)null);
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
			case ResourcesPackage.DEVICE_UDI_CARRIER__DEVICE_IDENTIFIER:
				return deviceIdentifier != null;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ISSUER:
				return issuer != null;
			case ResourcesPackage.DEVICE_UDI_CARRIER__JURISDICTION:
				return jurisdiction != null;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_AIDC:
				return carrierAidc != null;
			case ResourcesPackage.DEVICE_UDI_CARRIER__CARRIER_HRF:
				return carrierHrf != null;
			case ResourcesPackage.DEVICE_UDI_CARRIER__ENTRY_TYPE:
				return entryType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUdiCarrierImpl
