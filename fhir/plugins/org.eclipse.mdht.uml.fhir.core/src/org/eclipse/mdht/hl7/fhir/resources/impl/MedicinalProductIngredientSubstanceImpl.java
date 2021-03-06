/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIngredientSpecifiedSubstanceStrength;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIngredientSubstance;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Substance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSubstanceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSubstanceImpl#getStrengths <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientSubstanceImpl extends BackboneElementImpl implements MedicinalProductIngredientSubstance {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStrengths() <em>Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengths()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIngredientSpecifiedSubstanceStrength> strengths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientSubstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductIngredientSubstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIngredientSpecifiedSubstanceStrength> getStrengths() {
		if (strengths == null) {
			strengths = new EObjectContainmentEList<MedicinalProductIngredientSpecifiedSubstanceStrength>(MedicinalProductIngredientSpecifiedSubstanceStrength.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH);
		}
		return strengths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH:
				return ((InternalEList<?>)getStrengths()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE:
				return getCode();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH:
				return getStrengths();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH:
				getStrengths().clear();
				getStrengths().addAll((Collection<? extends MedicinalProductIngredientSpecifiedSubstanceStrength>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH:
				getStrengths().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__CODE:
				return code != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE__STRENGTH:
				return strengths != null && !strengths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientSubstanceImpl
