/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Is;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.IsImpl#getIsTypeSpecifier <em>Is Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.IsImpl#getIsType <em>Is Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsImpl extends UnaryExpressionImpl implements Is {
	/**
	 * The cached value of the '{@link #getIsTypeSpecifier() <em>Is Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier isTypeSpecifier;

	/**
	 * The default value of the '{@link #getIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsType()
	 * @generated
	 * @ordered
	 */
	protected static final QName IS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsType()
	 * @generated
	 * @ordered
	 */
	protected QName isType = IS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getIs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getIsTypeSpecifier() {
		return isTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsTypeSpecifier(TypeSpecifier newIsTypeSpecifier, NotificationChain msgs) {
		TypeSpecifier oldIsTypeSpecifier = isTypeSpecifier;
		isTypeSpecifier = newIsTypeSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.IS__IS_TYPE_SPECIFIER, oldIsTypeSpecifier, newIsTypeSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTypeSpecifier(TypeSpecifier newIsTypeSpecifier) {
		if (newIsTypeSpecifier != isTypeSpecifier) {
			NotificationChain msgs = null;
			if (isTypeSpecifier != null)
				msgs = ((InternalEObject)isTypeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.IS__IS_TYPE_SPECIFIER, null, msgs);
			if (newIsTypeSpecifier != null)
				msgs = ((InternalEObject)newIsTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.IS__IS_TYPE_SPECIFIER, null, msgs);
			msgs = basicSetIsTypeSpecifier(newIsTypeSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IS__IS_TYPE_SPECIFIER, newIsTypeSpecifier, newIsTypeSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getIsType() {
		return isType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsType(QName newIsType) {
		QName oldIsType = isType;
		isType = newIsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IS__IS_TYPE, oldIsType, isType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.IS__IS_TYPE_SPECIFIER:
				return basicSetIsTypeSpecifier(null, msgs);
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
			case R1Package.IS__IS_TYPE_SPECIFIER:
				return getIsTypeSpecifier();
			case R1Package.IS__IS_TYPE:
				return getIsType();
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
			case R1Package.IS__IS_TYPE_SPECIFIER:
				setIsTypeSpecifier((TypeSpecifier)newValue);
				return;
			case R1Package.IS__IS_TYPE:
				setIsType((QName)newValue);
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
			case R1Package.IS__IS_TYPE_SPECIFIER:
				setIsTypeSpecifier((TypeSpecifier)null);
				return;
			case R1Package.IS__IS_TYPE:
				setIsType(IS_TYPE_EDEFAULT);
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
			case R1Package.IS__IS_TYPE_SPECIFIER:
				return isTypeSpecifier != null;
			case R1Package.IS__IS_TYPE:
				return IS_TYPE_EDEFAULT == null ? isType != null : !IS_TYPE_EDEFAULT.equals(isType);
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
		result.append(" (isType: ");
		result.append(isType);
		result.append(')');
		return result.toString();
	}

} //IsImpl
