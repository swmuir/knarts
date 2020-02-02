/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.Context;
import org.hl7.knowledgeartifact.r2.ControlBlock;
import org.hl7.knowledgeartifact.r2.ControllingArtifactType;
import org.hl7.knowledgeartifact.r2.InitialArtifactType;
import org.hl7.knowledgeartifact.r2.MappingType;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getEventActivation <em>Event Activation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getControllingArtifact <em>Controlling Artifact</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl#getInitialArtifact <em>Initial Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlBlockImpl extends MinimalEObjectImpl.Container implements ControlBlock {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getEventActivation() <em>Event Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActivation()
	 * @generated
	 * @ordered
	 */
	protected EObject eventActivation;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected EObject propagation;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected MappingType mapping;

	/**
	 * The cached value of the '{@link #getControllingArtifact() <em>Controlling Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllingArtifact()
	 * @generated
	 * @ordered
	 */
	protected ControllingArtifactType controllingArtifact;

	/**
	 * The cached value of the '{@link #getInitialArtifact() <em>Initial Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialArtifactType> initialArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getControlBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEventActivation() {
		return eventActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventActivation(EObject newEventActivation, NotificationChain msgs) {
		EObject oldEventActivation = eventActivation;
		eventActivation = newEventActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__EVENT_ACTIVATION, oldEventActivation, newEventActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventActivation(EObject newEventActivation) {
		if (newEventActivation != eventActivation) {
			NotificationChain msgs = null;
			if (eventActivation != null)
				msgs = ((InternalEObject)eventActivation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__EVENT_ACTIVATION, null, msgs);
			if (newEventActivation != null)
				msgs = ((InternalEObject)newEventActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__EVENT_ACTIVATION, null, msgs);
			msgs = basicSetEventActivation(newEventActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__EVENT_ACTIVATION, newEventActivation, newEventActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropagation(EObject newPropagation, NotificationChain msgs) {
		EObject oldPropagation = propagation;
		propagation = newPropagation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__PROPAGATION, oldPropagation, newPropagation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagation(EObject newPropagation) {
		if (newPropagation != propagation) {
			NotificationChain msgs = null;
			if (propagation != null)
				msgs = ((InternalEObject)propagation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__PROPAGATION, null, msgs);
			if (newPropagation != null)
				msgs = ((InternalEObject)newPropagation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__PROPAGATION, null, msgs);
			msgs = basicSetPropagation(newPropagation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__PROPAGATION, newPropagation, newPropagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(MappingType newMapping, NotificationChain msgs) {
		MappingType oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(MappingType newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllingArtifactType getControllingArtifact() {
		return controllingArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllingArtifact(ControllingArtifactType newControllingArtifact, NotificationChain msgs) {
		ControllingArtifactType oldControllingArtifact = controllingArtifact;
		controllingArtifact = newControllingArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT, oldControllingArtifact, newControllingArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllingArtifact(ControllingArtifactType newControllingArtifact) {
		if (newControllingArtifact != controllingArtifact) {
			NotificationChain msgs = null;
			if (controllingArtifact != null)
				msgs = ((InternalEObject)controllingArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT, null, msgs);
			if (newControllingArtifact != null)
				msgs = ((InternalEObject)newControllingArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT, null, msgs);
			msgs = basicSetControllingArtifact(newControllingArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT, newControllingArtifact, newControllingArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialArtifactType> getInitialArtifact() {
		if (initialArtifact == null) {
			initialArtifact = new EObjectContainmentEList<InitialArtifactType>(InitialArtifactType.class, this, R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT);
		}
		return initialArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CONTROL_BLOCK__CONTEXT:
				return basicSetContext(null, msgs);
			case R2Package.CONTROL_BLOCK__EVENT_ACTIVATION:
				return basicSetEventActivation(null, msgs);
			case R2Package.CONTROL_BLOCK__PROPAGATION:
				return basicSetPropagation(null, msgs);
			case R2Package.CONTROL_BLOCK__MAPPING:
				return basicSetMapping(null, msgs);
			case R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT:
				return basicSetControllingArtifact(null, msgs);
			case R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT:
				return ((InternalEList<?>)getInitialArtifact()).basicRemove(otherEnd, msgs);
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
			case R2Package.CONTROL_BLOCK__CONTEXT:
				return getContext();
			case R2Package.CONTROL_BLOCK__EVENT_ACTIVATION:
				return getEventActivation();
			case R2Package.CONTROL_BLOCK__PROPAGATION:
				return getPropagation();
			case R2Package.CONTROL_BLOCK__MAPPING:
				return getMapping();
			case R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT:
				return getControllingArtifact();
			case R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT:
				return getInitialArtifact();
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
			case R2Package.CONTROL_BLOCK__CONTEXT:
				setContext((Context)newValue);
				return;
			case R2Package.CONTROL_BLOCK__EVENT_ACTIVATION:
				setEventActivation((EObject)newValue);
				return;
			case R2Package.CONTROL_BLOCK__PROPAGATION:
				setPropagation((EObject)newValue);
				return;
			case R2Package.CONTROL_BLOCK__MAPPING:
				setMapping((MappingType)newValue);
				return;
			case R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT:
				setControllingArtifact((ControllingArtifactType)newValue);
				return;
			case R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT:
				getInitialArtifact().clear();
				getInitialArtifact().addAll((Collection<? extends InitialArtifactType>)newValue);
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
			case R2Package.CONTROL_BLOCK__CONTEXT:
				setContext((Context)null);
				return;
			case R2Package.CONTROL_BLOCK__EVENT_ACTIVATION:
				setEventActivation((EObject)null);
				return;
			case R2Package.CONTROL_BLOCK__PROPAGATION:
				setPropagation((EObject)null);
				return;
			case R2Package.CONTROL_BLOCK__MAPPING:
				setMapping((MappingType)null);
				return;
			case R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT:
				setControllingArtifact((ControllingArtifactType)null);
				return;
			case R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT:
				getInitialArtifact().clear();
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
			case R2Package.CONTROL_BLOCK__CONTEXT:
				return context != null;
			case R2Package.CONTROL_BLOCK__EVENT_ACTIVATION:
				return eventActivation != null;
			case R2Package.CONTROL_BLOCK__PROPAGATION:
				return propagation != null;
			case R2Package.CONTROL_BLOCK__MAPPING:
				return mapping != null;
			case R2Package.CONTROL_BLOCK__CONTROLLING_ARTIFACT:
				return controllingArtifact != null;
			case R2Package.CONTROL_BLOCK__INITIAL_ARTIFACT:
				return initialArtifact != null && !initialArtifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlBlockImpl
