/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.As;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.AsImpl#getAsTypeSpecifier <em>As Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.AsImpl#getAsType <em>As Type</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.AsImpl#isStrict <em>Strict</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsImpl extends UnaryExpressionImpl implements As {
	/**
	 * The cached value of the '{@link #getAsTypeSpecifier() <em>As Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier asTypeSpecifier;

	/**
	 * The default value of the '{@link #getAsType() <em>As Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsType()
	 * @generated
	 * @ordered
	 */
	protected static final QName AS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsType() <em>As Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsType()
	 * @generated
	 * @ordered
	 */
	protected QName asType = AS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * This is true if the Strict attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strictESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getAs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getAsTypeSpecifier() {
		return asTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsTypeSpecifier(TypeSpecifier newAsTypeSpecifier, NotificationChain msgs) {
		TypeSpecifier oldAsTypeSpecifier = asTypeSpecifier;
		asTypeSpecifier = newAsTypeSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.AS__AS_TYPE_SPECIFIER, oldAsTypeSpecifier, newAsTypeSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsTypeSpecifier(TypeSpecifier newAsTypeSpecifier) {
		if (newAsTypeSpecifier != asTypeSpecifier) {
			NotificationChain msgs = null;
			if (asTypeSpecifier != null)
				msgs = ((InternalEObject)asTypeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.AS__AS_TYPE_SPECIFIER, null, msgs);
			if (newAsTypeSpecifier != null)
				msgs = ((InternalEObject)newAsTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.AS__AS_TYPE_SPECIFIER, null, msgs);
			msgs = basicSetAsTypeSpecifier(newAsTypeSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.AS__AS_TYPE_SPECIFIER, newAsTypeSpecifier, newAsTypeSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getAsType() {
		return asType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsType(QName newAsType) {
		QName oldAsType = asType;
		asType = newAsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.AS__AS_TYPE, oldAsType, asType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		boolean oldStrictESet = strictESet;
		strictESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.AS__STRICT, oldStrict, strict, !oldStrictESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrict() {
		boolean oldStrict = strict;
		boolean oldStrictESet = strictESet;
		strict = STRICT_EDEFAULT;
		strictESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.AS__STRICT, oldStrict, STRICT_EDEFAULT, oldStrictESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrict() {
		return strictESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.AS__AS_TYPE_SPECIFIER:
				return basicSetAsTypeSpecifier(null, msgs);
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
			case R1Package.AS__AS_TYPE_SPECIFIER:
				return getAsTypeSpecifier();
			case R1Package.AS__AS_TYPE:
				return getAsType();
			case R1Package.AS__STRICT:
				return isStrict();
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
			case R1Package.AS__AS_TYPE_SPECIFIER:
				setAsTypeSpecifier((TypeSpecifier)newValue);
				return;
			case R1Package.AS__AS_TYPE:
				setAsType((QName)newValue);
				return;
			case R1Package.AS__STRICT:
				setStrict((Boolean)newValue);
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
			case R1Package.AS__AS_TYPE_SPECIFIER:
				setAsTypeSpecifier((TypeSpecifier)null);
				return;
			case R1Package.AS__AS_TYPE:
				setAsType(AS_TYPE_EDEFAULT);
				return;
			case R1Package.AS__STRICT:
				unsetStrict();
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
			case R1Package.AS__AS_TYPE_SPECIFIER:
				return asTypeSpecifier != null;
			case R1Package.AS__AS_TYPE:
				return AS_TYPE_EDEFAULT == null ? asType != null : !AS_TYPE_EDEFAULT.equals(asType);
			case R1Package.AS__STRICT:
				return isSetStrict();
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
		result.append(" (asType: ");
		result.append(asType);
		result.append(", strict: ");
		if (strictESet) result.append(strict); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AsImpl
