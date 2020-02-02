/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.TimeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.TimeImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.TimeImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.TimeImpl#getMillisecond <em>Millisecond</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.TimeImpl#getTimezoneOffset <em>Timezone Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends ExpressionImpl implements Time {
	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected Expression hour;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected Expression minute;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Expression second;

	/**
	 * The cached value of the '{@link #getMillisecond() <em>Millisecond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMillisecond()
	 * @generated
	 * @ordered
	 */
	protected Expression millisecond;

	/**
	 * The cached value of the '{@link #getTimezoneOffset() <em>Timezone Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezoneOffset()
	 * @generated
	 * @ordered
	 */
	protected Expression timezoneOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHour(Expression newHour, NotificationChain msgs) {
		Expression oldHour = hour;
		hour = newHour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.TIME__HOUR, oldHour, newHour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(Expression newHour) {
		if (newHour != hour) {
			NotificationChain msgs = null;
			if (hour != null)
				msgs = ((InternalEObject)hour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__HOUR, null, msgs);
			if (newHour != null)
				msgs = ((InternalEObject)newHour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__HOUR, null, msgs);
			msgs = basicSetHour(newHour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.TIME__HOUR, newHour, newHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinute(Expression newMinute, NotificationChain msgs) {
		Expression oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.TIME__MINUTE, oldMinute, newMinute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(Expression newMinute) {
		if (newMinute != minute) {
			NotificationChain msgs = null;
			if (minute != null)
				msgs = ((InternalEObject)minute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__MINUTE, null, msgs);
			if (newMinute != null)
				msgs = ((InternalEObject)newMinute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__MINUTE, null, msgs);
			msgs = basicSetMinute(newMinute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.TIME__MINUTE, newMinute, newMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(Expression newSecond, NotificationChain msgs) {
		Expression oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.TIME__SECOND, oldSecond, newSecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(Expression newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.TIME__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMillisecond() {
		return millisecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMillisecond(Expression newMillisecond, NotificationChain msgs) {
		Expression oldMillisecond = millisecond;
		millisecond = newMillisecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.TIME__MILLISECOND, oldMillisecond, newMillisecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMillisecond(Expression newMillisecond) {
		if (newMillisecond != millisecond) {
			NotificationChain msgs = null;
			if (millisecond != null)
				msgs = ((InternalEObject)millisecond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__MILLISECOND, null, msgs);
			if (newMillisecond != null)
				msgs = ((InternalEObject)newMillisecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__MILLISECOND, null, msgs);
			msgs = basicSetMillisecond(newMillisecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.TIME__MILLISECOND, newMillisecond, newMillisecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimezoneOffset() {
		return timezoneOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimezoneOffset(Expression newTimezoneOffset, NotificationChain msgs) {
		Expression oldTimezoneOffset = timezoneOffset;
		timezoneOffset = newTimezoneOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.TIME__TIMEZONE_OFFSET, oldTimezoneOffset, newTimezoneOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezoneOffset(Expression newTimezoneOffset) {
		if (newTimezoneOffset != timezoneOffset) {
			NotificationChain msgs = null;
			if (timezoneOffset != null)
				msgs = ((InternalEObject)timezoneOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__TIMEZONE_OFFSET, null, msgs);
			if (newTimezoneOffset != null)
				msgs = ((InternalEObject)newTimezoneOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.TIME__TIMEZONE_OFFSET, null, msgs);
			msgs = basicSetTimezoneOffset(newTimezoneOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.TIME__TIMEZONE_OFFSET, newTimezoneOffset, newTimezoneOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.TIME__HOUR:
				return basicSetHour(null, msgs);
			case R1Package.TIME__MINUTE:
				return basicSetMinute(null, msgs);
			case R1Package.TIME__SECOND:
				return basicSetSecond(null, msgs);
			case R1Package.TIME__MILLISECOND:
				return basicSetMillisecond(null, msgs);
			case R1Package.TIME__TIMEZONE_OFFSET:
				return basicSetTimezoneOffset(null, msgs);
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
			case R1Package.TIME__HOUR:
				return getHour();
			case R1Package.TIME__MINUTE:
				return getMinute();
			case R1Package.TIME__SECOND:
				return getSecond();
			case R1Package.TIME__MILLISECOND:
				return getMillisecond();
			case R1Package.TIME__TIMEZONE_OFFSET:
				return getTimezoneOffset();
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
			case R1Package.TIME__HOUR:
				setHour((Expression)newValue);
				return;
			case R1Package.TIME__MINUTE:
				setMinute((Expression)newValue);
				return;
			case R1Package.TIME__SECOND:
				setSecond((Expression)newValue);
				return;
			case R1Package.TIME__MILLISECOND:
				setMillisecond((Expression)newValue);
				return;
			case R1Package.TIME__TIMEZONE_OFFSET:
				setTimezoneOffset((Expression)newValue);
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
			case R1Package.TIME__HOUR:
				setHour((Expression)null);
				return;
			case R1Package.TIME__MINUTE:
				setMinute((Expression)null);
				return;
			case R1Package.TIME__SECOND:
				setSecond((Expression)null);
				return;
			case R1Package.TIME__MILLISECOND:
				setMillisecond((Expression)null);
				return;
			case R1Package.TIME__TIMEZONE_OFFSET:
				setTimezoneOffset((Expression)null);
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
			case R1Package.TIME__HOUR:
				return hour != null;
			case R1Package.TIME__MINUTE:
				return minute != null;
			case R1Package.TIME__SECOND:
				return second != null;
			case R1Package.TIME__MILLISECOND:
				return millisecond != null;
			case R1Package.TIME__TIMEZONE_OFFSET:
				return timezoneOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeImpl
