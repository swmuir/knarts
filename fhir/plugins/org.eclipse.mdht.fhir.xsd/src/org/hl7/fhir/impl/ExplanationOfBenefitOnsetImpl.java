/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.ExplanationOfBenefitOnset;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Onset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitOnsetImpl#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitOnsetImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitOnsetImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitOnsetImpl extends BackboneElementImpl implements ExplanationOfBenefitOnset {
	/**
	 * The cached value of the '{@link #getTimeDate() <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDate()
	 * @generated
	 * @ordered
	 */
	protected Date timeDate;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timePeriod;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitOnsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitOnset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeDate() {
		return timeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDate(Date newTimeDate, NotificationChain msgs) {
		Date oldTimeDate = timeDate;
		timeDate = newTimeDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE, oldTimeDate, newTimeDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDate(Date newTimeDate) {
		if (newTimeDate != timeDate) {
			NotificationChain msgs = null;
			if (timeDate != null)
				msgs = ((InternalEObject)timeDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE, null, msgs);
			if (newTimeDate != null)
				msgs = ((InternalEObject)newTimeDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE, null, msgs);
			msgs = basicSetTimeDate(newTimeDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE, newTimeDate, newTimeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(Period newTimePeriod, NotificationChain msgs) {
		Period oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD, oldTimePeriod, newTimePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(Period newTimePeriod) {
		if (newTimePeriod != timePeriod) {
			NotificationChain msgs = null;
			if (timePeriod != null)
				msgs = ((InternalEObject)timePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD, null, msgs);
			if (newTimePeriod != null)
				msgs = ((InternalEObject)newTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD, null, msgs);
			msgs = basicSetTimePeriod(newTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD, newTimePeriod, newTimePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE:
				return basicSetTimeDate(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE:
				return basicSetType(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE:
				return getTimeDate();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD:
				return getTimePeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE:
				return getType();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE:
				setTimeDate((Date)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD:
				setTimePeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE:
				setType((Coding)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE:
				setTimeDate((Date)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD:
				setTimePeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE:
				setType((Coding)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_DATE:
				return timeDate != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TIME_PERIOD:
				return timePeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitOnsetImpl
