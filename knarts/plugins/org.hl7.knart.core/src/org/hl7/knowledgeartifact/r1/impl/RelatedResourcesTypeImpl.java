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
import org.hl7.knowledgeartifact.r1.RelatedResourcesType;
import org.hl7.knowledgeartifact.r1.ResourceRelationshipReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.RelatedResourcesTypeImpl#getRelatedResource <em>Related Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedResourcesTypeImpl extends MinimalEObjectImpl.Container implements RelatedResourcesType {
	/**
	 * The cached value of the '{@link #getRelatedResource() <em>Related Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRelationshipReference> relatedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.RELATED_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRelationshipReference> getRelatedResource() {
		if (relatedResource == null) {
			relatedResource = new EObjectContainmentEList<ResourceRelationshipReference>(ResourceRelationshipReference.class, this, R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE);
		}
		return relatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE:
				return ((InternalEList<?>)getRelatedResource()).basicRemove(otherEnd, msgs);
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
			case R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE:
				return getRelatedResource();
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
			case R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE:
				getRelatedResource().clear();
				getRelatedResource().addAll((Collection<? extends ResourceRelationshipReference>)newValue);
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
			case R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE:
				getRelatedResource().clear();
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
			case R1Package.RELATED_RESOURCES_TYPE__RELATED_RESOURCE:
				return relatedResource != null && !relatedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelatedResourcesTypeImpl
