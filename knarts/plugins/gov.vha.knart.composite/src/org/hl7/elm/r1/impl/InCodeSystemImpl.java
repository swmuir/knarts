/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.CodeSystemRef;
import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.InCodeSystem;
import org.hl7.elm.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.InCodeSystemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.InCodeSystemImpl#getCodesystem <em>Codesystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InCodeSystemImpl extends ExpressionImpl implements InCodeSystem {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Expression code;

	/**
	 * The cached value of the '{@link #getCodesystem() <em>Codesystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodesystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemRef codesystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getInCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Expression newCode, NotificationChain msgs) {
		Expression oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.IN_CODE_SYSTEM__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Expression newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_CODE_SYSTEM__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_CODE_SYSTEM__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IN_CODE_SYSTEM__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemRef getCodesystem() {
		return codesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodesystem(CodeSystemRef newCodesystem, NotificationChain msgs) {
		CodeSystemRef oldCodesystem = codesystem;
		codesystem = newCodesystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.IN_CODE_SYSTEM__CODESYSTEM, oldCodesystem, newCodesystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodesystem(CodeSystemRef newCodesystem) {
		if (newCodesystem != codesystem) {
			NotificationChain msgs = null;
			if (codesystem != null)
				msgs = ((InternalEObject)codesystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_CODE_SYSTEM__CODESYSTEM, null, msgs);
			if (newCodesystem != null)
				msgs = ((InternalEObject)newCodesystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.IN_CODE_SYSTEM__CODESYSTEM, null, msgs);
			msgs = basicSetCodesystem(newCodesystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.IN_CODE_SYSTEM__CODESYSTEM, newCodesystem, newCodesystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.IN_CODE_SYSTEM__CODE:
				return basicSetCode(null, msgs);
			case R1Package.IN_CODE_SYSTEM__CODESYSTEM:
				return basicSetCodesystem(null, msgs);
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
			case R1Package.IN_CODE_SYSTEM__CODE:
				return getCode();
			case R1Package.IN_CODE_SYSTEM__CODESYSTEM:
				return getCodesystem();
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
			case R1Package.IN_CODE_SYSTEM__CODE:
				setCode((Expression)newValue);
				return;
			case R1Package.IN_CODE_SYSTEM__CODESYSTEM:
				setCodesystem((CodeSystemRef)newValue);
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
			case R1Package.IN_CODE_SYSTEM__CODE:
				setCode((Expression)null);
				return;
			case R1Package.IN_CODE_SYSTEM__CODESYSTEM:
				setCodesystem((CodeSystemRef)null);
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
			case R1Package.IN_CODE_SYSTEM__CODE:
				return code != null;
			case R1Package.IN_CODE_SYSTEM__CODESYSTEM:
				return codesystem != null;
		}
		return super.eIsSet(featureID);
	}

} //InCodeSystemImpl
