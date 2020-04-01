/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

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
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Time;
import org.eclipse.mdht.hl7.fhir.dataTypes.TimingElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getDayOfWeeks <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getTimeOfDaies <em>Time Of Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getWhens <em>When</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.TimingElement1Impl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingElement1Impl extends ElementImpl implements TimingElement1 {
	/**
	 * The cached value of the '{@link #getBoundsx() <em>Boundsx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsx()
	 * @generated
	 * @ordered
	 */
	protected DataType boundsx;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt count;

	/**
	 * The cached value of the '{@link #getCountMax() <em>Count Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountMax()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt countMax;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal durationMax;

	/**
	 * The cached value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected Code durationUnit;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frequency;

	/**
	 * The cached value of the '{@link #getFrequencyMax() <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMax()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frequencyMax;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Decimal period;

	/**
	 * The cached value of the '{@link #getPeriodMax() <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal periodMax;

	/**
	 * The cached value of the '{@link #getPeriodUnit() <em>Period Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUnit()
	 * @generated
	 * @ordered
	 */
	protected Code periodUnit;

	/**
	 * The cached value of the '{@link #getDayOfWeeks() <em>Day Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> dayOfWeeks;

	/**
	 * The cached value of the '{@link #getTimeOfDaies() <em>Time Of Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDaies()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> timeOfDaies;

	/**
	 * The cached value of the '{@link #getWhens() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhens()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> whens;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.TIMING_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getBoundsx() {
		return boundsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundsx(DataType newBoundsx, NotificationChain msgs) {
		DataType oldBoundsx = boundsx;
		boundsx = newBoundsx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, oldBoundsx, newBoundsx);
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
	public void setBoundsx(DataType newBoundsx) {
		if (newBoundsx != boundsx) {
			NotificationChain msgs = null;
			if (boundsx != null)
				msgs = ((InternalEObject)boundsx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, null, msgs);
			if (newBoundsx != null)
				msgs = ((InternalEObject)newBoundsx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, null, msgs);
			msgs = basicSetBoundsx(newBoundsx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, newBoundsx, newBoundsx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(PositiveInt newCount, NotificationChain msgs) {
		PositiveInt oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT, oldCount, newCount);
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
	public void setCount(PositiveInt newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getCountMax() {
		return countMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountMax(PositiveInt newCountMax, NotificationChain msgs) {
		PositiveInt oldCountMax = countMax;
		countMax = newCountMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, oldCountMax, newCountMax);
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
	public void setCountMax(PositiveInt newCountMax) {
		if (newCountMax != countMax) {
			NotificationChain msgs = null;
			if (countMax != null)
				msgs = ((InternalEObject)countMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, null, msgs);
			if (newCountMax != null)
				msgs = ((InternalEObject)newCountMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, null, msgs);
			msgs = basicSetCountMax(newCountMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, newCountMax, newCountMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Decimal newDuration, NotificationChain msgs) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION, oldDuration, newDuration);
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
	public void setDuration(Decimal newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationMax(Decimal newDurationMax, NotificationChain msgs) {
		Decimal oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, oldDurationMax, newDurationMax);
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
	public void setDurationMax(Decimal newDurationMax) {
		if (newDurationMax != durationMax) {
			NotificationChain msgs = null;
			if (durationMax != null)
				msgs = ((InternalEObject)durationMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, null, msgs);
			if (newDurationMax != null)
				msgs = ((InternalEObject)newDurationMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, null, msgs);
			msgs = basicSetDurationMax(newDurationMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, newDurationMax, newDurationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getDurationUnit() {
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationUnit(Code newDurationUnit, NotificationChain msgs) {
		Code oldDurationUnit = durationUnit;
		durationUnit = newDurationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, oldDurationUnit, newDurationUnit);
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
	public void setDurationUnit(Code newDurationUnit) {
		if (newDurationUnit != durationUnit) {
			NotificationChain msgs = null;
			if (durationUnit != null)
				msgs = ((InternalEObject)durationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, null, msgs);
			if (newDurationUnit != null)
				msgs = ((InternalEObject)newDurationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, null, msgs);
			msgs = basicSetDurationUnit(newDurationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, newDurationUnit, newDurationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(PositiveInt newFrequency, NotificationChain msgs) {
		PositiveInt oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, oldFrequency, newFrequency);
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
	public void setFrequency(PositiveInt newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFrequencyMax() {
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyMax(PositiveInt newFrequencyMax, NotificationChain msgs) {
		PositiveInt oldFrequencyMax = frequencyMax;
		frequencyMax = newFrequencyMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, oldFrequencyMax, newFrequencyMax);
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
	public void setFrequencyMax(PositiveInt newFrequencyMax) {
		if (newFrequencyMax != frequencyMax) {
			NotificationChain msgs = null;
			if (frequencyMax != null)
				msgs = ((InternalEObject)frequencyMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, null, msgs);
			if (newFrequencyMax != null)
				msgs = ((InternalEObject)newFrequencyMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, null, msgs);
			msgs = basicSetFrequencyMax(newFrequencyMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, newFrequencyMax, newFrequencyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Decimal newPeriod, NotificationChain msgs) {
		Decimal oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Decimal newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPeriodMax() {
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodMax(Decimal newPeriodMax, NotificationChain msgs) {
		Decimal oldPeriodMax = periodMax;
		periodMax = newPeriodMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, oldPeriodMax, newPeriodMax);
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
	public void setPeriodMax(Decimal newPeriodMax) {
		if (newPeriodMax != periodMax) {
			NotificationChain msgs = null;
			if (periodMax != null)
				msgs = ((InternalEObject)periodMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, null, msgs);
			if (newPeriodMax != null)
				msgs = ((InternalEObject)newPeriodMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, null, msgs);
			msgs = basicSetPeriodMax(newPeriodMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, newPeriodMax, newPeriodMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPeriodUnit() {
		return periodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodUnit(Code newPeriodUnit, NotificationChain msgs) {
		Code oldPeriodUnit = periodUnit;
		periodUnit = newPeriodUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, oldPeriodUnit, newPeriodUnit);
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
	public void setPeriodUnit(Code newPeriodUnit) {
		if (newPeriodUnit != periodUnit) {
			NotificationChain msgs = null;
			if (periodUnit != null)
				msgs = ((InternalEObject)periodUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, null, msgs);
			if (newPeriodUnit != null)
				msgs = ((InternalEObject)newPeriodUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, null, msgs);
			msgs = basicSetPeriodUnit(newPeriodUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, newPeriodUnit, newPeriodUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getDayOfWeeks() {
		if (dayOfWeeks == null) {
			dayOfWeeks = new EObjectContainmentEList<Code>(Code.class, this, DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK);
		}
		return dayOfWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Time> getTimeOfDaies() {
		if (timeOfDaies == null) {
			timeOfDaies = new EObjectContainmentEList<Time>(Time.class, this, DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY);
		}
		return timeOfDaies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getWhens() {
		if (whens == null) {
			whens = new EObjectContainmentEList<Code>(Code.class, this, DataTypesPackage.TIMING_ELEMENT1__WHEN);
		}
		return whens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(UnsignedInt newOffset, NotificationChain msgs) {
		UnsignedInt oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__OFFSET, oldOffset, newOffset);
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
	public void setOffset(UnsignedInt newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TIMING_ELEMENT1__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				return basicSetBoundsx(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				return basicSetCount(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				return basicSetCountMax(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				return basicSetDuration(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				return basicSetDurationMax(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				return basicSetDurationUnit(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				return basicSetFrequencyMax(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				return basicSetPeriod(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				return basicSetPeriodMax(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				return basicSetPeriodUnit(null, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				return ((InternalEList<?>)getDayOfWeeks()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDaies()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				return ((InternalEList<?>)getWhens()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				return basicSetOffset(null, msgs);
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				return getBoundsx();
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				return getCount();
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				return getCountMax();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				return getDuration();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				return getDurationMax();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				return getDurationUnit();
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				return getFrequency();
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				return getFrequencyMax();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				return getPeriod();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				return getPeriodMax();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				return getPeriodUnit();
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				return getDayOfWeeks();
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				return getTimeOfDaies();
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				return getWhens();
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				return getOffset();
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				setBoundsx((DataType)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				setCount((PositiveInt)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				setCountMax((PositiveInt)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				setDuration((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				setDurationMax((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				setDurationUnit((Code)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				setFrequency((PositiveInt)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				setFrequencyMax((PositiveInt)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				setPeriodMax((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				setPeriodUnit((Code)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				getDayOfWeeks().clear();
				getDayOfWeeks().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				getTimeOfDaies().clear();
				getTimeOfDaies().addAll((Collection<? extends Time>)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				getWhens().clear();
				getWhens().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				setOffset((UnsignedInt)newValue);
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				setBoundsx((DataType)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				setCount((PositiveInt)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				setCountMax((PositiveInt)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				setDuration((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				setDurationMax((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				setDurationUnit((Code)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				setFrequency((PositiveInt)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				setFrequencyMax((PositiveInt)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				setPeriod((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				setPeriodMax((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				setPeriodUnit((Code)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				getDayOfWeeks().clear();
				return;
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				getTimeOfDaies().clear();
				return;
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				getWhens().clear();
				return;
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				setOffset((UnsignedInt)null);
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				return boundsx != null;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				return count != null;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				return countMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				return duration != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				return durationMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				return durationUnit != null;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				return frequency != null;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				return frequencyMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				return period != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				return periodMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				return periodUnit != null;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				return dayOfWeeks != null && !dayOfWeeks.isEmpty();
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				return timeOfDaies != null && !timeOfDaies.isEmpty();
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				return whens != null && !whens.isEmpty();
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingElement1Impl
