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
import org.eclipse.mdht.uml.fhir.core.datatype.Quantity;
import org.eclipse.mdht.uml.fhir.core.datatype.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioImpl extends DataTypeImpl implements Ratio {
	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected Quantity numerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected Quantity denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getNumerator() {
		if (numerator != null && numerator.eIsProxy()) {
			InternalEObject oldNumerator = (InternalEObject)numerator;
			numerator = (Quantity)eResolveProxy(oldNumerator);
			if (numerator != oldNumerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.RATIO__NUMERATOR, oldNumerator, numerator));
			}
		}
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(Quantity newNumerator) {
		Quantity oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.RATIO__NUMERATOR, oldNumerator, numerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDenominator() {
		if (denominator != null && denominator.eIsProxy()) {
			InternalEObject oldDenominator = (InternalEObject)denominator;
			denominator = (Quantity)eResolveProxy(oldDenominator);
			if (denominator != oldDenominator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.RATIO__DENOMINATOR, oldDenominator, denominator));
			}
		}
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(Quantity newDenominator) {
		Quantity oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.RATIO__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.RATIO__NUMERATOR:
				if (resolve) return getNumerator();
				return basicGetNumerator();
			case FhirDatatypePackage.RATIO__DENOMINATOR:
				if (resolve) return getDenominator();
				return basicGetDenominator();
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
			case FhirDatatypePackage.RATIO__NUMERATOR:
				setNumerator((Quantity)newValue);
				return;
			case FhirDatatypePackage.RATIO__DENOMINATOR:
				setDenominator((Quantity)newValue);
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
			case FhirDatatypePackage.RATIO__NUMERATOR:
				setNumerator((Quantity)null);
				return;
			case FhirDatatypePackage.RATIO__DENOMINATOR:
				setDenominator((Quantity)null);
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
			case FhirDatatypePackage.RATIO__NUMERATOR:
				return numerator != null;
			case FhirDatatypePackage.RATIO__DENOMINATOR:
				return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //RatioImpl
