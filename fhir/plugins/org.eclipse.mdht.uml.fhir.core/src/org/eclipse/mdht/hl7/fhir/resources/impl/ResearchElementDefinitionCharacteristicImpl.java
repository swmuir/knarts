/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Duration;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Element Definition Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getDefinitionx <em>Definitionx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getUsageContexts <em>Usage Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveDescription <em>Study Effective Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectivex <em>Study Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveDescription <em>Participant Effective Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectivex <em>Participant Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchElementDefinitionCharacteristicImpl extends BackboneElementImpl implements ResearchElementDefinitionCharacteristic {
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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean exclude;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfMeasure;

	/**
	 * The cached value of the '{@link #getStudyEffectiveDescription() <em>Study Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String studyEffectiveDescription;

	/**
	 * The cached value of the '{@link #getStudyEffectivex() <em>Study Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType studyEffectivex;

	/**
	 * The cached value of the '{@link #getStudyEffectiveTimeFromStart() <em>Study Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration studyEffectiveTimeFromStart;

	/**
	 * The cached value of the '{@link #getStudyEffectiveGroupMeasure() <em>Study Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected Code studyEffectiveGroupMeasure;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveDescription() <em>Participant Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String participantEffectiveDescription;

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
	 * The cached value of the '{@link #getParticipantEffectiveTimeFromStart() <em>Participant Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration participantEffectiveTimeFromStart;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveGroupMeasure() <em>Participant Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected Code participantEffectiveGroupMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchElementDefinitionCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResearchElementDefinitionCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX, oldDefinitionx, newDefinitionx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionx(DataType newDefinitionx) {
		if (newDefinitionx != definitionx) {
			NotificationChain msgs = null;
			if (definitionx != null)
				msgs = ((InternalEObject)definitionx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX, null, msgs);
			if (newDefinitionx != null)
				msgs = ((InternalEObject)newDefinitionx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX, null, msgs);
			msgs = basicSetDefinitionx(newDefinitionx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX, newDefinitionx, newDefinitionx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUsageContexts() {
		if (usageContexts == null) {
			usageContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT);
		}
		return usageContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExclude, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclude(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(CodeableConcept newUnitOfMeasure, NotificationChain msgs) {
		CodeableConcept oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, oldUnitOfMeasure, newUnitOfMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitOfMeasure(CodeableConcept newUnitOfMeasure) {
		if (newUnitOfMeasure != unitOfMeasure) {
			NotificationChain msgs = null;
			if (unitOfMeasure != null)
				msgs = ((InternalEObject)unitOfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, null, msgs);
			if (newUnitOfMeasure != null)
				msgs = ((InternalEObject)newUnitOfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, null, msgs);
			msgs = basicSetUnitOfMeasure(newUnitOfMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, newUnitOfMeasure, newUnitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getStudyEffectiveDescription() {
		return studyEffectiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newStudyEffectiveDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldStudyEffectiveDescription = studyEffectiveDescription;
		studyEffectiveDescription = newStudyEffectiveDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, oldStudyEffectiveDescription, newStudyEffectiveDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newStudyEffectiveDescription) {
		if (newStudyEffectiveDescription != studyEffectiveDescription) {
			NotificationChain msgs = null;
			if (studyEffectiveDescription != null)
				msgs = ((InternalEObject)studyEffectiveDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, null, msgs);
			if (newStudyEffectiveDescription != null)
				msgs = ((InternalEObject)newStudyEffectiveDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, null, msgs);
			msgs = basicSetStudyEffectiveDescription(newStudyEffectiveDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, newStudyEffectiveDescription, newStudyEffectiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getStudyEffectivex() {
		return studyEffectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectivex(DataType newStudyEffectivex, NotificationChain msgs) {
		DataType oldStudyEffectivex = studyEffectivex;
		studyEffectivex = newStudyEffectivex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX, oldStudyEffectivex, newStudyEffectivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectivex(DataType newStudyEffectivex) {
		if (newStudyEffectivex != studyEffectivex) {
			NotificationChain msgs = null;
			if (studyEffectivex != null)
				msgs = ((InternalEObject)studyEffectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX, null, msgs);
			if (newStudyEffectivex != null)
				msgs = ((InternalEObject)newStudyEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX, null, msgs);
			msgs = basicSetStudyEffectivex(newStudyEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX, newStudyEffectivex, newStudyEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getStudyEffectiveTimeFromStart() {
		return studyEffectiveTimeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveTimeFromStart(Duration newStudyEffectiveTimeFromStart, NotificationChain msgs) {
		Duration oldStudyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
		studyEffectiveTimeFromStart = newStudyEffectiveTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, oldStudyEffectiveTimeFromStart, newStudyEffectiveTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveTimeFromStart(Duration newStudyEffectiveTimeFromStart) {
		if (newStudyEffectiveTimeFromStart != studyEffectiveTimeFromStart) {
			NotificationChain msgs = null;
			if (studyEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)studyEffectiveTimeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, null, msgs);
			if (newStudyEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)newStudyEffectiveTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, null, msgs);
			msgs = basicSetStudyEffectiveTimeFromStart(newStudyEffectiveTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, newStudyEffectiveTimeFromStart, newStudyEffectiveTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getStudyEffectiveGroupMeasure() {
		return studyEffectiveGroupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveGroupMeasure(Code newStudyEffectiveGroupMeasure, NotificationChain msgs) {
		Code oldStudyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
		studyEffectiveGroupMeasure = newStudyEffectiveGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, oldStudyEffectiveGroupMeasure, newStudyEffectiveGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveGroupMeasure(Code newStudyEffectiveGroupMeasure) {
		if (newStudyEffectiveGroupMeasure != studyEffectiveGroupMeasure) {
			NotificationChain msgs = null;
			if (studyEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)studyEffectiveGroupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, null, msgs);
			if (newStudyEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)newStudyEffectiveGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, null, msgs);
			msgs = basicSetStudyEffectiveGroupMeasure(newStudyEffectiveGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, newStudyEffectiveGroupMeasure, newStudyEffectiveGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getParticipantEffectiveDescription() {
		return participantEffectiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newParticipantEffectiveDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldParticipantEffectiveDescription = participantEffectiveDescription;
		participantEffectiveDescription = newParticipantEffectiveDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, oldParticipantEffectiveDescription, newParticipantEffectiveDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newParticipantEffectiveDescription) {
		if (newParticipantEffectiveDescription != participantEffectiveDescription) {
			NotificationChain msgs = null;
			if (participantEffectiveDescription != null)
				msgs = ((InternalEObject)participantEffectiveDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, null, msgs);
			if (newParticipantEffectiveDescription != null)
				msgs = ((InternalEObject)newParticipantEffectiveDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, null, msgs);
			msgs = basicSetParticipantEffectiveDescription(newParticipantEffectiveDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, newParticipantEffectiveDescription, newParticipantEffectiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, oldParticipantEffectivex, newParticipantEffectivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectivex(DataType newParticipantEffectivex) {
		if (newParticipantEffectivex != participantEffectivex) {
			NotificationChain msgs = null;
			if (participantEffectivex != null)
				msgs = ((InternalEObject)participantEffectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, null, msgs);
			if (newParticipantEffectivex != null)
				msgs = ((InternalEObject)newParticipantEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, null, msgs);
			msgs = basicSetParticipantEffectivex(newParticipantEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX, newParticipantEffectivex, newParticipantEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getParticipantEffectiveTimeFromStart() {
		return participantEffectiveTimeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveTimeFromStart(Duration newParticipantEffectiveTimeFromStart, NotificationChain msgs) {
		Duration oldParticipantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
		participantEffectiveTimeFromStart = newParticipantEffectiveTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, oldParticipantEffectiveTimeFromStart, newParticipantEffectiveTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveTimeFromStart(Duration newParticipantEffectiveTimeFromStart) {
		if (newParticipantEffectiveTimeFromStart != participantEffectiveTimeFromStart) {
			NotificationChain msgs = null;
			if (participantEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)participantEffectiveTimeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, null, msgs);
			if (newParticipantEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)newParticipantEffectiveTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, null, msgs);
			msgs = basicSetParticipantEffectiveTimeFromStart(newParticipantEffectiveTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, newParticipantEffectiveTimeFromStart, newParticipantEffectiveTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getParticipantEffectiveGroupMeasure() {
		return participantEffectiveGroupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveGroupMeasure(Code newParticipantEffectiveGroupMeasure, NotificationChain msgs) {
		Code oldParticipantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
		participantEffectiveGroupMeasure = newParticipantEffectiveGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, oldParticipantEffectiveGroupMeasure, newParticipantEffectiveGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveGroupMeasure(Code newParticipantEffectiveGroupMeasure) {
		if (newParticipantEffectiveGroupMeasure != participantEffectiveGroupMeasure) {
			NotificationChain msgs = null;
			if (participantEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)participantEffectiveGroupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, null, msgs);
			if (newParticipantEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)newParticipantEffectiveGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, null, msgs);
			msgs = basicSetParticipantEffectiveGroupMeasure(newParticipantEffectiveGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, newParticipantEffectiveGroupMeasure, newParticipantEffectiveGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX:
				return basicSetDefinitionx(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return ((InternalEList<?>)getUsageContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return basicSetStudyEffectiveDescription(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX:
				return basicSetStudyEffectivex(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return basicSetStudyEffectiveTimeFromStart(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return basicSetStudyEffectiveGroupMeasure(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return basicSetParticipantEffectiveDescription(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return basicSetParticipantEffectivex(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return basicSetParticipantEffectiveTimeFromStart(null, msgs);
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return basicSetParticipantEffectiveGroupMeasure(null, msgs);
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
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX:
				return getDefinitionx();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return getUsageContexts();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return getStudyEffectiveDescription();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX:
				return getStudyEffectivex();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return getStudyEffectiveTimeFromStart();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return getStudyEffectiveGroupMeasure();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return getParticipantEffectiveDescription();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return getParticipantEffectivex();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return getParticipantEffectiveTimeFromStart();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return getParticipantEffectiveGroupMeasure();
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
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX:
				setDefinitionx((DataType)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContexts().clear();
				getUsageContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				setExclude((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				setStudyEffectiveDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX:
				setStudyEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				setStudyEffectiveTimeFromStart((Duration)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				setStudyEffectiveGroupMeasure((Code)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				setParticipantEffectiveDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				setParticipantEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				setParticipantEffectiveTimeFromStart((Duration)newValue);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				setParticipantEffectiveGroupMeasure((Code)newValue);
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
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX:
				setDefinitionx((DataType)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContexts().clear();
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				setExclude((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				setStudyEffectiveDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX:
				setStudyEffectivex((DataType)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				setStudyEffectiveTimeFromStart((Duration)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				setStudyEffectiveGroupMeasure((Code)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				setParticipantEffectiveDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				setParticipantEffectivex((DataType)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				setParticipantEffectiveTimeFromStart((Duration)null);
				return;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				setParticipantEffectiveGroupMeasure((Code)null);
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
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITIONX:
				return definitionx != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return usageContexts != null && !usageContexts.isEmpty();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return unitOfMeasure != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return studyEffectiveDescription != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVEX:
				return studyEffectivex != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return studyEffectiveTimeFromStart != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return studyEffectiveGroupMeasure != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return participantEffectiveDescription != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX:
				return participantEffectivex != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return participantEffectiveTimeFromStart != null;
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return participantEffectiveGroupMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchElementDefinitionCharacteristicImpl
