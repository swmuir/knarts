/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProductPlanCost;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Plan Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanCostImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanCostImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanCostImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanCostImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPlanCostImpl extends BackboneElementImpl implements ProductPlanCost {
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
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> applicability;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> qualifiers;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPlanCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProductPlanCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_COST__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_COST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_COST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_COST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getApplicability() {
		if (applicability == null) {
			applicability = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY);
		}
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Quantity newValue, NotificationChain msgs) {
		Quantity oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_COST__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Quantity newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_COST__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_COST__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_COST__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRODUCT_PLAN_COST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY:
				return ((InternalEList<?>)getApplicability()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS:
				return ((InternalEList<?>)getQualifiers()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRODUCT_PLAN_COST__VALUE:
				return basicSetValue(null, msgs);
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
			case FhirPackage.PRODUCT_PLAN_COST__TYPE:
				return getType();
			case FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY:
				return getApplicability();
			case FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS:
				return getQualifiers();
			case FhirPackage.PRODUCT_PLAN_COST__VALUE:
				return getValue();
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
			case FhirPackage.PRODUCT_PLAN_COST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY:
				getApplicability().clear();
				getApplicability().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_COST__VALUE:
				setValue((Quantity)newValue);
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
			case FhirPackage.PRODUCT_PLAN_COST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY:
				getApplicability().clear();
				return;
			case FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS:
				getQualifiers().clear();
				return;
			case FhirPackage.PRODUCT_PLAN_COST__VALUE:
				setValue((Quantity)null);
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
			case FhirPackage.PRODUCT_PLAN_COST__TYPE:
				return type != null;
			case FhirPackage.PRODUCT_PLAN_COST__APPLICABILITY:
				return applicability != null && !applicability.isEmpty();
			case FhirPackage.PRODUCT_PLAN_COST__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
			case FhirPackage.PRODUCT_PLAN_COST__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductPlanCostImpl
