/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.IdentifiersType2;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.VersionedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiers Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.IdentifiersType2Impl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiersType2Impl extends MinimalEObjectImpl.Container implements IdentifiersType2 {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedIdentifier> identifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiersType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getIdentifiersType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedIdentifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<VersionedIdentifier>(VersionedIdentifier.class, this, R2Package.IDENTIFIERS_TYPE2__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.IDENTIFIERS_TYPE2__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
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
			case R2Package.IDENTIFIERS_TYPE2__IDENTIFIER:
				return getIdentifier();
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
			case R2Package.IDENTIFIERS_TYPE2__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends VersionedIdentifier>)newValue);
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
			case R2Package.IDENTIFIERS_TYPE2__IDENTIFIER:
				getIdentifier().clear();
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
			case R2Package.IDENTIFIERS_TYPE2__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdentifiersType2Impl
