/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Period;

import fhiRCore.resources.AuditEvent;
import fhiRCore.resources.AuditEventAgent;
import fhiRCore.resources.AuditEventEntity;
import fhiRCore.resources.AuditEventSource;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getPurposeOfEvents <em>Purpose Of Event</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getAgents <em>Agent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventImpl#getEntities <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventImpl extends DomainResourceImpl implements AuditEvent {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subtypes;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Code action;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getOutcomeDesc() <em>Outcome Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeDesc()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String outcomeDesc;

	/**
	 * The cached value of the '{@link #getPurposeOfEvents() <em>Purpose Of Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> purposeOfEvents;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventAgent> agents;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSource source;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventEntity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAuditEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.AUDIT_EVENT__SUBTYPE);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Code newAction, NotificationChain msgs) {
		Code oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Code newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(Instant newRecorded, NotificationChain msgs) {
		Instant oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(Instant newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Code newOutcome, NotificationChain msgs) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getOutcomeDesc() {
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcomeDesc(fhiRCore.dataTypes.String newOutcomeDesc, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldOutcomeDesc = outcomeDesc;
		outcomeDesc = newOutcomeDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, oldOutcomeDesc, newOutcomeDesc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcomeDesc(fhiRCore.dataTypes.String newOutcomeDesc) {
		if (newOutcomeDesc != outcomeDesc) {
			NotificationChain msgs = null;
			if (outcomeDesc != null)
				msgs = ((InternalEObject)outcomeDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, null, msgs);
			if (newOutcomeDesc != null)
				msgs = ((InternalEObject)newOutcomeDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, null, msgs);
			msgs = basicSetOutcomeDesc(newOutcomeDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, newOutcomeDesc, newOutcomeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPurposeOfEvents() {
		if (purposeOfEvents == null) {
			purposeOfEvents = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT);
		}
		return purposeOfEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<AuditEventAgent>(AuditEventAgent.class, this, ResourcesPackage.AUDIT_EVENT__AGENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AuditEventSource newSource, NotificationChain msgs) {
		AuditEventSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AuditEventSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<AuditEventEntity>(AuditEventEntity.class, this, ResourcesPackage.AUDIT_EVENT__ENTITY);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				return ((InternalEList<?>)getSubtypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				return basicSetAction(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				return basicSetRecorded(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				return basicSetOutcomeDesc(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				return ((InternalEList<?>)getPurposeOfEvents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				return getType();
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				return getSubtypes();
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				return getAction();
			case ResourcesPackage.AUDIT_EVENT__PERIOD:
				return getPeriod();
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				return getRecorded();
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				return getOutcome();
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				return getOutcomeDesc();
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				return getPurposeOfEvents();
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return getAgents();
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return getSource();
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return getEntities();
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				setAction((Code)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
				getPurposeOfEvents().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				getAgents().clear();
				getAgents().addAll((Collection<? extends AuditEventAgent>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				getEntities().clear();
				getEntities().addAll((Collection<? extends AuditEventEntity>)newValue);
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				getSubtypes().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				setAction((Code)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((Code)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				getAgents().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				getEntities().clear();
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				return type != null;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				return subtypes != null && !subtypes.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				return action != null;
			case ResourcesPackage.AUDIT_EVENT__PERIOD:
				return period != null;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				return recorded != null;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				return outcome != null;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				return outcomeDesc != null;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				return purposeOfEvents != null && !purposeOfEvents.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return agents != null && !agents.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return source != null;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventImpl
