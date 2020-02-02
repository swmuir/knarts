/**
 */
package org.hl7.cdsdt.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.CalendarCycle;
import org.hl7.cdsdt.r2.INT;
import org.hl7.cdsdt.r2.IVLTS;
import org.hl7.cdsdt.r2.PIVLTS;
import org.hl7.cdsdt.r2.PQ;
import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.RTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIVLTS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl#isIsFlexible <em>Is Flexible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIVLTSImpl extends QTYImpl implements PIVLTS {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected IVLTS phase;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected PQ period;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected RTO frequency;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected INT count;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final CalendarCycle ALIGNMENT_EDEFAULT = CalendarCycle.CY;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected CalendarCycle alignment = ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentESet;

	/**
	 * The default value of the '{@link #isIsFlexible() <em>Is Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlexible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FLEXIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFlexible() <em>Is Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlexible()
	 * @generated
	 * @ordered
	 */
	protected boolean isFlexible = IS_FLEXIBLE_EDEFAULT;

	/**
	 * This is true if the Is Flexible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isFlexibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIVLTSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.PIVLTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLTS getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(IVLTS newPhase, NotificationChain msgs) {
		IVLTS oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(IVLTS newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(PQ newPeriod, NotificationChain msgs) {
		PQ oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(PQ newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(RTO newFrequency, NotificationChain msgs) {
		RTO oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__FREQUENCY, oldFrequency, newFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(RTO newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(INT newCount, NotificationChain msgs) {
		INT oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(INT newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PIVLTS__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(CalendarCycle newAlignment) {
		CalendarCycle oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		CalendarCycle oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.PIVLTS__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT, oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignment() {
		return alignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFlexible() {
		return isFlexible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFlexible(boolean newIsFlexible) {
		boolean oldIsFlexible = isFlexible;
		isFlexible = newIsFlexible;
		boolean oldIsFlexibleESet = isFlexibleESet;
		isFlexibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PIVLTS__IS_FLEXIBLE, oldIsFlexible, isFlexible, !oldIsFlexibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsFlexible() {
		boolean oldIsFlexible = isFlexible;
		boolean oldIsFlexibleESet = isFlexibleESet;
		isFlexible = IS_FLEXIBLE_EDEFAULT;
		isFlexibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.PIVLTS__IS_FLEXIBLE, oldIsFlexible, IS_FLEXIBLE_EDEFAULT, oldIsFlexibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsFlexible() {
		return isFlexibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.PIVLTS__PHASE:
				return basicSetPhase(null, msgs);
			case R2Package.PIVLTS__PERIOD:
				return basicSetPeriod(null, msgs);
			case R2Package.PIVLTS__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case R2Package.PIVLTS__COUNT:
				return basicSetCount(null, msgs);
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
			case R2Package.PIVLTS__PHASE:
				return getPhase();
			case R2Package.PIVLTS__PERIOD:
				return getPeriod();
			case R2Package.PIVLTS__FREQUENCY:
				return getFrequency();
			case R2Package.PIVLTS__COUNT:
				return getCount();
			case R2Package.PIVLTS__ALIGNMENT:
				return getAlignment();
			case R2Package.PIVLTS__IS_FLEXIBLE:
				return isIsFlexible();
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
			case R2Package.PIVLTS__PHASE:
				setPhase((IVLTS)newValue);
				return;
			case R2Package.PIVLTS__PERIOD:
				setPeriod((PQ)newValue);
				return;
			case R2Package.PIVLTS__FREQUENCY:
				setFrequency((RTO)newValue);
				return;
			case R2Package.PIVLTS__COUNT:
				setCount((INT)newValue);
				return;
			case R2Package.PIVLTS__ALIGNMENT:
				setAlignment((CalendarCycle)newValue);
				return;
			case R2Package.PIVLTS__IS_FLEXIBLE:
				setIsFlexible((Boolean)newValue);
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
			case R2Package.PIVLTS__PHASE:
				setPhase((IVLTS)null);
				return;
			case R2Package.PIVLTS__PERIOD:
				setPeriod((PQ)null);
				return;
			case R2Package.PIVLTS__FREQUENCY:
				setFrequency((RTO)null);
				return;
			case R2Package.PIVLTS__COUNT:
				setCount((INT)null);
				return;
			case R2Package.PIVLTS__ALIGNMENT:
				unsetAlignment();
				return;
			case R2Package.PIVLTS__IS_FLEXIBLE:
				unsetIsFlexible();
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
			case R2Package.PIVLTS__PHASE:
				return phase != null;
			case R2Package.PIVLTS__PERIOD:
				return period != null;
			case R2Package.PIVLTS__FREQUENCY:
				return frequency != null;
			case R2Package.PIVLTS__COUNT:
				return count != null;
			case R2Package.PIVLTS__ALIGNMENT:
				return isSetAlignment();
			case R2Package.PIVLTS__IS_FLEXIBLE:
				return isSetIsFlexible();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alignment: ");
		if (alignmentESet) result.append(alignment); else result.append("<unset>");
		result.append(", isFlexible: ");
		if (isFlexibleESet) result.append(isFlexible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PIVLTSImpl
