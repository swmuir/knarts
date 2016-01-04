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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SampledData;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampled Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampledDataImpl extends DataTypeImpl implements SampledData {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity origin;

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
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected Decimal lowerLimit;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected Decimal upperLimit;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt dimensions;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampledDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.SAMPLED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (SimpleQuantity)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(SimpleQuantity newOrigin) {
		SimpleQuantity oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__ORIGIN, oldOrigin, origin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject)factor;
			factor = (Decimal)eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getLowerLimit() {
		if (lowerLimit != null && lowerLimit.eIsProxy()) {
			InternalEObject oldLowerLimit = (InternalEObject)lowerLimit;
			lowerLimit = (Decimal)eResolveProxy(oldLowerLimit);
			if (lowerLimit != oldLowerLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT, oldLowerLimit, lowerLimit));
			}
		}
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(Decimal newLowerLimit) {
		Decimal oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT, oldLowerLimit, lowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getUpperLimit() {
		if (upperLimit != null && upperLimit.eIsProxy()) {
			InternalEObject oldUpperLimit = (InternalEObject)upperLimit;
			upperLimit = (Decimal)eResolveProxy(oldUpperLimit);
			if (upperLimit != oldUpperLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT, oldUpperLimit, upperLimit));
			}
		}
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(Decimal newUpperLimit) {
		Decimal oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT, oldUpperLimit, upperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDimensions() {
		if (dimensions != null && dimensions.eIsProxy()) {
			InternalEObject oldDimensions = (InternalEObject)dimensions;
			dimensions = (PositiveInt)eResolveProxy(oldDimensions);
			if (dimensions != oldDimensions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS, oldDimensions, dimensions));
			}
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(PositiveInt newDimensions) {
		PositiveInt oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SAMPLED_DATA__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(org.eclipse.mdht.uml.fhir.core.datatype.String newData) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SAMPLED_DATA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.SAMPLED_DATA__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case FhirDatatypePackage.SAMPLED_DATA__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirDatatypePackage.SAMPLED_DATA__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
			case FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT:
				if (resolve) return getLowerLimit();
				return basicGetLowerLimit();
			case FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT:
				if (resolve) return getUpperLimit();
				return basicGetUpperLimit();
			case FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS:
				if (resolve) return getDimensions();
				return basicGetDimensions();
			case FhirDatatypePackage.SAMPLED_DATA__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case FhirDatatypePackage.SAMPLED_DATA__ORIGIN:
				setOrigin((SimpleQuantity)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT:
				setLowerLimit((Decimal)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT:
				setUpperLimit((Decimal)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS:
				setDimensions((PositiveInt)newValue);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__DATA:
				setData((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirDatatypePackage.SAMPLED_DATA__ORIGIN:
				setOrigin((SimpleQuantity)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__PERIOD:
				setPeriod((Decimal)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT:
				setLowerLimit((Decimal)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT:
				setUpperLimit((Decimal)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS:
				setDimensions((PositiveInt)null);
				return;
			case FhirDatatypePackage.SAMPLED_DATA__DATA:
				setData((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirDatatypePackage.SAMPLED_DATA__ORIGIN:
				return origin != null;
			case FhirDatatypePackage.SAMPLED_DATA__PERIOD:
				return period != null;
			case FhirDatatypePackage.SAMPLED_DATA__FACTOR:
				return factor != null;
			case FhirDatatypePackage.SAMPLED_DATA__LOWER_LIMIT:
				return lowerLimit != null;
			case FhirDatatypePackage.SAMPLED_DATA__UPPER_LIMIT:
				return upperLimit != null;
			case FhirDatatypePackage.SAMPLED_DATA__DIMENSIONS:
				return dimensions != null;
			case FhirDatatypePackage.SAMPLED_DATA__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //SampledDataImpl
