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

import org.hl7.knowledgeartifact.r2.ContainedArtifact;
import org.hl7.knowledgeartifact.r2.ContainedArtifactList;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Artifact List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactListImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainedArtifactListImpl extends MinimalEObjectImpl.Container implements ContainedArtifactList {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainedArtifact> artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedArtifactListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getContainedArtifactList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainedArtifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentEList<ContainedArtifact>(ContainedArtifact.class, this, R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
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
			case R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT:
				return getArtifact();
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
			case R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends ContainedArtifact>)newValue);
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
			case R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT:
				getArtifact().clear();
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
			case R2Package.CONTAINED_ARTIFACT_LIST__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainedArtifactListImpl
