/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getDurationUnits <em>Duration Units</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getPeriodUnits <em>Period Units</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingRepeatImpl extends BackboneElementImpl implements TimingRepeat {
	/**
	 * The cached value of the '{@link #getBoundsx() <em>Boundsx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsx()
	 * @generated
	 * @ordered
	 */
	protected DataType boundsx;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer count;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal durationMax;

	/**
	 * The cached value of the '{@link #getDurationUnits() <em>Duration Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnits()
	 * @generated
	 * @ordered
	 */
	protected Code durationUnits;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer frequency;

	/**
	 * The cached value of the '{@link #getFrequencyMax() <em>Frequency Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer frequencyMax;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Decimal period;

	/**
	 * The cached value of the '{@link #getPeriodMax() <em>Period Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal periodMax;

	/**
	 * The cached value of the '{@link #getPeriodUnits() <em>Period Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUnits()
	 * @generated
	 * @ordered
	 */
	protected Code periodUnits;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Code when;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.TIMING_REPEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBoundsx() {
		if (boundsx != null && boundsx.eIsProxy()) {
			InternalEObject oldBoundsx = (InternalEObject)boundsx;
			boundsx = (DataType)eResolveProxy(oldBoundsx);
			if (boundsx != oldBoundsx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__BOUNDSX, oldBoundsx, boundsx));
			}
		}
		return boundsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBoundsx() {
		return boundsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsx(DataType newBoundsx) {
		DataType oldBoundsx = boundsx;
		boundsx = newBoundsx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__BOUNDSX, oldBoundsx, boundsx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldCount);
			if (count != oldCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.eclipse.mdht.uml.fhir.core.datatype.Integer newCount) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (Decimal)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Decimal newDuration) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDurationMax() {
		if (durationMax != null && durationMax.eIsProxy()) {
			InternalEObject oldDurationMax = (InternalEObject)durationMax;
			durationMax = (Decimal)eResolveProxy(oldDurationMax);
			if (durationMax != oldDurationMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX, oldDurationMax, durationMax));
			}
		}
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMax(Decimal newDurationMax) {
		Decimal oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX, oldDurationMax, durationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDurationUnits() {
		if (durationUnits != null && durationUnits.eIsProxy()) {
			InternalEObject oldDurationUnits = (InternalEObject)durationUnits;
			durationUnits = (Code)eResolveProxy(oldDurationUnits);
			if (durationUnits != oldDurationUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS, oldDurationUnits, durationUnits));
			}
		}
		return durationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDurationUnits() {
		return durationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationUnits(Code newDurationUnits) {
		Code oldDurationUnits = durationUnits;
		durationUnits = newDurationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS, oldDurationUnits, durationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getFrequency() {
		if (frequency != null && frequency.eIsProxy()) {
			InternalEObject oldFrequency = (InternalEObject)frequency;
			frequency = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldFrequency);
			if (frequency != oldFrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__FREQUENCY, oldFrequency, frequency));
			}
		}
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(org.eclipse.mdht.uml.fhir.core.datatype.Integer newFrequency) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getFrequencyMax() {
		if (frequencyMax != null && frequencyMax.eIsProxy()) {
			InternalEObject oldFrequencyMax = (InternalEObject)frequencyMax;
			frequencyMax = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldFrequencyMax);
			if (frequencyMax != oldFrequencyMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX, oldFrequencyMax, frequencyMax));
			}
		}
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetFrequencyMax() {
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyMax(org.eclipse.mdht.uml.fhir.core.datatype.Integer newFrequencyMax) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldFrequencyMax = frequencyMax;
		frequencyMax = newFrequencyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX, oldFrequencyMax, frequencyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Decimal)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Decimal newPeriod) {
		Decimal oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriodMax() {
		if (periodMax != null && periodMax.eIsProxy()) {
			InternalEObject oldPeriodMax = (InternalEObject)periodMax;
			periodMax = (Decimal)eResolveProxy(oldPeriodMax);
			if (periodMax != oldPeriodMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX, oldPeriodMax, periodMax));
			}
		}
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPeriodMax() {
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodMax(Decimal newPeriodMax) {
		Decimal oldPeriodMax = periodMax;
		periodMax = newPeriodMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX, oldPeriodMax, periodMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPeriodUnits() {
		if (periodUnits != null && periodUnits.eIsProxy()) {
			InternalEObject oldPeriodUnits = (InternalEObject)periodUnits;
			periodUnits = (Code)eResolveProxy(oldPeriodUnits);
			if (periodUnits != oldPeriodUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS, oldPeriodUnits, periodUnits));
			}
		}
		return periodUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPeriodUnits() {
		return periodUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodUnits(Code newPeriodUnits) {
		Code oldPeriodUnits = periodUnits;
		periodUnits = newPeriodUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS, oldPeriodUnits, periodUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject)when;
			when = (Code)eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.TIMING_REPEAT__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Code newWhen) {
		Code oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.TIMING_REPEAT__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.TIMING_REPEAT__BOUNDSX:
				if (resolve) return getBoundsx();
				return basicGetBoundsx();
			case FhirDatatypePackage.TIMING_REPEAT__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
			case FhirDatatypePackage.TIMING_REPEAT__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX:
				if (resolve) return getDurationMax();
				return basicGetDurationMax();
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS:
				if (resolve) return getDurationUnits();
				return basicGetDurationUnits();
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY:
				if (resolve) return getFrequency();
				return basicGetFrequency();
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX:
				if (resolve) return getFrequencyMax();
				return basicGetFrequencyMax();
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX:
				if (resolve) return getPeriodMax();
				return basicGetPeriodMax();
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS:
				if (resolve) return getPeriodUnits();
				return basicGetPeriodUnits();
			case FhirDatatypePackage.TIMING_REPEAT__WHEN:
				if (resolve) return getWhen();
				return basicGetWhen();
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
			case FhirDatatypePackage.TIMING_REPEAT__BOUNDSX:
				setBoundsx((DataType)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX:
				setDurationMax((Decimal)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS:
				setDurationUnits((Code)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS:
				setPeriodUnits((Code)newValue);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__WHEN:
				setWhen((Code)newValue);
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
			case FhirDatatypePackage.TIMING_REPEAT__BOUNDSX:
				setBoundsx((DataType)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX:
				setDurationMax((Decimal)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS:
				setDurationUnits((Code)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS:
				setPeriodUnits((Code)null);
				return;
			case FhirDatatypePackage.TIMING_REPEAT__WHEN:
				setWhen((Code)null);
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
			case FhirDatatypePackage.TIMING_REPEAT__BOUNDSX:
				return boundsx != null;
			case FhirDatatypePackage.TIMING_REPEAT__COUNT:
				return count != null;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION:
				return duration != null;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_MAX:
				return durationMax != null;
			case FhirDatatypePackage.TIMING_REPEAT__DURATION_UNITS:
				return durationUnits != null;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY:
				return frequency != null;
			case FhirDatatypePackage.TIMING_REPEAT__FREQUENCY_MAX:
				return frequencyMax != null;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD:
				return period != null;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_MAX:
				return periodMax != null;
			case FhirDatatypePackage.TIMING_REPEAT__PERIOD_UNITS:
				return periodUnits != null;
			case FhirDatatypePackage.TIMING_REPEAT__WHEN:
				return when != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingRepeatImpl
