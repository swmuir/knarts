/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.AccessModifier;
import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.ParameterDef;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.ParameterDefImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ParameterDefImpl#getParameterTypeSpecifier <em>Parameter Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ParameterDefImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ParameterDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ParameterDefImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefImpl extends ElementImpl implements ParameterDef {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Expression default_;

	/**
	 * The cached value of the '{@link #getParameterTypeSpecifier() <em>Parameter Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier parameterTypeSpecifier;

	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_LEVEL_EDEFAULT = AccessModifier.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * This is true if the Access Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessLevelESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final QName PARAMETER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected QName parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getParameterDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs) {
		Expression oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Expression newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.PARAMETER_DEF__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.PARAMETER_DEF__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getParameterTypeSpecifier() {
		return parameterTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterTypeSpecifier(TypeSpecifier newParameterTypeSpecifier, NotificationChain msgs) {
		TypeSpecifier oldParameterTypeSpecifier = parameterTypeSpecifier;
		parameterTypeSpecifier = newParameterTypeSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER, oldParameterTypeSpecifier, newParameterTypeSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTypeSpecifier(TypeSpecifier newParameterTypeSpecifier) {
		if (newParameterTypeSpecifier != parameterTypeSpecifier) {
			NotificationChain msgs = null;
			if (parameterTypeSpecifier != null)
				msgs = ((InternalEObject)parameterTypeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER, null, msgs);
			if (newParameterTypeSpecifier != null)
				msgs = ((InternalEObject)newParameterTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER, null, msgs);
			msgs = basicSetParameterTypeSpecifier(newParameterTypeSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER, newParameterTypeSpecifier, newParameterTypeSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevel(AccessModifier newAccessLevel) {
		AccessModifier oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel == null ? ACCESS_LEVEL_EDEFAULT : newAccessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__ACCESS_LEVEL, oldAccessLevel, accessLevel, !oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessLevel() {
		AccessModifier oldAccessLevel = accessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevel = ACCESS_LEVEL_EDEFAULT;
		accessLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.PARAMETER_DEF__ACCESS_LEVEL, oldAccessLevel, ACCESS_LEVEL_EDEFAULT, oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessLevel() {
		return accessLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(QName newParameterType) {
		QName oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.PARAMETER_DEF__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.PARAMETER_DEF__DEFAULT:
				return basicSetDefault(null, msgs);
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER:
				return basicSetParameterTypeSpecifier(null, msgs);
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
			case R1Package.PARAMETER_DEF__DEFAULT:
				return getDefault();
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER:
				return getParameterTypeSpecifier();
			case R1Package.PARAMETER_DEF__ACCESS_LEVEL:
				return getAccessLevel();
			case R1Package.PARAMETER_DEF__NAME:
				return getName();
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE:
				return getParameterType();
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
			case R1Package.PARAMETER_DEF__DEFAULT:
				setDefault((Expression)newValue);
				return;
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER:
				setParameterTypeSpecifier((TypeSpecifier)newValue);
				return;
			case R1Package.PARAMETER_DEF__ACCESS_LEVEL:
				setAccessLevel((AccessModifier)newValue);
				return;
			case R1Package.PARAMETER_DEF__NAME:
				setName((String)newValue);
				return;
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE:
				setParameterType((QName)newValue);
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
			case R1Package.PARAMETER_DEF__DEFAULT:
				setDefault((Expression)null);
				return;
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER:
				setParameterTypeSpecifier((TypeSpecifier)null);
				return;
			case R1Package.PARAMETER_DEF__ACCESS_LEVEL:
				unsetAccessLevel();
				return;
			case R1Package.PARAMETER_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
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
			case R1Package.PARAMETER_DEF__DEFAULT:
				return default_ != null;
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER:
				return parameterTypeSpecifier != null;
			case R1Package.PARAMETER_DEF__ACCESS_LEVEL:
				return isSetAccessLevel();
			case R1Package.PARAMETER_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case R1Package.PARAMETER_DEF__PARAMETER_TYPE:
				return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null : !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
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
		result.append(" (accessLevel: ");
		if (accessLevelESet) result.append(accessLevel); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(')');
		return result.toString();
	}

} //ParameterDefImpl
