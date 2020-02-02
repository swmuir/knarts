/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.Interval;
import org.hl7.elm.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#getLowClosedExpression <em>Low Closed Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#getHighClosedExpression <em>High Closed Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalImpl#isLowClosed <em>Low Closed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalImpl extends ExpressionImpl implements Interval {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected Expression low;

	/**
	 * The cached value of the '{@link #getLowClosedExpression() <em>Low Closed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowClosedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression lowClosedExpression;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected Expression high;

	/**
	 * The cached value of the '{@link #getHighClosedExpression() <em>High Closed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighClosedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression highClosedExpression;

	/**
	 * The default value of the '{@link #isHighClosed() <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGH_CLOSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHighClosed() <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean highClosed = HIGH_CLOSED_EDEFAULT;

	/**
	 * This is true if the High Closed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highClosedESet;

	/**
	 * The default value of the '{@link #isLowClosed() <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOW_CLOSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLowClosed() <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean lowClosed = LOW_CLOSED_EDEFAULT;

	/**
	 * This is true if the Low Closed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowClosedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(Expression newLow, NotificationChain msgs) {
		Expression oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__LOW, oldLow, newLow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(Expression newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLowClosedExpression() {
		return lowClosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowClosedExpression(Expression newLowClosedExpression, NotificationChain msgs) {
		Expression oldLowClosedExpression = lowClosedExpression;
		lowClosedExpression = newLowClosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__LOW_CLOSED_EXPRESSION, oldLowClosedExpression, newLowClosedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowClosedExpression(Expression newLowClosedExpression) {
		if (newLowClosedExpression != lowClosedExpression) {
			NotificationChain msgs = null;
			if (lowClosedExpression != null)
				msgs = ((InternalEObject)lowClosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__LOW_CLOSED_EXPRESSION, null, msgs);
			if (newLowClosedExpression != null)
				msgs = ((InternalEObject)newLowClosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__LOW_CLOSED_EXPRESSION, null, msgs);
			msgs = basicSetLowClosedExpression(newLowClosedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__LOW_CLOSED_EXPRESSION, newLowClosedExpression, newLowClosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(Expression newHigh, NotificationChain msgs) {
		Expression oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__HIGH, oldHigh, newHigh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(Expression newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHighClosedExpression() {
		return highClosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighClosedExpression(Expression newHighClosedExpression, NotificationChain msgs) {
		Expression oldHighClosedExpression = highClosedExpression;
		highClosedExpression = newHighClosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION, oldHighClosedExpression, newHighClosedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighClosedExpression(Expression newHighClosedExpression) {
		if (newHighClosedExpression != highClosedExpression) {
			NotificationChain msgs = null;
			if (highClosedExpression != null)
				msgs = ((InternalEObject)highClosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION, null, msgs);
			if (newHighClosedExpression != null)
				msgs = ((InternalEObject)newHighClosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION, null, msgs);
			msgs = basicSetHighClosedExpression(newHighClosedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION, newHighClosedExpression, newHighClosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHighClosed() {
		return highClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighClosed(boolean newHighClosed) {
		boolean oldHighClosed = highClosed;
		highClosed = newHighClosed;
		boolean oldHighClosedESet = highClosedESet;
		highClosedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__HIGH_CLOSED, oldHighClosed, highClosed, !oldHighClosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHighClosed() {
		boolean oldHighClosed = highClosed;
		boolean oldHighClosedESet = highClosedESet;
		highClosed = HIGH_CLOSED_EDEFAULT;
		highClosedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.INTERVAL__HIGH_CLOSED, oldHighClosed, HIGH_CLOSED_EDEFAULT, oldHighClosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHighClosed() {
		return highClosedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLowClosed() {
		return lowClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowClosed(boolean newLowClosed) {
		boolean oldLowClosed = lowClosed;
		lowClosed = newLowClosed;
		boolean oldLowClosedESet = lowClosedESet;
		lowClosedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL__LOW_CLOSED, oldLowClosed, lowClosed, !oldLowClosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowClosed() {
		boolean oldLowClosed = lowClosed;
		boolean oldLowClosedESet = lowClosedESet;
		lowClosed = LOW_CLOSED_EDEFAULT;
		lowClosedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.INTERVAL__LOW_CLOSED, oldLowClosed, LOW_CLOSED_EDEFAULT, oldLowClosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowClosed() {
		return lowClosedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.INTERVAL__LOW:
				return basicSetLow(null, msgs);
			case R1Package.INTERVAL__LOW_CLOSED_EXPRESSION:
				return basicSetLowClosedExpression(null, msgs);
			case R1Package.INTERVAL__HIGH:
				return basicSetHigh(null, msgs);
			case R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION:
				return basicSetHighClosedExpression(null, msgs);
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
			case R1Package.INTERVAL__LOW:
				return getLow();
			case R1Package.INTERVAL__LOW_CLOSED_EXPRESSION:
				return getLowClosedExpression();
			case R1Package.INTERVAL__HIGH:
				return getHigh();
			case R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION:
				return getHighClosedExpression();
			case R1Package.INTERVAL__HIGH_CLOSED:
				return isHighClosed();
			case R1Package.INTERVAL__LOW_CLOSED:
				return isLowClosed();
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
			case R1Package.INTERVAL__LOW:
				setLow((Expression)newValue);
				return;
			case R1Package.INTERVAL__LOW_CLOSED_EXPRESSION:
				setLowClosedExpression((Expression)newValue);
				return;
			case R1Package.INTERVAL__HIGH:
				setHigh((Expression)newValue);
				return;
			case R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION:
				setHighClosedExpression((Expression)newValue);
				return;
			case R1Package.INTERVAL__HIGH_CLOSED:
				setHighClosed((Boolean)newValue);
				return;
			case R1Package.INTERVAL__LOW_CLOSED:
				setLowClosed((Boolean)newValue);
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
			case R1Package.INTERVAL__LOW:
				setLow((Expression)null);
				return;
			case R1Package.INTERVAL__LOW_CLOSED_EXPRESSION:
				setLowClosedExpression((Expression)null);
				return;
			case R1Package.INTERVAL__HIGH:
				setHigh((Expression)null);
				return;
			case R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION:
				setHighClosedExpression((Expression)null);
				return;
			case R1Package.INTERVAL__HIGH_CLOSED:
				unsetHighClosed();
				return;
			case R1Package.INTERVAL__LOW_CLOSED:
				unsetLowClosed();
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
			case R1Package.INTERVAL__LOW:
				return low != null;
			case R1Package.INTERVAL__LOW_CLOSED_EXPRESSION:
				return lowClosedExpression != null;
			case R1Package.INTERVAL__HIGH:
				return high != null;
			case R1Package.INTERVAL__HIGH_CLOSED_EXPRESSION:
				return highClosedExpression != null;
			case R1Package.INTERVAL__HIGH_CLOSED:
				return isSetHighClosed();
			case R1Package.INTERVAL__LOW_CLOSED:
				return isSetLowClosed();
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
		result.append(" (highClosed: ");
		if (highClosedESet) result.append(highClosed); else result.append("<unset>");
		result.append(", lowClosed: ");
		if (lowClosedESet) result.append(lowClosed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
