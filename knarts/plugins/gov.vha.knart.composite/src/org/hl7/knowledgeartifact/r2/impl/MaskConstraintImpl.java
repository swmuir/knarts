/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.ST;

import org.hl7.knowledgeartifact.r2.MaskConstraint;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mask Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.MaskConstraintImpl#getMaskExpression <em>Mask Expression</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.MaskConstraintImpl#getMaskHelp <em>Mask Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaskConstraintImpl extends RangeConstraintImpl implements MaskConstraint {
	/**
	 * The cached value of the '{@link #getMaskExpression() <em>Mask Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskExpression()
	 * @generated
	 * @ordered
	 */
	protected ST maskExpression;

	/**
	 * The cached value of the '{@link #getMaskHelp() <em>Mask Help</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskHelp()
	 * @generated
	 * @ordered
	 */
	protected ST maskHelp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaskConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getMaskConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getMaskExpression() {
		return maskExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaskExpression(ST newMaskExpression, NotificationChain msgs) {
		ST oldMaskExpression = maskExpression;
		maskExpression = newMaskExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MASK_CONSTRAINT__MASK_EXPRESSION, oldMaskExpression, newMaskExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskExpression(ST newMaskExpression) {
		if (newMaskExpression != maskExpression) {
			NotificationChain msgs = null;
			if (maskExpression != null)
				msgs = ((InternalEObject)maskExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MASK_CONSTRAINT__MASK_EXPRESSION, null, msgs);
			if (newMaskExpression != null)
				msgs = ((InternalEObject)newMaskExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MASK_CONSTRAINT__MASK_EXPRESSION, null, msgs);
			msgs = basicSetMaskExpression(newMaskExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MASK_CONSTRAINT__MASK_EXPRESSION, newMaskExpression, newMaskExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getMaskHelp() {
		return maskHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaskHelp(ST newMaskHelp, NotificationChain msgs) {
		ST oldMaskHelp = maskHelp;
		maskHelp = newMaskHelp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MASK_CONSTRAINT__MASK_HELP, oldMaskHelp, newMaskHelp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskHelp(ST newMaskHelp) {
		if (newMaskHelp != maskHelp) {
			NotificationChain msgs = null;
			if (maskHelp != null)
				msgs = ((InternalEObject)maskHelp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MASK_CONSTRAINT__MASK_HELP, null, msgs);
			if (newMaskHelp != null)
				msgs = ((InternalEObject)newMaskHelp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MASK_CONSTRAINT__MASK_HELP, null, msgs);
			msgs = basicSetMaskHelp(newMaskHelp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MASK_CONSTRAINT__MASK_HELP, newMaskHelp, newMaskHelp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.MASK_CONSTRAINT__MASK_EXPRESSION:
				return basicSetMaskExpression(null, msgs);
			case R2Package.MASK_CONSTRAINT__MASK_HELP:
				return basicSetMaskHelp(null, msgs);
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
			case R2Package.MASK_CONSTRAINT__MASK_EXPRESSION:
				return getMaskExpression();
			case R2Package.MASK_CONSTRAINT__MASK_HELP:
				return getMaskHelp();
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
			case R2Package.MASK_CONSTRAINT__MASK_EXPRESSION:
				setMaskExpression((ST)newValue);
				return;
			case R2Package.MASK_CONSTRAINT__MASK_HELP:
				setMaskHelp((ST)newValue);
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
			case R2Package.MASK_CONSTRAINT__MASK_EXPRESSION:
				setMaskExpression((ST)null);
				return;
			case R2Package.MASK_CONSTRAINT__MASK_HELP:
				setMaskHelp((ST)null);
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
			case R2Package.MASK_CONSTRAINT__MASK_EXPRESSION:
				return maskExpression != null;
			case R2Package.MASK_CONSTRAINT__MASK_HELP:
				return maskHelp != null;
		}
		return super.eIsSet(featureID);
	}

} //MaskConstraintImpl
