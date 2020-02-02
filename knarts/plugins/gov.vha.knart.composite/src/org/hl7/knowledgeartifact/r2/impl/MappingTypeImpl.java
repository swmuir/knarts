/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ComponentEventBinding;
import org.hl7.knowledgeartifact.r2.MappingType;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.MappingTypeImpl#getComponentEventMappings <em>Component Event Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingTypeImpl extends MinimalEObjectImpl.Container implements MappingType {
	/**
	 * The cached value of the '{@link #getComponentEventMappings() <em>Component Event Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentEventMappings()
	 * @generated
	 * @ordered
	 */
	protected ComponentEventBinding componentEventMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getMappingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentEventBinding getComponentEventMappings() {
		return componentEventMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentEventMappings(ComponentEventBinding newComponentEventMappings, NotificationChain msgs) {
		ComponentEventBinding oldComponentEventMappings = componentEventMappings;
		componentEventMappings = newComponentEventMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS, oldComponentEventMappings, newComponentEventMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentEventMappings(ComponentEventBinding newComponentEventMappings) {
		if (newComponentEventMappings != componentEventMappings) {
			NotificationChain msgs = null;
			if (componentEventMappings != null)
				msgs = ((InternalEObject)componentEventMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS, null, msgs);
			if (newComponentEventMappings != null)
				msgs = ((InternalEObject)newComponentEventMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS, null, msgs);
			msgs = basicSetComponentEventMappings(newComponentEventMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS, newComponentEventMappings, newComponentEventMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS:
				return basicSetComponentEventMappings(null, msgs);
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
			case R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS:
				return getComponentEventMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS:
				setComponentEventMappings((ComponentEventBinding)newValue);
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
			case R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS:
				setComponentEventMappings((ComponentEventBinding)null);
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
			case R2Package.MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS:
				return componentEventMappings != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingTypeImpl
