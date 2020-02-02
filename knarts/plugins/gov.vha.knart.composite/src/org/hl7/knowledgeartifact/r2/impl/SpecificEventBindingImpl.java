/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.EventBindingTypeType;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SpecificEventBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Event Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl#getContainerEvent <em>Container Event</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl#getEventBindingType <em>Event Binding Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl#getComponentEvent <em>Component Event</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl#getMutability <em>Mutability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificEventBindingImpl extends MinimalEObjectImpl.Container implements SpecificEventBinding {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificEventBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getSpecificEventBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, R2Package.SPECIFIC_EVENT_BINDING__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContainerEvent() {
		return getGroup().list(R2Package.eINSTANCE.getSpecificEventBinding_ContainerEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBindingTypeType> getEventBindingType() {
		return getGroup().list(R2Package.eINSTANCE.getSpecificEventBinding_EventBindingType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComponentEvent() {
		return getGroup().list(R2Package.eINSTANCE.getSpecificEventBinding_ComponentEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMutability() {
		return getGroup().list(R2Package.eINSTANCE.getSpecificEventBinding_Mutability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.SPECIFIC_EVENT_BINDING__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case R2Package.SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE:
				return ((InternalEList<?>)getEventBindingType()).basicRemove(otherEnd, msgs);
			case R2Package.SPECIFIC_EVENT_BINDING__MUTABILITY:
				return ((InternalEList<?>)getMutability()).basicRemove(otherEnd, msgs);
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
			case R2Package.SPECIFIC_EVENT_BINDING__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case R2Package.SPECIFIC_EVENT_BINDING__CONTAINER_EVENT:
				return getContainerEvent();
			case R2Package.SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE:
				return getEventBindingType();
			case R2Package.SPECIFIC_EVENT_BINDING__COMPONENT_EVENT:
				return getComponentEvent();
			case R2Package.SPECIFIC_EVENT_BINDING__MUTABILITY:
				return getMutability();
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
			case R2Package.SPECIFIC_EVENT_BINDING__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__CONTAINER_EVENT:
				getContainerEvent().clear();
				getContainerEvent().addAll((Collection<? extends String>)newValue);
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE:
				getEventBindingType().clear();
				getEventBindingType().addAll((Collection<? extends EventBindingTypeType>)newValue);
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__COMPONENT_EVENT:
				getComponentEvent().clear();
				getComponentEvent().addAll((Collection<? extends String>)newValue);
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__MUTABILITY:
				getMutability().clear();
				getMutability().addAll((Collection<? extends EObject>)newValue);
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
			case R2Package.SPECIFIC_EVENT_BINDING__GROUP:
				getGroup().clear();
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__CONTAINER_EVENT:
				getContainerEvent().clear();
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE:
				getEventBindingType().clear();
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__COMPONENT_EVENT:
				getComponentEvent().clear();
				return;
			case R2Package.SPECIFIC_EVENT_BINDING__MUTABILITY:
				getMutability().clear();
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
			case R2Package.SPECIFIC_EVENT_BINDING__GROUP:
				return group != null && !group.isEmpty();
			case R2Package.SPECIFIC_EVENT_BINDING__CONTAINER_EVENT:
				return !getContainerEvent().isEmpty();
			case R2Package.SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE:
				return !getEventBindingType().isEmpty();
			case R2Package.SPECIFIC_EVENT_BINDING__COMPONENT_EVENT:
				return !getComponentEvent().isEmpty();
			case R2Package.SPECIFIC_EVENT_BINDING__MUTABILITY:
				return !getMutability().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SpecificEventBindingImpl
