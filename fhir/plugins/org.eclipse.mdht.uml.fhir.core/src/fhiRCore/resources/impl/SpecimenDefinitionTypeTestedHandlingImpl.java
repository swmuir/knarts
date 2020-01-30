/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Range;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenDefinitionTypeTestedHandling;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Type Tested Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedHandlingImpl#getTemperatureQualifier <em>Temperature Qualifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedHandlingImpl#getTemperatureRange <em>Temperature Range</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedHandlingImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedHandlingImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionTypeTestedHandlingImpl extends BackboneElementImpl implements SpecimenDefinitionTypeTestedHandling {
	/**
	 * The cached value of the '{@link #getTemperatureQualifier() <em>Temperature Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureQualifier()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept temperatureQualifier;

	/**
	 * The cached value of the '{@link #getTemperatureRange() <em>Temperature Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureRange()
	 * @generated
	 * @ordered
	 */
	protected Range temperatureRange;

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
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionTypeTestedHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenDefinitionTypeTestedHandling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTemperatureQualifier() {
		return temperatureQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperatureQualifier(CodeableConcept newTemperatureQualifier, NotificationChain msgs) {
		CodeableConcept oldTemperatureQualifier = temperatureQualifier;
		temperatureQualifier = newTemperatureQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER, oldTemperatureQualifier, newTemperatureQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureQualifier(CodeableConcept newTemperatureQualifier) {
		if (newTemperatureQualifier != temperatureQualifier) {
			NotificationChain msgs = null;
			if (temperatureQualifier != null)
				msgs = ((InternalEObject)temperatureQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER, null, msgs);
			if (newTemperatureQualifier != null)
				msgs = ((InternalEObject)newTemperatureQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER, null, msgs);
			msgs = basicSetTemperatureQualifier(newTemperatureQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER, newTemperatureQualifier, newTemperatureQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getTemperatureRange() {
		return temperatureRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperatureRange(Range newTemperatureRange, NotificationChain msgs) {
		Range oldTemperatureRange = temperatureRange;
		temperatureRange = newTemperatureRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE, oldTemperatureRange, newTemperatureRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureRange(Range newTemperatureRange) {
		if (newTemperatureRange != temperatureRange) {
			NotificationChain msgs = null;
			if (temperatureRange != null)
				msgs = ((InternalEObject)temperatureRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE, null, msgs);
			if (newTemperatureRange != null)
				msgs = ((InternalEObject)newTemperatureRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE, null, msgs);
			msgs = basicSetTemperatureRange(newTemperatureRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE, newTemperatureRange, newTemperatureRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION, oldMaxDuration, newMaxDuration);
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
				msgs = ((InternalEObject)maxDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION, null, msgs);
			if (newMaxDuration != null)
				msgs = ((InternalEObject)newMaxDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION, null, msgs);
			msgs = basicSetMaxDuration(newMaxDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION, newMaxDuration, newMaxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(fhiRCore.dataTypes.String newInstruction, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(fhiRCore.dataTypes.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER:
				return basicSetTemperatureQualifier(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE:
				return basicSetTemperatureRange(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION:
				return basicSetMaxDuration(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION:
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER:
				return getTemperatureQualifier();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE:
				return getTemperatureRange();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION:
				return getMaxDuration();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION:
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER:
				setTemperatureQualifier((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE:
				setTemperatureRange((Range)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION:
				setInstruction((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER:
				setTemperatureQualifier((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE:
				setTemperatureRange((Range)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION:
				setInstruction((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_QUALIFIER:
				return temperatureQualifier != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__TEMPERATURE_RANGE:
				return temperatureRange != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__MAX_DURATION:
				return maxDuration != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionTypeTestedHandlingImpl
