/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.Substring;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.SubstringImpl#getStringToSub <em>String To Sub</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.SubstringImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.SubstringImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstringImpl extends ExpressionImpl implements Substring {
	/**
	 * The cached value of the '{@link #getStringToSub() <em>String To Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringToSub()
	 * @generated
	 * @ordered
	 */
	protected EObject stringToSub;

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected EObject startIndex;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected EObject length;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getSubstring();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStringToSub() {
		return stringToSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringToSub(EObject newStringToSub, NotificationChain msgs) {
		EObject oldStringToSub = stringToSub;
		stringToSub = newStringToSub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__STRING_TO_SUB, oldStringToSub, newStringToSub);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringToSub(EObject newStringToSub) {
		if (newStringToSub != stringToSub) {
			NotificationChain msgs = null;
			if (stringToSub != null)
				msgs = ((InternalEObject)stringToSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__STRING_TO_SUB, null, msgs);
			if (newStringToSub != null)
				msgs = ((InternalEObject)newStringToSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__STRING_TO_SUB, null, msgs);
			msgs = basicSetStringToSub(newStringToSub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__STRING_TO_SUB, newStringToSub, newStringToSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartIndex(EObject newStartIndex, NotificationChain msgs) {
		EObject oldStartIndex = startIndex;
		startIndex = newStartIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__START_INDEX, oldStartIndex, newStartIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(EObject newStartIndex) {
		if (newStartIndex != startIndex) {
			NotificationChain msgs = null;
			if (startIndex != null)
				msgs = ((InternalEObject)startIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__START_INDEX, null, msgs);
			if (newStartIndex != null)
				msgs = ((InternalEObject)newStartIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__START_INDEX, null, msgs);
			msgs = basicSetStartIndex(newStartIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__START_INDEX, newStartIndex, newStartIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(EObject newLength, NotificationChain msgs) {
		EObject oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(EObject newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.SUBSTRING__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.SUBSTRING__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.SUBSTRING__STRING_TO_SUB:
				return basicSetStringToSub(null, msgs);
			case R1Package.SUBSTRING__START_INDEX:
				return basicSetStartIndex(null, msgs);
			case R1Package.SUBSTRING__LENGTH:
				return basicSetLength(null, msgs);
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
			case R1Package.SUBSTRING__STRING_TO_SUB:
				return getStringToSub();
			case R1Package.SUBSTRING__START_INDEX:
				return getStartIndex();
			case R1Package.SUBSTRING__LENGTH:
				return getLength();
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
			case R1Package.SUBSTRING__STRING_TO_SUB:
				setStringToSub((EObject)newValue);
				return;
			case R1Package.SUBSTRING__START_INDEX:
				setStartIndex((EObject)newValue);
				return;
			case R1Package.SUBSTRING__LENGTH:
				setLength((EObject)newValue);
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
			case R1Package.SUBSTRING__STRING_TO_SUB:
				setStringToSub((EObject)null);
				return;
			case R1Package.SUBSTRING__START_INDEX:
				setStartIndex((EObject)null);
				return;
			case R1Package.SUBSTRING__LENGTH:
				setLength((EObject)null);
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
			case R1Package.SUBSTRING__STRING_TO_SUB:
				return stringToSub != null;
			case R1Package.SUBSTRING__START_INDEX:
				return startIndex != null;
			case R1Package.SUBSTRING__LENGTH:
				return length != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstringImpl
