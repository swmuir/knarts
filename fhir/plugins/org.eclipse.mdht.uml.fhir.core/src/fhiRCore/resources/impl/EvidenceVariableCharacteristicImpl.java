/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.EvidenceVariableCharacteristic;
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
 * An implementation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getDefinitionx <em>Definitionx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getUsageContexts <em>Usage Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getParticipantEffectivex <em>Participant Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableCharacteristicImpl#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableCharacteristicImpl extends BackboneElementImpl implements EvidenceVariableCharacteristic {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getDefinitionx() <em>Definitionx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionx()
	 * @generated
	 * @ordered
	 */
	protected DataType definitionx;

	/**
	 * The cached value of the '{@link #getUsageContexts() <em>Usage Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> usageContexts;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean exclude;

	/**
	 * The cached value of the '{@link #getParticipantEffectivex() <em>Participant Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType participantEffectivex;

	/**
	 * The cached value of the '{@link #getTimeFromStart() <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration timeFromStart;

	/**
	 * The cached value of the '{@link #getGroupMeasure() <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected Code groupMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEvidenceVariableCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDefinitionx() {
		return definitionx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionx(DataType newDefinitionx, NotificationChain msgs) {
		DataType oldDefinitionx = definitionx;
		definitionx = newDefinitionx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX, oldDefinitionx, newDefinitionx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionx(DataType newDefinitionx) {
		if (newDefinitionx != definitionx) {
			NotificationChain msgs = null;
			if (definitionx != null)
				msgs = ((InternalEObject)definitionx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX, null, msgs);
			if (newDefinitionx != null)
				msgs = ((InternalEObject)newDefinitionx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX, null, msgs);
			msgs = basicSetDefinitionx(newDefinitionx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX, newDefinitionx, newDefinitionx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUsageContexts() {
		if (usageContexts == null) {
			usageContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT);
		}
		return usageContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(fhiRCore.dataTypes.Boolean newExclude, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(fhiRCore.dataTypes.Boolean newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getParticipantEffectivex() {
		return participantEffectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectivex(DataType newParticipantEffectivex, NotificationChain msgs) {
		DataType oldParticipantEffectivex = participantEffectivex;
		participantEffectivex = newParticipantEffectivex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, oldParticipantEffectivex, newParticipantEffectivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantEffectivex(DataType newParticipantEffectivex) {
		if (newParticipantEffectivex != participantEffectivex) {
			NotificationChain msgs = null;
			if (participantEffectivex != null)
				msgs = ((InternalEObject)participantEffectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, null, msgs);
			if (newParticipantEffectivex != null)
				msgs = ((InternalEObject)newParticipantEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, null, msgs);
			msgs = basicSetParticipantEffectivex(newParticipantEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, newParticipantEffectivex, newParticipantEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeFromStart() {
		return timeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeFromStart(Duration newTimeFromStart, NotificationChain msgs) {
		Duration oldTimeFromStart = timeFromStart;
		timeFromStart = newTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, oldTimeFromStart, newTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFromStart(Duration newTimeFromStart) {
		if (newTimeFromStart != timeFromStart) {
			NotificationChain msgs = null;
			if (timeFromStart != null)
				msgs = ((InternalEObject)timeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			if (newTimeFromStart != null)
				msgs = ((InternalEObject)newTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			msgs = basicSetTimeFromStart(newTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, newTimeFromStart, newTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGroupMeasure() {
		return groupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupMeasure(Code newGroupMeasure, NotificationChain msgs) {
		Code oldGroupMeasure = groupMeasure;
		groupMeasure = newGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, oldGroupMeasure, newGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupMeasure(Code newGroupMeasure) {
		if (newGroupMeasure != groupMeasure) {
			NotificationChain msgs = null;
			if (groupMeasure != null)
				msgs = ((InternalEObject)groupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			if (newGroupMeasure != null)
				msgs = ((InternalEObject)newGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			msgs = basicSetGroupMeasure(newGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, newGroupMeasure, newGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX:
				return basicSetDefinitionx(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return ((InternalEList<?>)getUsageContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return basicSetParticipantEffectivex(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return basicSetTimeFromStart(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return basicSetGroupMeasure(null, msgs);
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
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX:
				return getDefinitionx();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return getUsageContexts();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return getParticipantEffectivex();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return getTimeFromStart();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return getGroupMeasure();
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
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX:
				setDefinitionx((DataType)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContexts().clear();
				getUsageContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				setParticipantEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((Duration)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((Code)newValue);
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
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX:
				setDefinitionx((DataType)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContexts().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				setParticipantEffectivex((DataType)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((Duration)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((Code)null);
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
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX:
				return definitionx != null;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return usageContexts != null && !usageContexts.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return participantEffectivex != null;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return timeFromStart != null;
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return groupMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableCharacteristicImpl
