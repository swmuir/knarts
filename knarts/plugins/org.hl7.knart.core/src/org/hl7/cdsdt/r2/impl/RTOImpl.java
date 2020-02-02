/**
 */
package org.hl7.cdsdt.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.QTY;
import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.RTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.RTOImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.RTOImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTOImpl extends QTYImpl implements RTO {
	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected QTY numerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected QTY denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.RTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTY getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumerator(QTY newNumerator, NotificationChain msgs) {
		QTY oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.RTO__NUMERATOR, oldNumerator, newNumerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(QTY newNumerator) {
		if (newNumerator != numerator) {
			NotificationChain msgs = null;
			if (numerator != null)
				msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.RTO__NUMERATOR, null, msgs);
			if (newNumerator != null)
				msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.RTO__NUMERATOR, null, msgs);
			msgs = basicSetNumerator(newNumerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.RTO__NUMERATOR, newNumerator, newNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTY getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(QTY newDenominator, NotificationChain msgs) {
		QTY oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.RTO__DENOMINATOR, oldDenominator, newDenominator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(QTY newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.RTO__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.RTO__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.RTO__DENOMINATOR, newDenominator, newDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.RTO__NUMERATOR:
				return basicSetNumerator(null, msgs);
			case R2Package.RTO__DENOMINATOR:
				return basicSetDenominator(null, msgs);
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
			case R2Package.RTO__NUMERATOR:
				return getNumerator();
			case R2Package.RTO__DENOMINATOR:
				return getDenominator();
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
			case R2Package.RTO__NUMERATOR:
				setNumerator((QTY)newValue);
				return;
			case R2Package.RTO__DENOMINATOR:
				setDenominator((QTY)newValue);
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
			case R2Package.RTO__NUMERATOR:
				setNumerator((QTY)null);
				return;
			case R2Package.RTO__DENOMINATOR:
				setDenominator((QTY)null);
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
			case R2Package.RTO__NUMERATOR:
				return numerator != null;
			case R2Package.RTO__DENOMINATOR:
				return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //RTOImpl
