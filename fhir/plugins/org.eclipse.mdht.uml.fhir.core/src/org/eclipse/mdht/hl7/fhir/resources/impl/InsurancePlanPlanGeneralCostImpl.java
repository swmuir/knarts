/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.InsurancePlanPlanGeneralCost;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Plan General Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanGeneralCostImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanGeneralCostImpl#getGroupSize <em>Group Size</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanGeneralCostImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanGeneralCostImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanPlanGeneralCostImpl extends BackboneElementImpl implements InsurancePlanPlanGeneralCost {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getGroupSize() <em>Group Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupSize()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt groupSize;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Money cost;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanPlanGeneralCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlanPlanGeneralCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getGroupSize() {
		return groupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupSize(PositiveInt newGroupSize, NotificationChain msgs) {
		PositiveInt oldGroupSize = groupSize;
		groupSize = newGroupSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE, oldGroupSize, newGroupSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupSize(PositiveInt newGroupSize) {
		if (newGroupSize != groupSize) {
			NotificationChain msgs = null;
			if (groupSize != null)
				msgs = ((InternalEObject)groupSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE, null, msgs);
			if (newGroupSize != null)
				msgs = ((InternalEObject)newGroupSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE, null, msgs);
			msgs = basicSetGroupSize(newGroupSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE, newGroupSize, newGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCost(Money newCost, NotificationChain msgs) {
		Money oldCost = cost;
		cost = newCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST, oldCost, newCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(Money newCost) {
		if (newCost != cost) {
			NotificationChain msgs = null;
			if (cost != null)
				msgs = ((InternalEObject)cost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST, null, msgs);
			if (newCost != null)
				msgs = ((InternalEObject)newCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST, null, msgs);
			msgs = basicSetCost(newCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST, newCost, newCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE:
				return basicSetGroupSize(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST:
				return basicSetCost(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT:
				return basicSetComment(null, msgs);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE:
				return getType();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE:
				return getGroupSize();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST:
				return getCost();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT:
				return getComment();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE:
				setGroupSize((PositiveInt)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST:
				setCost((Money)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE:
				setGroupSize((PositiveInt)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST:
				setCost((Money)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__TYPE:
				return type != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__GROUP_SIZE:
				return groupSize != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COST:
				return cost != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanPlanGeneralCostImpl
