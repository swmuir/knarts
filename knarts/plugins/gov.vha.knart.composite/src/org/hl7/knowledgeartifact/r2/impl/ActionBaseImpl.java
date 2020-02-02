/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.II;

import org.hl7.knowledgeartifact.r2.ActionBase;
import org.hl7.knowledgeartifact.r2.ActorsType;
import org.hl7.knowledgeartifact.r2.Behaviors;
import org.hl7.knowledgeartifact.r2.Conditions;
import org.hl7.knowledgeartifact.r2.FormattedText;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SupportingEvidence;
import org.hl7.knowledgeartifact.r2.SupportingResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getActionId <em>Action Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getSupportingResources <em>Supporting Resources</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionBaseImpl extends MinimalEObjectImpl.Container implements ActionBase {
	/**
	 * The cached value of the '{@link #getActionId() <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionId()
	 * @generated
	 * @ordered
	 */
	protected II actionId;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected FormattedText number;

	/**
	 * The cached value of the '{@link #getSupportingEvidence() <em>Supporting Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingEvidence()
	 * @generated
	 * @ordered
	 */
	protected SupportingEvidence supportingEvidence;

	/**
	 * The cached value of the '{@link #getSupportingResources() <em>Supporting Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingResources()
	 * @generated
	 * @ordered
	 */
	protected SupportingResource supportingResources;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected ActorsType actors;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected Behaviors behaviors;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected Conditions conditions;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getActionBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getActionId() {
		return actionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionId(II newActionId, NotificationChain msgs) {
		II oldActionId = actionId;
		actionId = newActionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__ACTION_ID, oldActionId, newActionId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionId(II newActionId) {
		if (newActionId != actionId) {
			NotificationChain msgs = null;
			if (actionId != null)
				msgs = ((InternalEObject)actionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__ACTION_ID, null, msgs);
			if (newActionId != null)
				msgs = ((InternalEObject)newActionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__ACTION_ID, null, msgs);
			msgs = basicSetActionId(newActionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__ACTION_ID, newActionId, newActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(FormattedText newNumber, NotificationChain msgs) {
		FormattedText oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(FormattedText newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingEvidence getSupportingEvidence() {
		return supportingEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingEvidence(SupportingEvidence newSupportingEvidence, NotificationChain msgs) {
		SupportingEvidence oldSupportingEvidence = supportingEvidence;
		supportingEvidence = newSupportingEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__SUPPORTING_EVIDENCE, oldSupportingEvidence, newSupportingEvidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingEvidence(SupportingEvidence newSupportingEvidence) {
		if (newSupportingEvidence != supportingEvidence) {
			NotificationChain msgs = null;
			if (supportingEvidence != null)
				msgs = ((InternalEObject)supportingEvidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__SUPPORTING_EVIDENCE, null, msgs);
			if (newSupportingEvidence != null)
				msgs = ((InternalEObject)newSupportingEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__SUPPORTING_EVIDENCE, null, msgs);
			msgs = basicSetSupportingEvidence(newSupportingEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__SUPPORTING_EVIDENCE, newSupportingEvidence, newSupportingEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingResource getSupportingResources() {
		return supportingResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingResources(SupportingResource newSupportingResources, NotificationChain msgs) {
		SupportingResource oldSupportingResources = supportingResources;
		supportingResources = newSupportingResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__SUPPORTING_RESOURCES, oldSupportingResources, newSupportingResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingResources(SupportingResource newSupportingResources) {
		if (newSupportingResources != supportingResources) {
			NotificationChain msgs = null;
			if (supportingResources != null)
				msgs = ((InternalEObject)supportingResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__SUPPORTING_RESOURCES, null, msgs);
			if (newSupportingResources != null)
				msgs = ((InternalEObject)newSupportingResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__SUPPORTING_RESOURCES, null, msgs);
			msgs = basicSetSupportingResources(newSupportingResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__SUPPORTING_RESOURCES, newSupportingResources, newSupportingResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorsType getActors() {
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActors(ActorsType newActors, NotificationChain msgs) {
		ActorsType oldActors = actors;
		actors = newActors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__ACTORS, oldActors, newActors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActors(ActorsType newActors) {
		if (newActors != actors) {
			NotificationChain msgs = null;
			if (actors != null)
				msgs = ((InternalEObject)actors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__ACTORS, null, msgs);
			if (newActors != null)
				msgs = ((InternalEObject)newActors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__ACTORS, null, msgs);
			msgs = basicSetActors(newActors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__ACTORS, newActors, newActors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviors getBehaviors() {
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviors(Behaviors newBehaviors, NotificationChain msgs) {
		Behaviors oldBehaviors = behaviors;
		behaviors = newBehaviors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__BEHAVIORS, oldBehaviors, newBehaviors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviors(Behaviors newBehaviors) {
		if (newBehaviors != behaviors) {
			NotificationChain msgs = null;
			if (behaviors != null)
				msgs = ((InternalEObject)behaviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__BEHAVIORS, null, msgs);
			if (newBehaviors != null)
				msgs = ((InternalEObject)newBehaviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__BEHAVIORS, null, msgs);
			msgs = basicSetBehaviors(newBehaviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__BEHAVIORS, newBehaviors, newBehaviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditions getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(Conditions newConditions, NotificationChain msgs) {
		Conditions oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__CONDITIONS, oldConditions, newConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditions(Conditions newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_BASE__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__CONDITIONS, newConditions, newConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_BASE__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		int oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.ACTION_BASE__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.ACTION_BASE__ACTION_ID:
				return basicSetActionId(null, msgs);
			case R2Package.ACTION_BASE__NUMBER:
				return basicSetNumber(null, msgs);
			case R2Package.ACTION_BASE__SUPPORTING_EVIDENCE:
				return basicSetSupportingEvidence(null, msgs);
			case R2Package.ACTION_BASE__SUPPORTING_RESOURCES:
				return basicSetSupportingResources(null, msgs);
			case R2Package.ACTION_BASE__ACTORS:
				return basicSetActors(null, msgs);
			case R2Package.ACTION_BASE__BEHAVIORS:
				return basicSetBehaviors(null, msgs);
			case R2Package.ACTION_BASE__CONDITIONS:
				return basicSetConditions(null, msgs);
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
			case R2Package.ACTION_BASE__ACTION_ID:
				return getActionId();
			case R2Package.ACTION_BASE__NUMBER:
				return getNumber();
			case R2Package.ACTION_BASE__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case R2Package.ACTION_BASE__SUPPORTING_RESOURCES:
				return getSupportingResources();
			case R2Package.ACTION_BASE__ACTORS:
				return getActors();
			case R2Package.ACTION_BASE__BEHAVIORS:
				return getBehaviors();
			case R2Package.ACTION_BASE__CONDITIONS:
				return getConditions();
			case R2Package.ACTION_BASE__ORDER:
				return getOrder();
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
			case R2Package.ACTION_BASE__ACTION_ID:
				setActionId((II)newValue);
				return;
			case R2Package.ACTION_BASE__NUMBER:
				setNumber((FormattedText)newValue);
				return;
			case R2Package.ACTION_BASE__SUPPORTING_EVIDENCE:
				setSupportingEvidence((SupportingEvidence)newValue);
				return;
			case R2Package.ACTION_BASE__SUPPORTING_RESOURCES:
				setSupportingResources((SupportingResource)newValue);
				return;
			case R2Package.ACTION_BASE__ACTORS:
				setActors((ActorsType)newValue);
				return;
			case R2Package.ACTION_BASE__BEHAVIORS:
				setBehaviors((Behaviors)newValue);
				return;
			case R2Package.ACTION_BASE__CONDITIONS:
				setConditions((Conditions)newValue);
				return;
			case R2Package.ACTION_BASE__ORDER:
				setOrder((Integer)newValue);
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
			case R2Package.ACTION_BASE__ACTION_ID:
				setActionId((II)null);
				return;
			case R2Package.ACTION_BASE__NUMBER:
				setNumber((FormattedText)null);
				return;
			case R2Package.ACTION_BASE__SUPPORTING_EVIDENCE:
				setSupportingEvidence((SupportingEvidence)null);
				return;
			case R2Package.ACTION_BASE__SUPPORTING_RESOURCES:
				setSupportingResources((SupportingResource)null);
				return;
			case R2Package.ACTION_BASE__ACTORS:
				setActors((ActorsType)null);
				return;
			case R2Package.ACTION_BASE__BEHAVIORS:
				setBehaviors((Behaviors)null);
				return;
			case R2Package.ACTION_BASE__CONDITIONS:
				setConditions((Conditions)null);
				return;
			case R2Package.ACTION_BASE__ORDER:
				unsetOrder();
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
			case R2Package.ACTION_BASE__ACTION_ID:
				return actionId != null;
			case R2Package.ACTION_BASE__NUMBER:
				return number != null;
			case R2Package.ACTION_BASE__SUPPORTING_EVIDENCE:
				return supportingEvidence != null;
			case R2Package.ACTION_BASE__SUPPORTING_RESOURCES:
				return supportingResources != null;
			case R2Package.ACTION_BASE__ACTORS:
				return actors != null;
			case R2Package.ACTION_BASE__BEHAVIORS:
				return behaviors != null;
			case R2Package.ACTION_BASE__CONDITIONS:
				return conditions != null;
			case R2Package.ACTION_BASE__ORDER:
				return isSetOrder();
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
		result.append(" (order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ActionBaseImpl
