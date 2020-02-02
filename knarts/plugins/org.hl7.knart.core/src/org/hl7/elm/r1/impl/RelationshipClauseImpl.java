/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.RelationshipClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.RelationshipClauseImpl#getSuchThat <em>Such That</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipClauseImpl extends AliasedQuerySourceImpl implements RelationshipClause {
	/**
	 * The cached value of the '{@link #getSuchThat() <em>Such That</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuchThat()
	 * @generated
	 * @ordered
	 */
	protected Expression suchThat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getRelationshipClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSuchThat() {
		return suchThat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuchThat(Expression newSuchThat, NotificationChain msgs) {
		Expression oldSuchThat = suchThat;
		suchThat = newSuchThat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT, oldSuchThat, newSuchThat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuchThat(Expression newSuchThat) {
		if (newSuchThat != suchThat) {
			NotificationChain msgs = null;
			if (suchThat != null)
				msgs = ((InternalEObject)suchThat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT, null, msgs);
			if (newSuchThat != null)
				msgs = ((InternalEObject)newSuchThat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT, null, msgs);
			msgs = basicSetSuchThat(newSuchThat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT, newSuchThat, newSuchThat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT:
				return basicSetSuchThat(null, msgs);
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
			case R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT:
				return getSuchThat();
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
			case R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT:
				setSuchThat((Expression)newValue);
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
			case R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT:
				setSuchThat((Expression)null);
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
			case R1Package.RELATIONSHIP_CLAUSE__SUCH_THAT:
				return suchThat != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipClauseImpl
