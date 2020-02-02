/**
 */
package org.hl7.elm.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.Case;
import org.hl7.elm.r1.CaseItem;
import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.CaseImpl#getComparand <em>Comparand</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.CaseImpl#getCaseItem <em>Case Item</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.CaseImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends ExpressionImpl implements Case {
	/**
	 * The cached value of the '{@link #getComparand() <em>Comparand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparand()
	 * @generated
	 * @ordered
	 */
	protected Expression comparand;

	/**
	 * The cached value of the '{@link #getCaseItem() <em>Case Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseItem()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseItem> caseItem;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Expression else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getComparand() {
		return comparand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparand(Expression newComparand, NotificationChain msgs) {
		Expression oldComparand = comparand;
		comparand = newComparand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CASE__COMPARAND, oldComparand, newComparand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparand(Expression newComparand) {
		if (newComparand != comparand) {
			NotificationChain msgs = null;
			if (comparand != null)
				msgs = ((InternalEObject)comparand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CASE__COMPARAND, null, msgs);
			if (newComparand != null)
				msgs = ((InternalEObject)newComparand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CASE__COMPARAND, null, msgs);
			msgs = basicSetComparand(newComparand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CASE__COMPARAND, newComparand, newComparand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseItem> getCaseItem() {
		if (caseItem == null) {
			caseItem = new EObjectContainmentEList<CaseItem>(CaseItem.class, this, R1Package.CASE__CASE_ITEM);
		}
		return caseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Expression newElse, NotificationChain msgs) {
		Expression oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CASE__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Expression newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CASE__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CASE__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CASE__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.CASE__COMPARAND:
				return basicSetComparand(null, msgs);
			case R1Package.CASE__CASE_ITEM:
				return ((InternalEList<?>)getCaseItem()).basicRemove(otherEnd, msgs);
			case R1Package.CASE__ELSE:
				return basicSetElse(null, msgs);
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
			case R1Package.CASE__COMPARAND:
				return getComparand();
			case R1Package.CASE__CASE_ITEM:
				return getCaseItem();
			case R1Package.CASE__ELSE:
				return getElse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R1Package.CASE__COMPARAND:
				setComparand((Expression)newValue);
				return;
			case R1Package.CASE__CASE_ITEM:
				getCaseItem().clear();
				getCaseItem().addAll((Collection<? extends CaseItem>)newValue);
				return;
			case R1Package.CASE__ELSE:
				setElse((Expression)newValue);
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
			case R1Package.CASE__COMPARAND:
				setComparand((Expression)null);
				return;
			case R1Package.CASE__CASE_ITEM:
				getCaseItem().clear();
				return;
			case R1Package.CASE__ELSE:
				setElse((Expression)null);
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
			case R1Package.CASE__COMPARAND:
				return comparand != null;
			case R1Package.CASE__CASE_ITEM:
				return caseItem != null && !caseItem.isEmpty();
			case R1Package.CASE__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseImpl
