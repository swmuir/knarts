/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Convert;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.ConvertImpl#getToTypeSpecifier <em>To Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ConvertImpl#getToType <em>To Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvertImpl extends UnaryExpressionImpl implements Convert {
	/**
	 * The cached value of the '{@link #getToTypeSpecifier() <em>To Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier toTypeSpecifier;

	/**
	 * The default value of the '{@link #getToType() <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToType()
	 * @generated
	 * @ordered
	 */
	protected static final QName TO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToType() <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToType()
	 * @generated
	 * @ordered
	 */
	protected QName toType = TO_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getConvert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getToTypeSpecifier() {
		return toTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToTypeSpecifier(TypeSpecifier newToTypeSpecifier, NotificationChain msgs) {
		TypeSpecifier oldToTypeSpecifier = toTypeSpecifier;
		toTypeSpecifier = newToTypeSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CONVERT__TO_TYPE_SPECIFIER, oldToTypeSpecifier, newToTypeSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTypeSpecifier(TypeSpecifier newToTypeSpecifier) {
		if (newToTypeSpecifier != toTypeSpecifier) {
			NotificationChain msgs = null;
			if (toTypeSpecifier != null)
				msgs = ((InternalEObject)toTypeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CONVERT__TO_TYPE_SPECIFIER, null, msgs);
			if (newToTypeSpecifier != null)
				msgs = ((InternalEObject)newToTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CONVERT__TO_TYPE_SPECIFIER, null, msgs);
			msgs = basicSetToTypeSpecifier(newToTypeSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CONVERT__TO_TYPE_SPECIFIER, newToTypeSpecifier, newToTypeSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getToType() {
		return toType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToType(QName newToType) {
		QName oldToType = toType;
		toType = newToType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CONVERT__TO_TYPE, oldToType, toType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.CONVERT__TO_TYPE_SPECIFIER:
				return basicSetToTypeSpecifier(null, msgs);
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
			case R1Package.CONVERT__TO_TYPE_SPECIFIER:
				return getToTypeSpecifier();
			case R1Package.CONVERT__TO_TYPE:
				return getToType();
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
			case R1Package.CONVERT__TO_TYPE_SPECIFIER:
				setToTypeSpecifier((TypeSpecifier)newValue);
				return;
			case R1Package.CONVERT__TO_TYPE:
				setToType((QName)newValue);
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
			case R1Package.CONVERT__TO_TYPE_SPECIFIER:
				setToTypeSpecifier((TypeSpecifier)null);
				return;
			case R1Package.CONVERT__TO_TYPE:
				setToType(TO_TYPE_EDEFAULT);
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
			case R1Package.CONVERT__TO_TYPE_SPECIFIER:
				return toTypeSpecifier != null;
			case R1Package.CONVERT__TO_TYPE:
				return TO_TYPE_EDEFAULT == null ? toType != null : !TO_TYPE_EDEFAULT.equals(toType);
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
		result.append(" (toType: ");
		result.append(toType);
		result.append(')');
		return result.toString();
	}

} //ConvertImpl
