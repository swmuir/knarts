/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r1.ConstraintTypeType;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RangeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.RangeConstraintImpl#getConstraintType <em>Constraint Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RangeConstraintImpl extends MinimalEObjectImpl.Container implements RangeConstraint {
	/**
	 * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected ConstraintTypeType constraintType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.RANGE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeType getConstraintType() {
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintType(ConstraintTypeType newConstraintType, NotificationChain msgs) {
		ConstraintTypeType oldConstraintType = constraintType;
		constraintType = newConstraintType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE, oldConstraintType, newConstraintType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintType(ConstraintTypeType newConstraintType) {
		if (newConstraintType != constraintType) {
			NotificationChain msgs = null;
			if (constraintType != null)
				msgs = ((InternalEObject)constraintType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE, null, msgs);
			if (newConstraintType != null)
				msgs = ((InternalEObject)newConstraintType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE, null, msgs);
			msgs = basicSetConstraintType(newConstraintType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE, newConstraintType, newConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE:
				return basicSetConstraintType(null, msgs);
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
			case R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE:
				return getConstraintType();
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
			case R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE:
				setConstraintType((ConstraintTypeType)newValue);
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
			case R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE:
				setConstraintType((ConstraintTypeType)null);
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
			case R1Package.RANGE_CONSTRAINT__CONSTRAINT_TYPE:
				return constraintType != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeConstraintImpl
