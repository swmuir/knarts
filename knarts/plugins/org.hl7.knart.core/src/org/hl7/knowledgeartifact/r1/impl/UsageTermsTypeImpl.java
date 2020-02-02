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

import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RightsDeclaration;
import org.hl7.knowledgeartifact.r1.UsageTermsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Terms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.UsageTermsTypeImpl#getRightsDeclaration <em>Rights Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageTermsTypeImpl extends MinimalEObjectImpl.Container implements UsageTermsType {
	/**
	 * The cached value of the '{@link #getRightsDeclaration() <em>Rights Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<RightsDeclaration> rightsDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageTermsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.USAGE_TERMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightsDeclaration> getRightsDeclaration() {
		if (rightsDeclaration == null) {
			rightsDeclaration = new EObjectContainmentEList<RightsDeclaration>(RightsDeclaration.class, this, R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION);
		}
		return rightsDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION:
				return ((InternalEList<?>)getRightsDeclaration()).basicRemove(otherEnd, msgs);
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
			case R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION:
				return getRightsDeclaration();
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
			case R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION:
				getRightsDeclaration().clear();
				getRightsDeclaration().addAll((Collection<? extends RightsDeclaration>)newValue);
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
			case R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION:
				getRightsDeclaration().clear();
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
			case R1Package.USAGE_TERMS_TYPE__RIGHTS_DECLARATION:
				return rightsDeclaration != null && !rightsDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageTermsTypeImpl
