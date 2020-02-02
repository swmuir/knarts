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

import org.hl7.knowledgeartifact.r2.LibrariesType;
import org.hl7.knowledgeartifact.r2.LibraryReference;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libraries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.LibrariesTypeImpl#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibrariesTypeImpl extends MinimalEObjectImpl.Container implements LibrariesType {
	/**
	 * The cached value of the '{@link #getLibraryReference() <em>Library Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryReference()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryReference> libraryReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibrariesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getLibrariesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryReference> getLibraryReference() {
		if (libraryReference == null) {
			libraryReference = new EObjectContainmentEList<LibraryReference>(LibraryReference.class, this, R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE);
		}
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE:
				return ((InternalEList<?>)getLibraryReference()).basicRemove(otherEnd, msgs);
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
			case R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE:
				return getLibraryReference();
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
			case R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE:
				getLibraryReference().clear();
				getLibraryReference().addAll((Collection<? extends LibraryReference>)newValue);
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
			case R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE:
				getLibraryReference().clear();
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
			case R2Package.LIBRARIES_TYPE__LIBRARY_REFERENCE:
				return libraryReference != null && !libraryReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibrariesTypeImpl
