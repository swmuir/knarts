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

import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Range;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends DataTypeImpl implements Range {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity high;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getLow() {
		if (low != null && low.eIsProxy()) {
			InternalEObject oldLow = (InternalEObject)low;
			low = (SimpleQuantity)eResolveProxy(oldLow);
			if (low != oldLow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.RANGE__LOW, oldLow, low));
			}
		}
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(SimpleQuantity newLow) {
		SimpleQuantity oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.RANGE__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getHigh() {
		if (high != null && high.eIsProxy()) {
			InternalEObject oldHigh = (InternalEObject)high;
			high = (SimpleQuantity)eResolveProxy(oldHigh);
			if (high != oldHigh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.RANGE__HIGH, oldHigh, high));
			}
		}
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(SimpleQuantity newHigh) {
		SimpleQuantity oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.RANGE__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.RANGE__LOW:
				if (resolve) return getLow();
				return basicGetLow();
			case FhirDatatypePackage.RANGE__HIGH:
				if (resolve) return getHigh();
				return basicGetHigh();
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
			case FhirDatatypePackage.RANGE__LOW:
				setLow((SimpleQuantity)newValue);
				return;
			case FhirDatatypePackage.RANGE__HIGH:
				setHigh((SimpleQuantity)newValue);
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
			case FhirDatatypePackage.RANGE__LOW:
				setLow((SimpleQuantity)null);
				return;
			case FhirDatatypePackage.RANGE__HIGH:
				setHigh((SimpleQuantity)null);
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
			case FhirDatatypePackage.RANGE__LOW:
				return low != null;
			case FhirDatatypePackage.RANGE__HIGH:
				return high != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeImpl
