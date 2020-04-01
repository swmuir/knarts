/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionApplicability;
import org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionPropertyGroup;
import org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionPropertyGroupPriceComponent;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ChargeItemDefinitionPropertyGroupImpl#getApplicabilities <em>Applicability</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ChargeItemDefinitionPropertyGroupImpl#getPriceComponents <em>Price Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemDefinitionPropertyGroupImpl extends BackboneElementImpl implements ChargeItemDefinitionPropertyGroup {
	/**
	 * The cached value of the '{@link #getApplicabilities() <em>Applicability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinitionApplicability> applicabilities;

	/**
	 * The cached value of the '{@link #getPriceComponents() <em>Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinitionPropertyGroupPriceComponent> priceComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemDefinitionPropertyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getChargeItemDefinitionPropertyGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemDefinitionApplicability> getApplicabilities() {
		if (applicabilities == null) {
			applicabilities = new EObjectContainmentEList<ChargeItemDefinitionApplicability>(ChargeItemDefinitionApplicability.class, this, ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY);
		}
		return applicabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemDefinitionPropertyGroupPriceComponent> getPriceComponents() {
		if (priceComponents == null) {
			priceComponents = new EObjectContainmentEList<ChargeItemDefinitionPropertyGroupPriceComponent>(ChargeItemDefinitionPropertyGroupPriceComponent.class, this, ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT);
		}
		return priceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return ((InternalEList<?>)getApplicabilities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return ((InternalEList<?>)getPriceComponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return getApplicabilities();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return getPriceComponents();
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
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicabilities().clear();
				getApplicabilities().addAll((Collection<? extends ChargeItemDefinitionApplicability>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponents().clear();
				getPriceComponents().addAll((Collection<? extends ChargeItemDefinitionPropertyGroupPriceComponent>)newValue);
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
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicabilities().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponents().clear();
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
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return applicabilities != null && !applicabilities.isEmpty();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return priceComponents != null && !priceComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemDefinitionPropertyGroupImpl
