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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.ProductPlanCategory;
import org.hl7.fhir.ProductPlanPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Plan Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanPlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanPlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanPlanImpl#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanPlanImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPlanPlanImpl extends BackboneElementImpl implements ProductPlanPlan {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getPremium() <em>Premium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremium()
	 * @generated
	 * @ordered
	 */
	protected Money premium;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPlanCategory> category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPlanPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProductPlanPlan();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPremium() {
		return premium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremium(Money newPremium, NotificationChain msgs) {
		Money oldPremium = premium;
		premium = newPremium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM, oldPremium, newPremium);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremium(Money newPremium) {
		if (newPremium != premium) {
			NotificationChain msgs = null;
			if (premium != null)
				msgs = ((InternalEObject)premium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM, null, msgs);
			if (newPremium != null)
				msgs = ((InternalEObject)newPremium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM, null, msgs);
			msgs = basicSetPremium(newPremium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM, newPremium, newPremium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPlanCategory> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<ProductPlanCategory>(ProductPlanCategory.class, this, FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRODUCT_PLAN_PLAN__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM:
				return basicSetPremium(null, msgs);
			case FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRODUCT_PLAN_PLAN__TYPE:
				return getType();
			case FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION:
				return getDescription();
			case FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM:
				return getPremium();
			case FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY:
				return getCategory();
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
			case FhirPackage.PRODUCT_PLAN_PLAN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM:
				setPremium((Money)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends ProductPlanCategory>)newValue);
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
			case FhirPackage.PRODUCT_PLAN_PLAN__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM:
				setPremium((Money)null);
				return;
			case FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY:
				getCategory().clear();
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
			case FhirPackage.PRODUCT_PLAN_PLAN__TYPE:
				return type != null;
			case FhirPackage.PRODUCT_PLAN_PLAN__DESCRIPTION:
				return description != null;
			case FhirPackage.PRODUCT_PLAN_PLAN__PREMIUM:
				return premium != null;
			case FhirPackage.PRODUCT_PLAN_PLAN__CATEGORY:
				return category != null && !category.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductPlanPlanImpl
