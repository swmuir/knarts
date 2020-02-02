/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.OperandDef;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.OperandDefImpl#getOperandTypeSpecifier <em>Operand Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.OperandDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.OperandDefImpl#getOperandType <em>Operand Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandDefImpl extends ElementImpl implements OperandDef {
	/**
	 * The cached value of the '{@link #getOperandTypeSpecifier() <em>Operand Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandTypeSpecifier()
	 * @generated
	 * @ordered
	 */
	protected TypeSpecifier operandTypeSpecifier;

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
	 * The default value of the '{@link #getOperandType() <em>Operand Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandType()
	 * @generated
	 * @ordered
	 */
	protected static final QName OPERAND_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperandType() <em>Operand Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandType()
	 * @generated
	 * @ordered
	 */
	protected QName operandType = OPERAND_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getOperandDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecifier getOperandTypeSpecifier() {
		return operandTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandTypeSpecifier(TypeSpecifier newOperandTypeSpecifier, NotificationChain msgs) {
		TypeSpecifier oldOperandTypeSpecifier = operandTypeSpecifier;
		operandTypeSpecifier = newOperandTypeSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER, oldOperandTypeSpecifier, newOperandTypeSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandTypeSpecifier(TypeSpecifier newOperandTypeSpecifier) {
		if (newOperandTypeSpecifier != operandTypeSpecifier) {
			NotificationChain msgs = null;
			if (operandTypeSpecifier != null)
				msgs = ((InternalEObject)operandTypeSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER, null, msgs);
			if (newOperandTypeSpecifier != null)
				msgs = ((InternalEObject)newOperandTypeSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER, null, msgs);
			msgs = basicSetOperandTypeSpecifier(newOperandTypeSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER, newOperandTypeSpecifier, newOperandTypeSpecifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.OPERAND_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getOperandType() {
		return operandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandType(QName newOperandType) {
		QName oldOperandType = operandType;
		operandType = newOperandType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.OPERAND_DEF__OPERAND_TYPE, oldOperandType, operandType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER:
				return basicSetOperandTypeSpecifier(null, msgs);
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
			case R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER:
				return getOperandTypeSpecifier();
			case R1Package.OPERAND_DEF__NAME:
				return getName();
			case R1Package.OPERAND_DEF__OPERAND_TYPE:
				return getOperandType();
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
			case R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER:
				setOperandTypeSpecifier((TypeSpecifier)newValue);
				return;
			case R1Package.OPERAND_DEF__NAME:
				setName((String)newValue);
				return;
			case R1Package.OPERAND_DEF__OPERAND_TYPE:
				setOperandType((QName)newValue);
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
			case R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER:
				setOperandTypeSpecifier((TypeSpecifier)null);
				return;
			case R1Package.OPERAND_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case R1Package.OPERAND_DEF__OPERAND_TYPE:
				setOperandType(OPERAND_TYPE_EDEFAULT);
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
			case R1Package.OPERAND_DEF__OPERAND_TYPE_SPECIFIER:
				return operandTypeSpecifier != null;
			case R1Package.OPERAND_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case R1Package.OPERAND_DEF__OPERAND_TYPE:
				return OPERAND_TYPE_EDEFAULT == null ? operandType != null : !OPERAND_TYPE_EDEFAULT.equals(operandType);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", operandType: ");
		result.append(operandType);
		result.append(')');
		return result.toString();
	}

} //OperandDefImpl
