/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Time;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.PractitionerRoleAvailableTime;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Role Available Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleAvailableTimeImpl#getDaysOfWeeks <em>Days Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleAvailableTimeImpl#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleAvailableTimeImpl#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleAvailableTimeImpl#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerRoleAvailableTimeImpl extends BackboneElementImpl implements PractitionerRoleAvailableTime {
	/**
	 * The cached value of the '{@link #getDaysOfWeeks() <em>Days Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> daysOfWeeks;

	/**
	 * The cached value of the '{@link #getAllDay() <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean allDay;

	/**
	 * The cached value of the '{@link #getAvailableStartTime() <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableStartTime;

	/**
	 * The cached value of the '{@link #getAvailableEndTime() <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableEndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerRoleAvailableTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPractitionerRoleAvailableTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getDaysOfWeeks() {
		if (daysOfWeeks == null) {
			daysOfWeeks = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK);
		}
		return daysOfWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getAllDay() {
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllDay(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newAllDay, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldAllDay = allDay;
		allDay = newAllDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY, oldAllDay, newAllDay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllDay(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newAllDay) {
		if (newAllDay != allDay) {
			NotificationChain msgs = null;
			if (allDay != null)
				msgs = ((InternalEObject)allDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY, null, msgs);
			if (newAllDay != null)
				msgs = ((InternalEObject)newAllDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY, null, msgs);
			msgs = basicSetAllDay(newAllDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY, newAllDay, newAllDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getAvailableStartTime() {
		return availableStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableStartTime(Time newAvailableStartTime, NotificationChain msgs) {
		Time oldAvailableStartTime = availableStartTime;
		availableStartTime = newAvailableStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME, oldAvailableStartTime, newAvailableStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableStartTime(Time newAvailableStartTime) {
		if (newAvailableStartTime != availableStartTime) {
			NotificationChain msgs = null;
			if (availableStartTime != null)
				msgs = ((InternalEObject)availableStartTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			if (newAvailableStartTime != null)
				msgs = ((InternalEObject)newAvailableStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			msgs = basicSetAvailableStartTime(newAvailableStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME, newAvailableStartTime, newAvailableStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getAvailableEndTime() {
		return availableEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableEndTime(Time newAvailableEndTime, NotificationChain msgs) {
		Time oldAvailableEndTime = availableEndTime;
		availableEndTime = newAvailableEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME, oldAvailableEndTime, newAvailableEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableEndTime(Time newAvailableEndTime) {
		if (newAvailableEndTime != availableEndTime) {
			NotificationChain msgs = null;
			if (availableEndTime != null)
				msgs = ((InternalEObject)availableEndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			if (newAvailableEndTime != null)
				msgs = ((InternalEObject)newAvailableEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			msgs = basicSetAvailableEndTime(newAvailableEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME, newAvailableEndTime, newAvailableEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return ((InternalEList<?>)getDaysOfWeeks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY:
				return basicSetAllDay(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return basicSetAvailableStartTime(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return basicSetAvailableEndTime(null, msgs);
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
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return getDaysOfWeeks();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY:
				return getAllDay();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return getAvailableStartTime();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return getAvailableEndTime();
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
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeeks().clear();
				getDaysOfWeeks().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)newValue);
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
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeeks().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)null);
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
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return daysOfWeeks != null && !daysOfWeeks.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__ALL_DAY:
				return allDay != null;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return availableStartTime != null;
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return availableEndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //PractitionerRoleAvailableTimeImpl
