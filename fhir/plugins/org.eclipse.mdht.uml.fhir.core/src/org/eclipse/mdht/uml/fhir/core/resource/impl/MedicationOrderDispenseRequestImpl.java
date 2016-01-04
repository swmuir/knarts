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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Duration;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderDispenseRequestImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderDispenseRequestImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderDispenseRequestImpl#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderDispenseRequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderDispenseRequestImpl#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationOrderDispenseRequestImpl extends BackboneElementImpl implements MedicationOrderDispenseRequest {
	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getNumberOfRepeatsAllowed() <em>Number Of Repeats Allowed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt numberOfRepeatsAllowed;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getExpectedSupplyDuration() <em>Expected Supply Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration expectedSupplyDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderDispenseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationOrderDispenseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getMedicationx() {
		if (medicationx != null && medicationx.eIsProxy()) {
			InternalEObject oldMedicationx = (InternalEObject)medicationx;
			medicationx = (Base)eResolveProxy(oldMedicationx);
			if (medicationx != oldMedicationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX, oldMedicationx, medicationx));
			}
		}
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(Base newMedicationx) {
		Base oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		if (validityPeriod != null && validityPeriod.eIsProxy()) {
			InternalEObject oldValidityPeriod = (InternalEObject)validityPeriod;
			validityPeriod = (Period)eResolveProxy(oldValidityPeriod);
			if (validityPeriod != oldValidityPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD, oldValidityPeriod, validityPeriod));
			}
		}
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD, oldValidityPeriod, validityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getNumberOfRepeatsAllowed() {
		if (numberOfRepeatsAllowed != null && numberOfRepeatsAllowed.eIsProxy()) {
			InternalEObject oldNumberOfRepeatsAllowed = (InternalEObject)numberOfRepeatsAllowed;
			numberOfRepeatsAllowed = (PositiveInt)eResolveProxy(oldNumberOfRepeatsAllowed);
			if (numberOfRepeatsAllowed != oldNumberOfRepeatsAllowed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, numberOfRepeatsAllowed));
			}
		}
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetNumberOfRepeatsAllowed() {
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeatsAllowed(PositiveInt newNumberOfRepeatsAllowed) {
		PositiveInt oldNumberOfRepeatsAllowed = numberOfRepeatsAllowed;
		numberOfRepeatsAllowed = newNumberOfRepeatsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, numberOfRepeatsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExpectedSupplyDuration() {
		if (expectedSupplyDuration != null && expectedSupplyDuration.eIsProxy()) {
			InternalEObject oldExpectedSupplyDuration = (InternalEObject)expectedSupplyDuration;
			expectedSupplyDuration = (Duration)eResolveProxy(oldExpectedSupplyDuration);
			if (expectedSupplyDuration != oldExpectedSupplyDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, expectedSupplyDuration));
			}
		}
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedSupplyDuration(Duration newExpectedSupplyDuration) {
		Duration oldExpectedSupplyDuration = expectedSupplyDuration;
		expectedSupplyDuration = newExpectedSupplyDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, expectedSupplyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD:
				if (resolve) return getValidityPeriod();
				return basicGetValidityPeriod();
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				if (resolve) return getNumberOfRepeatsAllowed();
				return basicGetNumberOfRepeatsAllowed();
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				if (resolve) return getExpectedSupplyDuration();
				return basicGetExpectedSupplyDuration();
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
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)newValue);
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
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)null);
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
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__MEDICATIONX:
				return medicationx != null;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				return numberOfRepeatsAllowed != null;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				return expectedSupplyDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationOrderDispenseRequestImpl
