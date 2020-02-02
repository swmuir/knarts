/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.BindingModelType;
import org.hl7.knowledgeartifact.r2.EventBinding;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SpecificEventBinding;
import org.hl7.knowledgeartifact.r2.TriggerBindings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EventBindingImpl#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EventBindingImpl#getIncomingBindings <em>Incoming Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EventBindingImpl#getOutgoingBindings <em>Outgoing Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EventBindingImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventBindingImpl extends MinimalEObjectImpl.Container implements EventBinding {
	/**
	 * The cached value of the '{@link #getBindingModel() <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingModel()
	 * @generated
	 * @ordered
	 */
	protected BindingModelType bindingModel;

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
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected TriggerBindings triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getEventBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModelType getBindingModel() {
		return bindingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingModel(BindingModelType newBindingModel, NotificationChain msgs) {
		BindingModelType oldBindingModel = bindingModel;
		bindingModel = newBindingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__BINDING_MODEL, oldBindingModel, newBindingModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingModel(BindingModelType newBindingModel) {
		if (newBindingModel != bindingModel) {
			NotificationChain msgs = null;
			if (bindingModel != null)
				msgs = ((InternalEObject)bindingModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__BINDING_MODEL, null, msgs);
			if (newBindingModel != null)
				msgs = ((InternalEObject)newBindingModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__BINDING_MODEL, null, msgs);
			msgs = basicSetBindingModel(newBindingModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__BINDING_MODEL, newBindingModel, newBindingModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__INCOMING_BINDINGS, oldIncomingBindings, newIncomingBindings);
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
				msgs = ((InternalEObject)incomingBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__INCOMING_BINDINGS, null, msgs);
			if (newIncomingBindings != null)
				msgs = ((InternalEObject)newIncomingBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__INCOMING_BINDINGS, null, msgs);
			msgs = basicSetIncomingBindings(newIncomingBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__INCOMING_BINDINGS, newIncomingBindings, newIncomingBindings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__OUTGOING_BINDINGS, oldOutgoingBindings, newOutgoingBindings);
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
				msgs = ((InternalEObject)outgoingBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__OUTGOING_BINDINGS, null, msgs);
			if (newOutgoingBindings != null)
				msgs = ((InternalEObject)newOutgoingBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__OUTGOING_BINDINGS, null, msgs);
			msgs = basicSetOutgoingBindings(newOutgoingBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__OUTGOING_BINDINGS, newOutgoingBindings, newOutgoingBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerBindings getTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggers(TriggerBindings newTriggers, NotificationChain msgs) {
		TriggerBindings oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__TRIGGERS, oldTriggers, newTriggers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(TriggerBindings newTriggers) {
		if (newTriggers != triggers) {
			NotificationChain msgs = null;
			if (triggers != null)
				msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__TRIGGERS, null, msgs);
			if (newTriggers != null)
				msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVENT_BINDING__TRIGGERS, null, msgs);
			msgs = basicSetTriggers(newTriggers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVENT_BINDING__TRIGGERS, newTriggers, newTriggers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.EVENT_BINDING__BINDING_MODEL:
				return basicSetBindingModel(null, msgs);
			case R2Package.EVENT_BINDING__INCOMING_BINDINGS:
				return basicSetIncomingBindings(null, msgs);
			case R2Package.EVENT_BINDING__OUTGOING_BINDINGS:
				return basicSetOutgoingBindings(null, msgs);
			case R2Package.EVENT_BINDING__TRIGGERS:
				return basicSetTriggers(null, msgs);
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
			case R2Package.EVENT_BINDING__BINDING_MODEL:
				return getBindingModel();
			case R2Package.EVENT_BINDING__INCOMING_BINDINGS:
				return getIncomingBindings();
			case R2Package.EVENT_BINDING__OUTGOING_BINDINGS:
				return getOutgoingBindings();
			case R2Package.EVENT_BINDING__TRIGGERS:
				return getTriggers();
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
			case R2Package.EVENT_BINDING__BINDING_MODEL:
				setBindingModel((BindingModelType)newValue);
				return;
			case R2Package.EVENT_BINDING__INCOMING_BINDINGS:
				setIncomingBindings((SpecificEventBinding)newValue);
				return;
			case R2Package.EVENT_BINDING__OUTGOING_BINDINGS:
				setOutgoingBindings((SpecificEventBinding)newValue);
				return;
			case R2Package.EVENT_BINDING__TRIGGERS:
				setTriggers((TriggerBindings)newValue);
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
			case R2Package.EVENT_BINDING__BINDING_MODEL:
				setBindingModel((BindingModelType)null);
				return;
			case R2Package.EVENT_BINDING__INCOMING_BINDINGS:
				setIncomingBindings((SpecificEventBinding)null);
				return;
			case R2Package.EVENT_BINDING__OUTGOING_BINDINGS:
				setOutgoingBindings((SpecificEventBinding)null);
				return;
			case R2Package.EVENT_BINDING__TRIGGERS:
				setTriggers((TriggerBindings)null);
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
			case R2Package.EVENT_BINDING__BINDING_MODEL:
				return bindingModel != null;
			case R2Package.EVENT_BINDING__INCOMING_BINDINGS:
				return incomingBindings != null;
			case R2Package.EVENT_BINDING__OUTGOING_BINDINGS:
				return outgoingBindings != null;
			case R2Package.EVENT_BINDING__TRIGGERS:
				return triggers != null;
		}
		return super.eIsSet(featureID);
	}

} //EventBindingImpl
