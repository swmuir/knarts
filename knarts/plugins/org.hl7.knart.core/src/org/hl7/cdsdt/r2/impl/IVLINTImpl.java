/**
 */
package org.hl7.cdsdt.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.INT;
import org.hl7.cdsdt.r2.IVLINT;
import org.hl7.cdsdt.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IVLINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IVLINTImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IVLINTImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IVLINTImpl#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IVLINTImpl#isLowClosed <em>Low Closed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IVLINTImpl extends IVLImpl implements IVLINT {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected INT low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected INT high;

	/**
	 * The default value of the '{@link #isHighClosed() <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGH_CLOSED_EDEFAULT = false;

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
	protected static final boolean LOW_CLOSED_EDEFAULT = false;

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
	protected IVLINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.IVLINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(INT newLow, NotificationChain msgs) {
		INT oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__LOW, oldLow, newLow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(INT newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.IVLINT__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.IVLINT__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(INT newHigh, NotificationChain msgs) {
		INT oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__HIGH, oldHigh, newHigh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(INT newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.IVLINT__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.IVLINT__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__HIGH, newHigh, newHigh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__HIGH_CLOSED, oldHighClosed, highClosed, !oldHighClosedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.IVLINT__HIGH_CLOSED, oldHighClosed, HIGH_CLOSED_EDEFAULT, oldHighClosedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.IVLINT__LOW_CLOSED, oldLowClosed, lowClosed, !oldLowClosedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.IVLINT__LOW_CLOSED, oldLowClosed, LOW_CLOSED_EDEFAULT, oldLowClosedESet));
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
			case R2Package.IVLINT__LOW:
				return basicSetLow(null, msgs);
			case R2Package.IVLINT__HIGH:
				return basicSetHigh(null, msgs);
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
			case R2Package.IVLINT__LOW:
				return getLow();
			case R2Package.IVLINT__HIGH:
				return getHigh();
			case R2Package.IVLINT__HIGH_CLOSED:
				return isHighClosed();
			case R2Package.IVLINT__LOW_CLOSED:
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
			case R2Package.IVLINT__LOW:
				setLow((INT)newValue);
				return;
			case R2Package.IVLINT__HIGH:
				setHigh((INT)newValue);
				return;
			case R2Package.IVLINT__HIGH_CLOSED:
				setHighClosed((Boolean)newValue);
				return;
			case R2Package.IVLINT__LOW_CLOSED:
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
			case R2Package.IVLINT__LOW:
				setLow((INT)null);
				return;
			case R2Package.IVLINT__HIGH:
				setHigh((INT)null);
				return;
			case R2Package.IVLINT__HIGH_CLOSED:
				unsetHighClosed();
				return;
			case R2Package.IVLINT__LOW_CLOSED:
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
			case R2Package.IVLINT__LOW:
				return low != null;
			case R2Package.IVLINT__HIGH:
				return high != null;
			case R2Package.IVLINT__HIGH_CLOSED:
				return isSetHighClosed();
			case R2Package.IVLINT__LOW_CLOSED:
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

} //IVLINTImpl
