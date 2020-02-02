/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.BindingModelType1;
import org.hl7.knowledgeartifact.r2.ComponentEventBinding;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SpecificEventBinding;
import org.hl7.knowledgeartifact.r2.TriggerBindings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Event Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl#getIncomingBindings <em>Incoming Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl#getOutgoingBindings <em>Outgoing Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentEventBindingImpl extends MinimalEObjectImpl.Container implements ComponentEventBinding {
	/**
	 * The cached value of the '{@link #getBindingModel() <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingModel()
	 * @generated
	 * @ordered
	 */
	protected BindingModelType1 bindingModel;

	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingBindings() <em>Incoming Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingBindings()
	 * @generated
	 * @ordered
	 */
	protected SpecificEventBinding incomingBindings;

	/**
	 * The cached value of the '{@link #getOutgoingBindings() <em>Outgoing Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingBindings()
	 * @generated
	 * @ordered
	 */
	protected SpecificEventBinding outgoingBindings;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerBindings> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentEventBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getComponentEventBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModelType1 getBindingModel() {
		return bindingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingModel(BindingModelType1 newBindingModel, NotificationChain msgs) {
		BindingModelType1 oldBindingModel = bindingModel;
		bindingModel = newBindingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL, oldBindingModel, newBindingModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingModel(BindingModelType1 newBindingModel) {
		if (newBindingModel != bindingModel) {
			NotificationChain msgs = null;
			if (bindingModel != null)
				msgs = ((InternalEObject)bindingModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL, null, msgs);
			if (newBindingModel != null)
				msgs = ((InternalEObject)newBindingModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL, null, msgs);
			msgs = basicSetBindingModel(newBindingModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL, newBindingModel, newBindingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificEventBinding getIncomingBindings() {
		return incomingBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingBindings(SpecificEventBinding newIncomingBindings, NotificationChain msgs) {
		SpecificEventBinding oldIncomingBindings = incomingBindings;
		incomingBindings = newIncomingBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS, oldIncomingBindings, newIncomingBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingBindings(SpecificEventBinding newIncomingBindings) {
		if (newIncomingBindings != incomingBindings) {
			NotificationChain msgs = null;
			if (incomingBindings != null)
				msgs = ((InternalEObject)incomingBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS, null, msgs);
			if (newIncomingBindings != null)
				msgs = ((InternalEObject)newIncomingBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS, null, msgs);
			msgs = basicSetIncomingBindings(newIncomingBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS, newIncomingBindings, newIncomingBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificEventBinding getOutgoingBindings() {
		return outgoingBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingBindings(SpecificEventBinding newOutgoingBindings, NotificationChain msgs) {
		SpecificEventBinding oldOutgoingBindings = outgoingBindings;
		outgoingBindings = newOutgoingBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS, oldOutgoingBindings, newOutgoingBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingBindings(SpecificEventBinding newOutgoingBindings) {
		if (newOutgoingBindings != outgoingBindings) {
			NotificationChain msgs = null;
			if (outgoingBindings != null)
				msgs = ((InternalEObject)outgoingBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS, null, msgs);
			if (newOutgoingBindings != null)
				msgs = ((InternalEObject)newOutgoingBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS, null, msgs);
			msgs = basicSetOutgoingBindings(newOutgoingBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS, newOutgoingBindings, newOutgoingBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerBindings> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<TriggerBindings>(TriggerBindings.class, this, R2Package.COMPONENT_EVENT_BINDING__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL:
				return basicSetBindingModel(null, msgs);
			case R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS:
				return basicSetIncomingBindings(null, msgs);
			case R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS:
				return basicSetOutgoingBindings(null, msgs);
			case R2Package.COMPONENT_EVENT_BINDING__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL:
				return getBindingModel();
			case R2Package.COMPONENT_EVENT_BINDING__COMPONENT_ID:
				return getComponentId();
			case R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS:
				return getIncomingBindings();
			case R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS:
				return getOutgoingBindings();
			case R2Package.COMPONENT_EVENT_BINDING__TRIGGERS:
				return getTriggers();
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
			case R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL:
				setBindingModel((BindingModelType1)newValue);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS:
				setIncomingBindings((SpecificEventBinding)newValue);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS:
				setOutgoingBindings((SpecificEventBinding)newValue);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends TriggerBindings>)newValue);
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
			case R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL:
				setBindingModel((BindingModelType1)null);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS:
				setIncomingBindings((SpecificEventBinding)null);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS:
				setOutgoingBindings((SpecificEventBinding)null);
				return;
			case R2Package.COMPONENT_EVENT_BINDING__TRIGGERS:
				getTriggers().clear();
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
			case R2Package.COMPONENT_EVENT_BINDING__BINDING_MODEL:
				return bindingModel != null;
			case R2Package.COMPONENT_EVENT_BINDING__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case R2Package.COMPONENT_EVENT_BINDING__INCOMING_BINDINGS:
				return incomingBindings != null;
			case R2Package.COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS:
				return outgoingBindings != null;
			case R2Package.COMPONENT_EVENT_BINDING__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
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
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(')');
		return result.toString();
	}

} //ComponentEventBindingImpl
