/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.TS;

import org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent;
import org.hl7.knowledgeartifact.r1.EventTypeType;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Life Cycle Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl#getEventDateTime <em>Event Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactLifeCycleEventImpl extends MinimalEObjectImpl.Container implements ArtifactLifeCycleEvent {
	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventTypeType eventType;

	/**
	 * The cached value of the '{@link #getEventDateTime() <em>Event Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDateTime()
	 * @generated
	 * @ordered
	 */
	protected TS eventDateTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactLifeCycleEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.ARTIFACT_LIFE_CYCLE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventType(EventTypeType newEventType, NotificationChain msgs) {
		EventTypeType oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE, oldEventType, newEventType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypeType newEventType) {
		if (newEventType != eventType) {
			NotificationChain msgs = null;
			if (eventType != null)
				msgs = ((InternalEObject)eventType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE, null, msgs);
			if (newEventType != null)
				msgs = ((InternalEObject)newEventType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE, null, msgs);
			msgs = basicSetEventType(newEventType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE, newEventType, newEventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getEventDateTime() {
		return eventDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDateTime(TS newEventDateTime, NotificationChain msgs) {
		TS oldEventDateTime = eventDateTime;
		eventDateTime = newEventDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME, oldEventDateTime, newEventDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDateTime(TS newEventDateTime) {
		if (newEventDateTime != eventDateTime) {
			NotificationChain msgs = null;
			if (eventDateTime != null)
				msgs = ((InternalEObject)eventDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME, null, msgs);
			if (newEventDateTime != null)
				msgs = ((InternalEObject)newEventDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME, null, msgs);
			msgs = basicSetEventDateTime(newEventDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME, newEventDateTime, newEventDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE:
				return basicSetEventType(null, msgs);
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME:
				return basicSetEventDateTime(null, msgs);
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE:
				return getEventType();
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME:
				return getEventDateTime();
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE:
				setEventType((EventTypeType)newValue);
				return;
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME:
				setEventDateTime((TS)newValue);
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE:
				setEventType((EventTypeType)null);
				return;
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME:
				setEventDateTime((TS)null);
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE:
				return eventType != null;
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME:
				return eventDateTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactLifeCycleEventImpl
