/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ActionGroup;
import org.hl7.knowledgeartifact.r2.Completion;
import org.hl7.knowledgeartifact.r2.NamedEventDef;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompletionImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompletionImpl#getActionGroup <em>Action Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionImpl extends MinimalEObjectImpl.Container implements Completion {
	/**
	 * The cached value of the '{@link #getEventDefinition() <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected NamedEventDef eventDefinition;

	/**
	 * The cached value of the '{@link #getActionGroup() <em>Action Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGroup()
	 * @generated
	 * @ordered
	 */
	protected ActionGroup actionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getCompletion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEventDef getEventDefinition() {
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDefinition(NamedEventDef newEventDefinition, NotificationChain msgs) {
		NamedEventDef oldEventDefinition = eventDefinition;
		eventDefinition = newEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPLETION__EVENT_DEFINITION, oldEventDefinition, newEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDefinition(NamedEventDef newEventDefinition) {
		if (newEventDefinition != eventDefinition) {
			NotificationChain msgs = null;
			if (eventDefinition != null)
				msgs = ((InternalEObject)eventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPLETION__EVENT_DEFINITION, null, msgs);
			if (newEventDefinition != null)
				msgs = ((InternalEObject)newEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPLETION__EVENT_DEFINITION, null, msgs);
			msgs = basicSetEventDefinition(newEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPLETION__EVENT_DEFINITION, newEventDefinition, newEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroup getActionGroup() {
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionGroup(ActionGroup newActionGroup, NotificationChain msgs) {
		ActionGroup oldActionGroup = actionGroup;
		actionGroup = newActionGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPLETION__ACTION_GROUP, oldActionGroup, newActionGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionGroup(ActionGroup newActionGroup) {
		if (newActionGroup != actionGroup) {
			NotificationChain msgs = null;
			if (actionGroup != null)
				msgs = ((InternalEObject)actionGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPLETION__ACTION_GROUP, null, msgs);
			if (newActionGroup != null)
				msgs = ((InternalEObject)newActionGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPLETION__ACTION_GROUP, null, msgs);
			msgs = basicSetActionGroup(newActionGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPLETION__ACTION_GROUP, newActionGroup, newActionGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.COMPLETION__EVENT_DEFINITION:
				return basicSetEventDefinition(null, msgs);
			case R2Package.COMPLETION__ACTION_GROUP:
				return basicSetActionGroup(null, msgs);
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
			case R2Package.COMPLETION__EVENT_DEFINITION:
				return getEventDefinition();
			case R2Package.COMPLETION__ACTION_GROUP:
				return getActionGroup();
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
			case R2Package.COMPLETION__EVENT_DEFINITION:
				setEventDefinition((NamedEventDef)newValue);
				return;
			case R2Package.COMPLETION__ACTION_GROUP:
				setActionGroup((ActionGroup)newValue);
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
			case R2Package.COMPLETION__EVENT_DEFINITION:
				setEventDefinition((NamedEventDef)null);
				return;
			case R2Package.COMPLETION__ACTION_GROUP:
				setActionGroup((ActionGroup)null);
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
			case R2Package.COMPLETION__EVENT_DEFINITION:
				return eventDefinition != null;
			case R2Package.COMPLETION__ACTION_GROUP:
				return actionGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //CompletionImpl
