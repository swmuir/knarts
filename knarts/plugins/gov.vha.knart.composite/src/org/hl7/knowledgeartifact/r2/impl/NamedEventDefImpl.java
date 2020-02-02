/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.EventNameType;
import org.hl7.knowledgeartifact.r2.NamedEventDef;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Event Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.NamedEventDefImpl#getEventName <em>Event Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedEventDefImpl extends MinimalEObjectImpl.Container implements NamedEventDef {
	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected EventNameType eventName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedEventDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getNamedEventDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventNameType getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventName(EventNameType newEventName, NotificationChain msgs) {
		EventNameType oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.NAMED_EVENT_DEF__EVENT_NAME, oldEventName, newEventName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(EventNameType newEventName) {
		if (newEventName != eventName) {
			NotificationChain msgs = null;
			if (eventName != null)
				msgs = ((InternalEObject)eventName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.NAMED_EVENT_DEF__EVENT_NAME, null, msgs);
			if (newEventName != null)
				msgs = ((InternalEObject)newEventName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.NAMED_EVENT_DEF__EVENT_NAME, null, msgs);
			msgs = basicSetEventName(newEventName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.NAMED_EVENT_DEF__EVENT_NAME, newEventName, newEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.NAMED_EVENT_DEF__EVENT_NAME:
				return basicSetEventName(null, msgs);
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
			case R2Package.NAMED_EVENT_DEF__EVENT_NAME:
				return getEventName();
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
			case R2Package.NAMED_EVENT_DEF__EVENT_NAME:
				setEventName((EventNameType)newValue);
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
			case R2Package.NAMED_EVENT_DEF__EVENT_NAME:
				setEventName((EventNameType)null);
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
			case R2Package.NAMED_EVENT_DEF__EVENT_NAME:
				return eventName != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedEventDefImpl
