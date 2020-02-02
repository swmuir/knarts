/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.knowledgeartifact.r2.DataEventTrigger;
import org.hl7.knowledgeartifact.r2.DataEventType;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.DataEventTriggerImpl#getTriggerType <em>Trigger Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataEventTriggerImpl extends TriggerImpl implements DataEventTrigger {
	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final DataEventType TRIGGER_TYPE_EDEFAULT = DataEventType.DATA_ELEMENT_ADDED;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected DataEventType triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * This is true if the Trigger Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggerTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getDataEventTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventType getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(DataEventType newTriggerType) {
		DataEventType oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		boolean oldTriggerTypeESet = triggerTypeESet;
		triggerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE, oldTriggerType, triggerType, !oldTriggerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriggerType() {
		DataEventType oldTriggerType = triggerType;
		boolean oldTriggerTypeESet = triggerTypeESet;
		triggerType = TRIGGER_TYPE_EDEFAULT;
		triggerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE, oldTriggerType, TRIGGER_TYPE_EDEFAULT, oldTriggerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriggerType() {
		return triggerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE:
				return getTriggerType();
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
			case R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE:
				setTriggerType((DataEventType)newValue);
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
			case R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE:
				unsetTriggerType();
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
			case R2Package.DATA_EVENT_TRIGGER__TRIGGER_TYPE:
				return isSetTriggerType();
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
		result.append(" (triggerType: ");
		if (triggerTypeESet) result.append(triggerType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataEventTriggerImpl
