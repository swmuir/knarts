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

import org.hl7.knowledgeartifact.r1.KeyTermsType;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Terms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.KeyTermsTypeImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyTermsTypeImpl extends MinimalEObjectImpl.Container implements KeyTermsType {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyTermsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.KEY_TERMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<CD>(CD.class, this, R1Package.KEY_TERMS_TYPE__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.KEY_TERMS_TYPE__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
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
			case R1Package.KEY_TERMS_TYPE__TERM:
				return getTerm();
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
			case R1Package.KEY_TERMS_TYPE__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends CD>)newValue);
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
			case R1Package.KEY_TERMS_TYPE__TERM:
				getTerm().clear();
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
			case R1Package.KEY_TERMS_TYPE__TERM:
				return term != null && !term.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeyTermsTypeImpl
