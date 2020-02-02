/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.knowledgeartifact.r2.NamedEventTrigger;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.NamedEventTriggerImpl#getOnEventName <em>On Event Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedEventTriggerImpl extends TriggerImpl implements NamedEventTrigger {
	/**
	 * The default value of the '{@link #getOnEventName() <em>On Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnEventName() <em>On Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEventName()
	 * @generated
	 * @ordered
	 */
	protected String onEventName = ON_EVENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getNamedEventTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnEventName() {
		return onEventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEventName(String newOnEventName) {
		String oldOnEventName = onEventName;
		onEventName = newOnEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.NAMED_EVENT_TRIGGER__ON_EVENT_NAME, oldOnEventName, onEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.NAMED_EVENT_TRIGGER__ON_EVENT_NAME:
				return getOnEventName();
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
			case R2Package.NAMED_EVENT_TRIGGER__ON_EVENT_NAME:
				setOnEventName((String)newValue);
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
			case R2Package.NAMED_EVENT_TRIGGER__ON_EVENT_NAME:
				setOnEventName(ON_EVENT_NAME_EDEFAULT);
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
			case R2Package.NAMED_EVENT_TRIGGER__ON_EVENT_NAME:
				return ON_EVENT_NAME_EDEFAULT == null ? onEventName != null : !ON_EVENT_NAME_EDEFAULT.equals(onEventName);
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
		result.append(" (onEventName: ");
		result.append(onEventName);
		result.append(')');
		return result.toString();
	}

} //NamedEventTriggerImpl
