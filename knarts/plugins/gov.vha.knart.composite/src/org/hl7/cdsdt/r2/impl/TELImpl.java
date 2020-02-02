/**
 */
package org.hl7.cdsdt.r2.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.TEL;
import org.hl7.cdsdt.r2.TelecommunicationAddressUse;
import org.hl7.cdsdt.r2.TelecommunicationCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.TELImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.TELImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.TELImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TELImpl extends ANYImpl implements TEL {
	/**
	 * The default value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final List<TelecommunicationCapability> CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected List<TelecommunicationCapability> capabilities = CAPABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final List<TelecommunicationAddressUse> USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected List<TelecommunicationAddressUse> use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TELImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.TEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TelecommunicationCapability> getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(List<TelecommunicationCapability> newCapabilities) {
		List<TelecommunicationCapability> oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.TEL__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TelecommunicationAddressUse> getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(List<TelecommunicationAddressUse> newUse) {
		List<TelecommunicationAddressUse> oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.TEL__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.TEL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.TEL__CAPABILITIES:
				return getCapabilities();
			case R2Package.TEL__USE:
				return getUse();
			case R2Package.TEL__VALUE:
				return getValue();
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
			case R2Package.TEL__CAPABILITIES:
				setCapabilities((List<TelecommunicationCapability>)newValue);
				return;
			case R2Package.TEL__USE:
				setUse((List<TelecommunicationAddressUse>)newValue);
				return;
			case R2Package.TEL__VALUE:
				setValue((String)newValue);
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
			case R2Package.TEL__CAPABILITIES:
				setCapabilities(CAPABILITIES_EDEFAULT);
				return;
			case R2Package.TEL__USE:
				setUse(USE_EDEFAULT);
				return;
			case R2Package.TEL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case R2Package.TEL__CAPABILITIES:
				return CAPABILITIES_EDEFAULT == null ? capabilities != null : !CAPABILITIES_EDEFAULT.equals(capabilities);
			case R2Package.TEL__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
			case R2Package.TEL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (capabilities: ");
		result.append(capabilities);
		result.append(", use: ");
		result.append(use);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TELImpl
