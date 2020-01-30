/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.GoalTarget;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.GoalTargetImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalTargetImpl#getDetailx <em>Detailx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalTargetImpl#getDuex <em>Duex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalTargetImpl extends BackboneElementImpl implements GoalTarget {
	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept measure;

	/**
	 * The cached value of the '{@link #getDetailx() <em>Detailx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailx()
	 * @generated
	 * @ordered
	 */
	protected DataType detailx;

	/**
	 * The cached value of the '{@link #getDuex() <em>Duex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuex()
	 * @generated
	 * @ordered
	 */
	protected DataType duex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGoalTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(CodeableConcept newMeasure, NotificationChain msgs) {
		CodeableConcept oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(CodeableConcept newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDetailx() {
		return detailx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailx(DataType newDetailx, NotificationChain msgs) {
		DataType oldDetailx = detailx;
		detailx = newDetailx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__DETAILX, oldDetailx, newDetailx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailx(DataType newDetailx) {
		if (newDetailx != detailx) {
			NotificationChain msgs = null;
			if (detailx != null)
				msgs = ((InternalEObject)detailx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__DETAILX, null, msgs);
			if (newDetailx != null)
				msgs = ((InternalEObject)newDetailx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__DETAILX, null, msgs);
			msgs = basicSetDetailx(newDetailx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__DETAILX, newDetailx, newDetailx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDuex() {
		return duex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuex(DataType newDuex, NotificationChain msgs) {
		DataType oldDuex = duex;
		duex = newDuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__DUEX, oldDuex, newDuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuex(DataType newDuex) {
		if (newDuex != duex) {
			NotificationChain msgs = null;
			if (duex != null)
				msgs = ((InternalEObject)duex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__DUEX, null, msgs);
			if (newDuex != null)
				msgs = ((InternalEObject)newDuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL_TARGET__DUEX, null, msgs);
			msgs = basicSetDuex(newDuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL_TARGET__DUEX, newDuex, newDuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GOAL_TARGET__MEASURE:
				return basicSetMeasure(null, msgs);
			case ResourcesPackage.GOAL_TARGET__DETAILX:
				return basicSetDetailx(null, msgs);
			case ResourcesPackage.GOAL_TARGET__DUEX:
				return basicSetDuex(null, msgs);
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
			case ResourcesPackage.GOAL_TARGET__MEASURE:
				return getMeasure();
			case ResourcesPackage.GOAL_TARGET__DETAILX:
				return getDetailx();
			case ResourcesPackage.GOAL_TARGET__DUEX:
				return getDuex();
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
			case ResourcesPackage.GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL_TARGET__DETAILX:
				setDetailx((DataType)newValue);
				return;
			case ResourcesPackage.GOAL_TARGET__DUEX:
				setDuex((DataType)newValue);
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
			case ResourcesPackage.GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL_TARGET__DETAILX:
				setDetailx((DataType)null);
				return;
			case ResourcesPackage.GOAL_TARGET__DUEX:
				setDuex((DataType)null);
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
			case ResourcesPackage.GOAL_TARGET__MEASURE:
				return measure != null;
			case ResourcesPackage.GOAL_TARGET__DETAILX:
				return detailx != null;
			case ResourcesPackage.GOAL_TARGET__DUEX:
				return duex != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalTargetImpl
