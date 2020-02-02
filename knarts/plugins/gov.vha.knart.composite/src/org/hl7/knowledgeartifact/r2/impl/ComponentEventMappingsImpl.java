/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.BindingType;
import org.hl7.knowledgeartifact.r2.ComponentEventMappings;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Event Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventMappingsImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventMappingsImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentEventMappingsImpl extends MinimalEObjectImpl.Container implements ComponentEventMappings {
	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected EObject componentId;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingType binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentEventMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getComponentEventMappings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentId(EObject newComponentId, NotificationChain msgs) {
		EObject oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID, oldComponentId, newComponentId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(EObject newComponentId) {
		if (newComponentId != componentId) {
			NotificationChain msgs = null;
			if (componentId != null)
				msgs = ((InternalEObject)componentId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID, null, msgs);
			if (newComponentId != null)
				msgs = ((InternalEObject)newComponentId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID, null, msgs);
			msgs = basicSetComponentId(newComponentId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID, newComponentId, newComponentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(BindingType newBinding, NotificationChain msgs) {
		BindingType oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_MAPPINGS__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(BindingType newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_MAPPINGS__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_MAPPINGS__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_MAPPINGS__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID:
				return basicSetComponentId(null, msgs);
			case R2Package.COMPONENT_EVENT_MAPPINGS__BINDING:
				return basicSetBinding(null, msgs);
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
			case R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID:
				return getComponentId();
			case R2Package.COMPONENT_EVENT_MAPPINGS__BINDING:
				return getBinding();
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
			case R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID:
				setComponentId((EObject)newValue);
				return;
			case R2Package.COMPONENT_EVENT_MAPPINGS__BINDING:
				setBinding((BindingType)newValue);
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
			case R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID:
				setComponentId((EObject)null);
				return;
			case R2Package.COMPONENT_EVENT_MAPPINGS__BINDING:
				setBinding((BindingType)null);
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
			case R2Package.COMPONENT_EVENT_MAPPINGS__COMPONENT_ID:
				return componentId != null;
			case R2Package.COMPONENT_EVENT_MAPPINGS__BINDING:
				return binding != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentEventMappingsImpl
