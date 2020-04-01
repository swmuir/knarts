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

import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.TaskRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TaskRestrictionImpl#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TaskRestrictionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TaskRestrictionImpl#getRecipients <em>Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRestrictionImpl extends BackboneElementImpl implements TaskRestriction {
	/**
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt repetitions;

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
	 * The cached value of the '{@link #getRecipients() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTaskRestriction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitions(PositiveInt newRepetitions, NotificationChain msgs) {
		PositiveInt oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK_RESTRICTION__REPETITIONS, oldRepetitions, newRepetitions);
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
	public void setRepetitions(PositiveInt newRepetitions) {
		if (newRepetitions != repetitions) {
			NotificationChain msgs = null;
			if (repetitions != null)
				msgs = ((InternalEObject)repetitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK_RESTRICTION__REPETITIONS, null, msgs);
			if (newRepetitions != null)
				msgs = ((InternalEObject)newRepetitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK_RESTRICTION__REPETITIONS, null, msgs);
			msgs = basicSetRepetitions(newRepetitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK_RESTRICTION__REPETITIONS, newRepetitions, newRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK_RESTRICTION__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK_RESTRICTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK_RESTRICTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK_RESTRICTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TASK_RESTRICTION__RECIPIENT);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TASK_RESTRICTION__REPETITIONS:
				return basicSetRepetitions(null, msgs);
			case ResourcesPackage.TASK_RESTRICTION__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.TASK_RESTRICTION__RECIPIENT:
				return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TASK_RESTRICTION__REPETITIONS:
				return getRepetitions();
			case ResourcesPackage.TASK_RESTRICTION__PERIOD:
				return getPeriod();
			case ResourcesPackage.TASK_RESTRICTION__RECIPIENT:
				return getRecipients();
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
			case ResourcesPackage.TASK_RESTRICTION__REPETITIONS:
				setRepetitions((PositiveInt)newValue);
				return;
			case ResourcesPackage.TASK_RESTRICTION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.TASK_RESTRICTION__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.TASK_RESTRICTION__REPETITIONS:
				setRepetitions((PositiveInt)null);
				return;
			case ResourcesPackage.TASK_RESTRICTION__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.TASK_RESTRICTION__RECIPIENT:
				getRecipients().clear();
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
			case ResourcesPackage.TASK_RESTRICTION__REPETITIONS:
				return repetitions != null;
			case ResourcesPackage.TASK_RESTRICTION__PERIOD:
				return period != null;
			case ResourcesPackage.TASK_RESTRICTION__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskRestrictionImpl
