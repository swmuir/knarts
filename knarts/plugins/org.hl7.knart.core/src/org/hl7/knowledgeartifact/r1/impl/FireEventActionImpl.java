/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r1.EventType;
import org.hl7.knowledgeartifact.r1.FireEventAction;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fire Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FireEventActionImpl extends AtomicActionImpl implements FireEventAction {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final EventType EVENT_TYPE_EDEFAULT = EventType.DATA_EVENT;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Event Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventTypeESet;

	/**
	 * The cached value of the '{@link #getActionSentence() <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSentence()
	 * @generated
	 * @ordered
	 */
	protected Expression actionSentence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FireEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.FIRE_EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventType newEventType) {
		EventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.FIRE_EVENT_ACTION__EVENT_TYPE, oldEventType, eventType, !oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventType() {
		EventType oldEventType = eventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventType = EVENT_TYPE_EDEFAULT;
		eventTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.FIRE_EVENT_ACTION__EVENT_TYPE, oldEventType, EVENT_TYPE_EDEFAULT, oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventType() {
		return eventTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActionSentence() {
		return actionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionSentence(Expression newActionSentence, NotificationChain msgs) {
		Expression oldActionSentence = actionSentence;
		actionSentence = newActionSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE, oldActionSentence, newActionSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSentence(Expression newActionSentence) {
		if (newActionSentence != actionSentence) {
			NotificationChain msgs = null;
			if (actionSentence != null)
				msgs = ((InternalEObject)actionSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE, null, msgs);
			if (newActionSentence != null)
				msgs = ((InternalEObject)newActionSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE, null, msgs);
			msgs = basicSetActionSentence(newActionSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE, newActionSentence, newActionSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE:
				return basicSetActionSentence(null, msgs);
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
			case R1Package.FIRE_EVENT_ACTION__EVENT_TYPE:
				return getEventType();
			case R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE:
				return getActionSentence();
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
			case R1Package.FIRE_EVENT_ACTION__EVENT_TYPE:
				setEventType((EventType)newValue);
				return;
			case R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE:
				setActionSentence((Expression)newValue);
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
			case R1Package.FIRE_EVENT_ACTION__EVENT_TYPE:
				unsetEventType();
				return;
			case R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE:
				setActionSentence((Expression)null);
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
			case R1Package.FIRE_EVENT_ACTION__EVENT_TYPE:
				return isSetEventType();
			case R1Package.FIRE_EVENT_ACTION__ACTION_SENTENCE:
				return actionSentence != null;
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
		result.append(" (eventType: ");
		if (eventTypeESet) result.append(eventType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FireEventActionImpl
