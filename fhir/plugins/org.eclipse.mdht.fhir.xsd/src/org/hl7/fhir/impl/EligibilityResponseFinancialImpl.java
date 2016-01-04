/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Financial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitQuantity <em>Benefit Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUsedQuantity <em>Benefit Used Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityResponseFinancialImpl extends BackboneElementImpl implements EligibilityResponseFinancial {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getBenefitUnsignedInt() <em>Benefit Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt benefitUnsignedInt;

	/**
	 * The cached value of the '{@link #getBenefitQuantity() <em>Benefit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitQuantity()
	 * @generated
	 * @ordered
	 */
	protected Money benefitQuantity;

	/**
	 * The cached value of the '{@link #getBenefitUsedUnsignedInt() <em>Benefit Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt benefitUsedUnsignedInt;

	/**
	 * The cached value of the '{@link #getBenefitUsedQuantity() <em>Benefit Used Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedQuantity()
	 * @generated
	 * @ordered
	 */
	protected Money benefitUsedQuantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseFinancialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponseFinancial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getBenefitUnsignedInt() {
		return benefitUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUnsignedInt(UnsignedInt newBenefitUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldBenefitUnsignedInt = benefitUnsignedInt;
		benefitUnsignedInt = newBenefitUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, oldBenefitUnsignedInt, newBenefitUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUnsignedInt(UnsignedInt newBenefitUnsignedInt) {
		if (newBenefitUnsignedInt != benefitUnsignedInt) {
			NotificationChain msgs = null;
			if (benefitUnsignedInt != null)
				msgs = ((InternalEObject)benefitUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, null, msgs);
			if (newBenefitUnsignedInt != null)
				msgs = ((InternalEObject)newBenefitUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, null, msgs);
			msgs = basicSetBenefitUnsignedInt(newBenefitUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, newBenefitUnsignedInt, newBenefitUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBenefitQuantity() {
		return benefitQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitQuantity(Money newBenefitQuantity, NotificationChain msgs) {
		Money oldBenefitQuantity = benefitQuantity;
		benefitQuantity = newBenefitQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY, oldBenefitQuantity, newBenefitQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitQuantity(Money newBenefitQuantity) {
		if (newBenefitQuantity != benefitQuantity) {
			NotificationChain msgs = null;
			if (benefitQuantity != null)
				msgs = ((InternalEObject)benefitQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY, null, msgs);
			if (newBenefitQuantity != null)
				msgs = ((InternalEObject)newBenefitQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY, null, msgs);
			msgs = basicSetBenefitQuantity(newBenefitQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY, newBenefitQuantity, newBenefitQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getBenefitUsedUnsignedInt() {
		return benefitUsedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUsedUnsignedInt(UnsignedInt newBenefitUsedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldBenefitUsedUnsignedInt = benefitUsedUnsignedInt;
		benefitUsedUnsignedInt = newBenefitUsedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, oldBenefitUsedUnsignedInt, newBenefitUsedUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedUnsignedInt(UnsignedInt newBenefitUsedUnsignedInt) {
		if (newBenefitUsedUnsignedInt != benefitUsedUnsignedInt) {
			NotificationChain msgs = null;
			if (benefitUsedUnsignedInt != null)
				msgs = ((InternalEObject)benefitUsedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, null, msgs);
			if (newBenefitUsedUnsignedInt != null)
				msgs = ((InternalEObject)newBenefitUsedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, null, msgs);
			msgs = basicSetBenefitUsedUnsignedInt(newBenefitUsedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, newBenefitUsedUnsignedInt, newBenefitUsedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBenefitUsedQuantity() {
		return benefitUsedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUsedQuantity(Money newBenefitUsedQuantity, NotificationChain msgs) {
		Money oldBenefitUsedQuantity = benefitUsedQuantity;
		benefitUsedQuantity = newBenefitUsedQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY, oldBenefitUsedQuantity, newBenefitUsedQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedQuantity(Money newBenefitUsedQuantity) {
		if (newBenefitUsedQuantity != benefitUsedQuantity) {
			NotificationChain msgs = null;
			if (benefitUsedQuantity != null)
				msgs = ((InternalEObject)benefitUsedQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY, null, msgs);
			if (newBenefitUsedQuantity != null)
				msgs = ((InternalEObject)newBenefitUsedQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY, null, msgs);
			msgs = basicSetBenefitUsedQuantity(newBenefitUsedQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY, newBenefitUsedQuantity, newBenefitUsedQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return basicSetBenefitUnsignedInt(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY:
				return basicSetBenefitQuantity(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return basicSetBenefitUsedUnsignedInt(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY:
				return basicSetBenefitUsedQuantity(null, msgs);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return getType();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return getBenefitUnsignedInt();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY:
				return getBenefitQuantity();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return getBenefitUsedUnsignedInt();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY:
				return getBenefitUsedQuantity();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				setBenefitUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY:
				setBenefitQuantity((Money)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				setBenefitUsedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY:
				setBenefitUsedQuantity((Money)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				setBenefitUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY:
				setBenefitQuantity((Money)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				setBenefitUsedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY:
				setBenefitUsedQuantity((Money)null);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return type != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return benefitUnsignedInt != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_QUANTITY:
				return benefitQuantity != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return benefitUsedUnsignedInt != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_QUANTITY:
				return benefitUsedQuantity != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseFinancialImpl
