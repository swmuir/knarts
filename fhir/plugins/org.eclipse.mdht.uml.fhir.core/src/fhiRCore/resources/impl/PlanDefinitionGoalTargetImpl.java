/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.PlanDefinitionGoalTarget;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Goal Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.PlanDefinitionGoalTargetImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PlanDefinitionGoalTargetImpl#getDetailx <em>Detailx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PlanDefinitionGoalTargetImpl#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionGoalTargetImpl extends BackboneElementImpl implements PlanDefinitionGoalTarget {
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
	 * The cached value of the '{@link #getDue() <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue()
	 * @generated
	 * @ordered
	 */
	protected Duration due;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionGoalTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPlanDefinitionGoalTarget();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE, oldMeasure, newMeasure);
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
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE, newMeasure, newMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX, oldDetailx, newDetailx);
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
				msgs = ((InternalEObject)detailx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX, null, msgs);
			if (newDetailx != null)
				msgs = ((InternalEObject)newDetailx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX, null, msgs);
			msgs = basicSetDetailx(newDetailx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX, newDetailx, newDetailx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDue() {
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDue(Duration newDue, NotificationChain msgs) {
		Duration oldDue = due;
		due = newDue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE, oldDue, newDue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDue(Duration newDue) {
		if (newDue != due) {
			NotificationChain msgs = null;
			if (due != null)
				msgs = ((InternalEObject)due).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE, null, msgs);
			if (newDue != null)
				msgs = ((InternalEObject)newDue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE, null, msgs);
			msgs = basicSetDue(newDue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE, newDue, newDue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE:
				return basicSetMeasure(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX:
				return basicSetDetailx(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE:
				return basicSetDue(null, msgs);
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE:
				return getMeasure();
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX:
				return getDetailx();
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE:
				return getDue();
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX:
				setDetailx((DataType)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE:
				setDue((Duration)newValue);
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX:
				setDetailx((DataType)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE:
				setDue((Duration)null);
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__MEASURE:
				return measure != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DETAILX:
				return detailx != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET__DUE:
				return due != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionGoalTargetImpl
