/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.IntervalTypeSpecifier;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.IntervalTypeSpecifierImpl#getPointType <em>Point Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalTypeSpecifierImpl extends TypeSpecifierImpl implements IntervalTypeSpecifier {
	/**
	 * The cached value of the '{@link #getPointType() <em>Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointType()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier pointType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalTypeSpecifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getIntervalTypeSpecifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getPointType() {
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointType(TypeSpecifier newPointType, NotificationChain msgs) {
		TypeSpecifier oldPointType = pointType;
		pointType = newPointType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE, oldPointType, newPointType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointType(TypeSpecifier newPointType) {
		if (newPointType != pointType) {
			NotificationChain msgs = null;
			if (pointType != null)
				msgs = ((InternalEObject)pointType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE, null, msgs);
			if (newPointType != null)
				msgs = ((InternalEObject)newPointType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE, null, msgs);
			msgs = basicSetPointType(newPointType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE, newPointType, newPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE:
				return basicSetPointType(null, msgs);
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
			case R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE:
				return getPointType();
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
			case R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE:
				setPointType((TypeSpecifier)newValue);
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
			case R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE:
				setPointType((TypeSpecifier)null);
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
			case R1Package.INTERVAL_TYPE_SPECIFIER__POINT_TYPE:
				return pointType != null;
		}
		return super.eIsSet(featureID);
	}

} //IntervalTypeSpecifierImpl
