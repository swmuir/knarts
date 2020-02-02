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
import org.hl7.elm.r1.Split;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.SplitImpl#getStringToSplit <em>String To Split</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.SplitImpl#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitImpl extends ExpressionImpl implements Split {
	/**
	 * The cached value of the '{@link #getStringToSplit() <em>String To Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringToSplit()
	 * @generated
	 * @ordered
	 */
	protected Expression stringToSplit;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected Expression separator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getSplit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStringToSplit() {
		return stringToSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringToSplit(Expression newStringToSplit, NotificationChain msgs) {
		Expression oldStringToSplit = stringToSplit;
		stringToSplit = newStringToSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.SPLIT__STRING_TO_SPLIT, oldStringToSplit, newStringToSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringToSplit(Expression newStringToSplit) {
		if (newStringToSplit != stringToSplit) {
			NotificationChain msgs = null;
			if (stringToSplit != null)
				msgs = ((InternalEObject)stringToSplit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.SPLIT__STRING_TO_SPLIT, null, msgs);
			if (newStringToSplit != null)
				msgs = ((InternalEObject)newStringToSplit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.SPLIT__STRING_TO_SPLIT, null, msgs);
			msgs = basicSetStringToSplit(newStringToSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.SPLIT__STRING_TO_SPLIT, newStringToSplit, newStringToSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeparator(Expression newSeparator, NotificationChain msgs) {
		Expression oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.SPLIT__SEPARATOR, oldSeparator, newSeparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(Expression newSeparator) {
		if (newSeparator != separator) {
			NotificationChain msgs = null;
			if (separator != null)
				msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.SPLIT__SEPARATOR, null, msgs);
			if (newSeparator != null)
				msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.SPLIT__SEPARATOR, null, msgs);
			msgs = basicSetSeparator(newSeparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.SPLIT__SEPARATOR, newSeparator, newSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.SPLIT__STRING_TO_SPLIT:
				return basicSetStringToSplit(null, msgs);
			case R1Package.SPLIT__SEPARATOR:
				return basicSetSeparator(null, msgs);
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
			case R1Package.SPLIT__STRING_TO_SPLIT:
				return getStringToSplit();
			case R1Package.SPLIT__SEPARATOR:
				return getSeparator();
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
			case R1Package.SPLIT__STRING_TO_SPLIT:
				setStringToSplit((Expression)newValue);
				return;
			case R1Package.SPLIT__SEPARATOR:
				setSeparator((Expression)newValue);
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
			case R1Package.SPLIT__STRING_TO_SPLIT:
				setStringToSplit((Expression)null);
				return;
			case R1Package.SPLIT__SEPARATOR:
				setSeparator((Expression)null);
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
			case R1Package.SPLIT__STRING_TO_SPLIT:
				return stringToSplit != null;
			case R1Package.SPLIT__SEPARATOR:
				return separator != null;
		}
		return super.eIsSet(featureID);
	}

} //SplitImpl
