/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Range;
import org.hl7.fhir.SpecimenDefinitionHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getConditionSet <em>Condition Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getTempRange <em>Temp Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getLightExposure <em>Light Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionHandlingImpl extends BackboneElementImpl implements SpecimenDefinitionHandling {
	/**
	 * The cached value of the '{@link #getConditionSet() <em>Condition Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSet()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept conditionSet;

	/**
	 * The cached value of the '{@link #getTempRange() <em>Temp Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempRange()
	 * @generated
	 * @ordered
	 */
	protected Range tempRange;

	/**
	 * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration maxDuration;

	/**
	 * The cached value of the '{@link #getLightExposure() <em>Light Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightExposure()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lightExposure;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinitionHandling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getConditionSet() {
		return conditionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionSet(CodeableConcept newConditionSet, NotificationChain msgs) {
		CodeableConcept oldConditionSet = conditionSet;
		conditionSet = newConditionSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET, oldConditionSet, newConditionSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSet(CodeableConcept newConditionSet) {
		if (newConditionSet != conditionSet) {
			NotificationChain msgs = null;
			if (conditionSet != null)
				msgs = ((InternalEObject)conditionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET, null, msgs);
			if (newConditionSet != null)
				msgs = ((InternalEObject)newConditionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET, null, msgs);
			msgs = basicSetConditionSet(newConditionSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET, newConditionSet, newConditionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getTempRange() {
		return tempRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempRange(Range newTempRange, NotificationChain msgs) {
		Range oldTempRange = tempRange;
		tempRange = newTempRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE, oldTempRange, newTempRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempRange(Range newTempRange) {
		if (newTempRange != tempRange) {
			NotificationChain msgs = null;
			if (tempRange != null)
				msgs = ((InternalEObject)tempRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE, null, msgs);
			if (newTempRange != null)
				msgs = ((InternalEObject)newTempRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE, null, msgs);
			msgs = basicSetTempRange(newTempRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE, newTempRange, newTempRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMaxDuration() {
		return maxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDuration(Duration newMaxDuration, NotificationChain msgs) {
		Duration oldMaxDuration = maxDuration;
		maxDuration = newMaxDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, oldMaxDuration, newMaxDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDuration(Duration newMaxDuration) {
		if (newMaxDuration != maxDuration) {
			NotificationChain msgs = null;
			if (maxDuration != null)
				msgs = ((InternalEObject)maxDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, null, msgs);
			if (newMaxDuration != null)
				msgs = ((InternalEObject)newMaxDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, null, msgs);
			msgs = basicSetMaxDuration(newMaxDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, newMaxDuration, newMaxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLightExposure() {
		return lightExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightExposure(org.hl7.fhir.String newLightExposure, NotificationChain msgs) {
		org.hl7.fhir.String oldLightExposure = lightExposure;
		lightExposure = newLightExposure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE, oldLightExposure, newLightExposure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightExposure(org.hl7.fhir.String newLightExposure) {
		if (newLightExposure != lightExposure) {
			NotificationChain msgs = null;
			if (lightExposure != null)
				msgs = ((InternalEObject)lightExposure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE, null, msgs);
			if (newLightExposure != null)
				msgs = ((InternalEObject)newLightExposure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE, null, msgs);
			msgs = basicSetLightExposure(newLightExposure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE, newLightExposure, newLightExposure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(org.hl7.fhir.String newInstruction, NotificationChain msgs) {
		org.hl7.fhir.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(org.hl7.fhir.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET:
				return basicSetConditionSet(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE:
				return basicSetTempRange(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return basicSetMaxDuration(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE:
				return basicSetLightExposure(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return basicSetInstruction(null, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET:
				return getConditionSet();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE:
				return getTempRange();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return getMaxDuration();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE:
				return getLightExposure();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return getInstruction();
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET:
				setConditionSet((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE:
				setTempRange((Range)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE:
				setLightExposure((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET:
				setConditionSet((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE:
				setTempRange((Range)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE:
				setLightExposure((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)null);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__CONDITION_SET:
				return conditionSet != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMP_RANGE:
				return tempRange != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return maxDuration != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__LIGHT_EXPOSURE:
				return lightExposure != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionHandlingImpl
