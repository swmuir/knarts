/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HazardousDutyWork;
import org.hl7.fhir.OccupationalDataCombatZoneHazardousDuty;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupational Data Combat Zone Hazardous Duty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataCombatZoneHazardousDutyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataCombatZoneHazardousDutyImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataCombatZoneHazardousDutyImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataCombatZoneHazardousDutyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccupationalDataCombatZoneHazardousDutyImpl extends BackboneElementImpl implements OccupationalDataCombatZoneHazardousDuty {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardousDutyWork> code;

	/**
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupationalDataCombatZoneHazardousDutyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOccupationalDataCombatZoneHazardousDuty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardousDutyWork> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<HazardousDutyWork>(HazardousDutyWork.class, this, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(CodeableConcept newValue, NotificationChain msgs) {
		CodeableConcept oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CodeableConcept newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE:
				return basicSetValue(null, msgs);
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
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE:
				return getCode();
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE:
				return getValue();
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
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends HazardousDutyWork>)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE:
				setValue((CodeableConcept)newValue);
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
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE:
				getCode().clear();
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE:
				setValue((CodeableConcept)null);
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
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.OCCUPATIONAL_DATA_COMBAT_ZONE_HAZARDOUS_DUTY__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //OccupationalDataCombatZoneHazardousDutyImpl
