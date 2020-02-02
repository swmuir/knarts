/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r2.Condition;
import org.hl7.knowledgeartifact.r2.ConditionRoleType1;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ConditionImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ConditionImpl#getConditionRole <em>Condition Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected Expression logic;

	/**
	 * The cached value of the '{@link #getConditionRole() <em>Condition Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionRole()
	 * @generated
	 * @ordered
	 */
	protected ConditionRoleType1 conditionRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogic(Expression newLogic, NotificationChain msgs) {
		Expression oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONDITION__LOGIC, oldLogic, newLogic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(Expression newLogic) {
		if (newLogic != logic) {
			NotificationChain msgs = null;
			if (logic != null)
				msgs = ((InternalEObject)logic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONDITION__LOGIC, null, msgs);
			if (newLogic != null)
				msgs = ((InternalEObject)newLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONDITION__LOGIC, null, msgs);
			msgs = basicSetLogic(newLogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONDITION__LOGIC, newLogic, newLogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRoleType1 getConditionRole() {
		return conditionRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionRole(ConditionRoleType1 newConditionRole, NotificationChain msgs) {
		ConditionRoleType1 oldConditionRole = conditionRole;
		conditionRole = newConditionRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONDITION__CONDITION_ROLE, oldConditionRole, newConditionRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionRole(ConditionRoleType1 newConditionRole) {
		if (newConditionRole != conditionRole) {
			NotificationChain msgs = null;
			if (conditionRole != null)
				msgs = ((InternalEObject)conditionRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONDITION__CONDITION_ROLE, null, msgs);
			if (newConditionRole != null)
				msgs = ((InternalEObject)newConditionRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONDITION__CONDITION_ROLE, null, msgs);
			msgs = basicSetConditionRole(newConditionRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONDITION__CONDITION_ROLE, newConditionRole, newConditionRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CONDITION__LOGIC:
				return basicSetLogic(null, msgs);
			case R2Package.CONDITION__CONDITION_ROLE:
				return basicSetConditionRole(null, msgs);
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
			case R2Package.CONDITION__LOGIC:
				return getLogic();
			case R2Package.CONDITION__CONDITION_ROLE:
				return getConditionRole();
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
			case R2Package.CONDITION__LOGIC:
				setLogic((Expression)newValue);
				return;
			case R2Package.CONDITION__CONDITION_ROLE:
				setConditionRole((ConditionRoleType1)newValue);
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
			case R2Package.CONDITION__LOGIC:
				setLogic((Expression)null);
				return;
			case R2Package.CONDITION__CONDITION_ROLE:
				setConditionRole((ConditionRoleType1)null);
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
			case R2Package.CONDITION__LOGIC:
				return logic != null;
			case R2Package.CONDITION__CONDITION_ROLE:
				return conditionRole != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
