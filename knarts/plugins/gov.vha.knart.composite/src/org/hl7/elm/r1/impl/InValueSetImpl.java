/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.InValueSet;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.ValueSetRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.InValueSetImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.InValueSetImpl#getValueset <em>Valueset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InValueSetImpl extends ExpressionImpl implements InValueSet {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Expression code;

	/**
	 * The cached value of the '{@link #getValueset() <em>Valueset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueset()
	 * @generated
	 * @ordered
	 */
	protected ValueSetRef valueset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getInValueSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Expression newCode, NotificationChain msgs) {
		Expression oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.IN_VALUE_SET__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Expression newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_VALUE_SET__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_VALUE_SET__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IN_VALUE_SET__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetRef getValueset() {
		return valueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueset(ValueSetRef newValueset, NotificationChain msgs) {
		ValueSetRef oldValueset = valueset;
		valueset = newValueset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.IN_VALUE_SET__VALUESET, oldValueset, newValueset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueset(ValueSetRef newValueset) {
		if (newValueset != valueset) {
			NotificationChain msgs = null;
			if (valueset != null)
				msgs = ((InternalEObject)valueset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_VALUE_SET__VALUESET, null, msgs);
			if (newValueset != null)
				msgs = ((InternalEObject)newValueset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_VALUE_SET__VALUESET, null, msgs);
			msgs = basicSetValueset(newValueset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IN_VALUE_SET__VALUESET, newValueset, newValueset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.IN_VALUE_SET__CODE:
				return basicSetCode(null, msgs);
			case R1Package.IN_VALUE_SET__VALUESET:
				return basicSetValueset(null, msgs);
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
			case R1Package.IN_VALUE_SET__CODE:
				return getCode();
			case R1Package.IN_VALUE_SET__VALUESET:
				return getValueset();
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
			case R1Package.IN_VALUE_SET__CODE:
				setCode((Expression)newValue);
				return;
			case R1Package.IN_VALUE_SET__VALUESET:
				setValueset((ValueSetRef)newValue);
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
			case R1Package.IN_VALUE_SET__CODE:
				setCode((Expression)null);
				return;
			case R1Package.IN_VALUE_SET__VALUESET:
				setValueset((ValueSetRef)null);
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
			case R1Package.IN_VALUE_SET__CODE:
				return code != null;
			case R1Package.IN_VALUE_SET__VALUESET:
				return valueset != null;
		}
		return super.eIsSet(featureID);
	}

} //InValueSetImpl
