/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.OccupationalDataDuration;
import org.hl7.fhir.OccupationalDataIndustry;
import org.hl7.fhir.OccupationalDataUsualOccupation;
import org.hl7.fhir.Period;
import org.hl7.fhir.UsualOccupation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupational Data Usual Occupation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataUsualOccupationImpl#getIndustry <em>Industry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccupationalDataUsualOccupationImpl extends BackboneElementImpl implements OccupationalDataUsualOccupation {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected UsualOccupation code;

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
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataDuration duration;

	/**
	 * The cached value of the '{@link #getIndustry() <em>Industry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustry()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataIndustry industry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupationalDataUsualOccupationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOccupationalDataUsualOccupation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsualOccupation getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(UsualOccupation newCode, NotificationChain msgs) {
		UsualOccupation oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(UsualOccupation newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
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
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataDuration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(OccupationalDataDuration newDuration, NotificationChain msgs) {
		OccupationalDataDuration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(OccupationalDataDuration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataIndustry getIndustry() {
		return industry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndustry(OccupationalDataIndustry newIndustry, NotificationChain msgs) {
		OccupationalDataIndustry oldIndustry = industry;
		industry = newIndustry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY, oldIndustry, newIndustry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndustry(OccupationalDataIndustry newIndustry) {
		if (newIndustry != industry) {
			NotificationChain msgs = null;
			if (industry != null)
				msgs = ((InternalEObject)industry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY, null, msgs);
			if (newIndustry != null)
				msgs = ((InternalEObject)newIndustry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY, null, msgs);
			msgs = basicSetIndustry(newIndustry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY, newIndustry, newIndustry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY:
				return basicSetIndustry(null, msgs);
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
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE:
				return getCode();
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE:
				return getValue();
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION:
				return getDuration();
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY:
				return getIndustry();
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
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE:
				setCode((UsualOccupation)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE:
				setValue((CodeableConcept)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION:
				setDuration((OccupationalDataDuration)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY:
				setIndustry((OccupationalDataIndustry)newValue);
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
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE:
				setCode((UsualOccupation)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE:
				setValue((CodeableConcept)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION:
				setDuration((OccupationalDataDuration)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY:
				setIndustry((OccupationalDataIndustry)null);
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
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__CODE:
				return code != null;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__VALUE:
				return value != null;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__DURATION:
				return duration != null;
			case FhirPackage.OCCUPATIONAL_DATA_USUAL_OCCUPATION__INDUSTRY:
				return industry != null;
		}
		return super.eIsSet(featureID);
	}

} //OccupationalDataUsualOccupationImpl
