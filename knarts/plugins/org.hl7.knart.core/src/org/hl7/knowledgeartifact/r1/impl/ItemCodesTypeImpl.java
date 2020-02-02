/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.cdsdt.r2.CD;

import org.hl7.knowledgeartifact.r1.ItemCodesType;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Codes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ItemCodesTypeImpl#getItemCode <em>Item Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemCodesTypeImpl extends MinimalEObjectImpl.Container implements ItemCodesType {
	/**
	 * The cached value of the '{@link #getItemCode() <em>Item Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> itemCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemCodesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.ITEM_CODES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getItemCode() {
		if (itemCode == null) {
			itemCode = new EObjectContainmentEList<CD>(CD.class, this, R1Package.ITEM_CODES_TYPE__ITEM_CODE);
		}
		return itemCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.ITEM_CODES_TYPE__ITEM_CODE:
				return ((InternalEList<?>)getItemCode()).basicRemove(otherEnd, msgs);
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
			case R1Package.ITEM_CODES_TYPE__ITEM_CODE:
				return getItemCode();
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
			case R1Package.ITEM_CODES_TYPE__ITEM_CODE:
				getItemCode().clear();
				getItemCode().addAll((Collection<? extends CD>)newValue);
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
			case R1Package.ITEM_CODES_TYPE__ITEM_CODE:
				getItemCode().clear();
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
			case R1Package.ITEM_CODES_TYPE__ITEM_CODE:
				return itemCode != null && !itemCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItemCodesTypeImpl
