/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r2.CreateAction;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CreateActionImpl#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateActionImpl extends AtomicActionImpl implements CreateAction {
	/**
	 * The cached value of the '{@link #getActionSentence() <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSentence()
	 * @generated
	 * @ordered
	 */
	protected Expression actionSentence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getCreateAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActionSentence() {
		return actionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionSentence(Expression newActionSentence, NotificationChain msgs) {
		Expression oldActionSentence = actionSentence;
		actionSentence = newActionSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CREATE_ACTION__ACTION_SENTENCE, oldActionSentence, newActionSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSentence(Expression newActionSentence) {
		if (newActionSentence != actionSentence) {
			NotificationChain msgs = null;
			if (actionSentence != null)
				msgs = ((InternalEObject)actionSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CREATE_ACTION__ACTION_SENTENCE, null, msgs);
			if (newActionSentence != null)
				msgs = ((InternalEObject)newActionSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CREATE_ACTION__ACTION_SENTENCE, null, msgs);
			msgs = basicSetActionSentence(newActionSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CREATE_ACTION__ACTION_SENTENCE, newActionSentence, newActionSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CREATE_ACTION__ACTION_SENTENCE:
				return basicSetActionSentence(null, msgs);
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
			case R2Package.CREATE_ACTION__ACTION_SENTENCE:
				return getActionSentence();
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
			case R2Package.CREATE_ACTION__ACTION_SENTENCE:
				setActionSentence((Expression)newValue);
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
			case R2Package.CREATE_ACTION__ACTION_SENTENCE:
				setActionSentence((Expression)null);
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
			case R2Package.CREATE_ACTION__ACTION_SENTENCE:
				return actionSentence != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateActionImpl
