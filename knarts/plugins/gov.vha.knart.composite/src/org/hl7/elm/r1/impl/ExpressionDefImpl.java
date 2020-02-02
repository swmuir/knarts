/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.AccessModifier;
import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.ExpressionDef;
import org.hl7.elm.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.ExpressionDefImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ExpressionDefImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ExpressionDefImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ExpressionDefImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionDefImpl extends ElementImpl implements ExpressionDef {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

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
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getExpressionDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.EXPRESSION_DEF__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.EXPRESSION_DEF__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.EXPRESSION_DEF__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.EXPRESSION_DEF__EXPRESSION, newExpression, newExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.EXPRESSION_DEF__ACCESS_LEVEL, oldAccessLevel, accessLevel, !oldAccessLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.EXPRESSION_DEF__ACCESS_LEVEL, oldAccessLevel, ACCESS_LEVEL_EDEFAULT, oldAccessLevelESet));
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
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.EXPRESSION_DEF__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.EXPRESSION_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.EXPRESSION_DEF__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case R1Package.EXPRESSION_DEF__EXPRESSION:
				return getExpression();
			case R1Package.EXPRESSION_DEF__ACCESS_LEVEL:
				return getAccessLevel();
			case R1Package.EXPRESSION_DEF__CONTEXT:
				return getContext();
			case R1Package.EXPRESSION_DEF__NAME:
				return getName();
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
			case R1Package.EXPRESSION_DEF__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case R1Package.EXPRESSION_DEF__ACCESS_LEVEL:
				setAccessLevel((AccessModifier)newValue);
				return;
			case R1Package.EXPRESSION_DEF__CONTEXT:
				setContext((String)newValue);
				return;
			case R1Package.EXPRESSION_DEF__NAME:
				setName((String)newValue);
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
			case R1Package.EXPRESSION_DEF__EXPRESSION:
				setExpression((Expression)null);
				return;
			case R1Package.EXPRESSION_DEF__ACCESS_LEVEL:
				unsetAccessLevel();
				return;
			case R1Package.EXPRESSION_DEF__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case R1Package.EXPRESSION_DEF__NAME:
				setName(NAME_EDEFAULT);
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
			case R1Package.EXPRESSION_DEF__EXPRESSION:
				return expression != null;
			case R1Package.EXPRESSION_DEF__ACCESS_LEVEL:
				return isSetAccessLevel();
			case R1Package.EXPRESSION_DEF__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case R1Package.EXPRESSION_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", context: ");
		result.append(context);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExpressionDefImpl
