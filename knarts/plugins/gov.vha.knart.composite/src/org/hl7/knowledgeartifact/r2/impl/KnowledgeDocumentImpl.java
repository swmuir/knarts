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
import org.hl7.knowledgeartifact.r2.Behaviors;
import org.hl7.knowledgeartifact.r2.Conditions;
import org.hl7.knowledgeartifact.r2.ExpressionsType;
import org.hl7.knowledgeartifact.r2.ExternalDataType;
import org.hl7.knowledgeartifact.r2.KnowledgeDocument;
import org.hl7.knowledgeartifact.r2.Metadata;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.Triggers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getExternalData <em>External Data</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl#getActionGroup <em>Action Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeDocumentImpl extends MinimalEObjectImpl.Container implements KnowledgeDocument {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getExternalData() <em>External Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalData()
	 * @generated
	 * @ordered
	 */
	protected ExternalDataType externalData;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected ExpressionsType expressions;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected Triggers triggers;

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
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected Behaviors behaviors;

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
	protected KnowledgeDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getKnowledgeDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataType getExternalData() {
		return externalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalData(ExternalDataType newExternalData, NotificationChain msgs) {
		ExternalDataType oldExternalData = externalData;
		externalData = newExternalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA, oldExternalData, newExternalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalData(ExternalDataType newExternalData) {
		if (newExternalData != externalData) {
			NotificationChain msgs = null;
			if (externalData != null)
				msgs = ((InternalEObject)externalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA, null, msgs);
			if (newExternalData != null)
				msgs = ((InternalEObject)newExternalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA, null, msgs);
			msgs = basicSetExternalData(newExternalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA, newExternalData, newExternalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsType getExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressions(ExpressionsType newExpressions, NotificationChain msgs) {
		ExpressionsType oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS, oldExpressions, newExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressions(ExpressionsType newExpressions) {
		if (newExpressions != expressions) {
			NotificationChain msgs = null;
			if (expressions != null)
				msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS, null, msgs);
			if (newExpressions != null)
				msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS, null, msgs);
			msgs = basicSetExpressions(newExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS, newExpressions, newExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triggers getTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggers(Triggers newTriggers, NotificationChain msgs) {
		Triggers oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS, oldTriggers, newTriggers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(Triggers newTriggers) {
		if (newTriggers != triggers) {
			NotificationChain msgs = null;
			if (triggers != null)
				msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS, null, msgs);
			if (newTriggers != null)
				msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS, null, msgs);
			msgs = basicSetTriggers(newTriggers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS, newTriggers, newTriggers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS, oldConditions, newConditions);
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
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS, newConditions, newConditions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS, oldBehaviors, newBehaviors);
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
				msgs = ((InternalEObject)behaviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS, null, msgs);
			if (newBehaviors != null)
				msgs = ((InternalEObject)newBehaviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS, null, msgs);
			msgs = basicSetBehaviors(newBehaviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS, newBehaviors, newBehaviors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP, oldActionGroup, newActionGroup);
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
				msgs = ((InternalEObject)actionGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP, null, msgs);
			if (newActionGroup != null)
				msgs = ((InternalEObject)newActionGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP, null, msgs);
			msgs = basicSetActionGroup(newActionGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP, newActionGroup, newActionGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.KNOWLEDGE_DOCUMENT__METADATA:
				return basicSetMetadata(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA:
				return basicSetExternalData(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS:
				return basicSetExpressions(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS:
				return basicSetTriggers(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS:
				return basicSetConditions(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS:
				return basicSetBehaviors(null, msgs);
			case R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP:
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
			case R2Package.KNOWLEDGE_DOCUMENT__METADATA:
				return getMetadata();
			case R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA:
				return getExternalData();
			case R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS:
				return getExpressions();
			case R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS:
				return getTriggers();
			case R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS:
				return getConditions();
			case R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS:
				return getBehaviors();
			case R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP:
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
			case R2Package.KNOWLEDGE_DOCUMENT__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA:
				setExternalData((ExternalDataType)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS:
				setExpressions((ExpressionsType)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS:
				setTriggers((Triggers)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS:
				setConditions((Conditions)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS:
				setBehaviors((Behaviors)newValue);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP:
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
			case R2Package.KNOWLEDGE_DOCUMENT__METADATA:
				setMetadata((Metadata)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA:
				setExternalData((ExternalDataType)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS:
				setExpressions((ExpressionsType)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS:
				setTriggers((Triggers)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS:
				setConditions((Conditions)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS:
				setBehaviors((Behaviors)null);
				return;
			case R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP:
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
			case R2Package.KNOWLEDGE_DOCUMENT__METADATA:
				return metadata != null;
			case R2Package.KNOWLEDGE_DOCUMENT__EXTERNAL_DATA:
				return externalData != null;
			case R2Package.KNOWLEDGE_DOCUMENT__EXPRESSIONS:
				return expressions != null;
			case R2Package.KNOWLEDGE_DOCUMENT__TRIGGERS:
				return triggers != null;
			case R2Package.KNOWLEDGE_DOCUMENT__CONDITIONS:
				return conditions != null;
			case R2Package.KNOWLEDGE_DOCUMENT__BEHAVIORS:
				return behaviors != null;
			case R2Package.KNOWLEDGE_DOCUMENT__ACTION_GROUP:
				return actionGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeDocumentImpl
