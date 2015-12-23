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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getLines <em>Line</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends DataTypeImpl implements Address {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * The cached value of the '{@link #getLines() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> lines;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String city;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String district;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String state;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String postalCode;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String country;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Code)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getLines() {
		if (lines == null) {
			lines = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.ADDRESS__LINE);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(org.eclipse.mdht.uml.fhir.core.datatype.String newCity) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDistrict() {
		if (district != null && district.eIsProxy()) {
			InternalEObject oldDistrict = (InternalEObject)district;
			district = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDistrict);
			if (district != oldDistrict) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__DISTRICT, oldDistrict, district));
			}
		}
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistrict(org.eclipse.mdht.uml.fhir.core.datatype.String newDistrict) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__DISTRICT, oldDistrict, district));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(org.eclipse.mdht.uml.fhir.core.datatype.String newState) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPostalCode() {
		if (postalCode != null && postalCode.eIsProxy()) {
			InternalEObject oldPostalCode = (InternalEObject)postalCode;
			postalCode = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPostalCode);
			if (postalCode != oldPostalCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
			}
		}
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(org.eclipse.mdht.uml.fhir.core.datatype.String newPostalCode) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(org.eclipse.mdht.uml.fhir.core.datatype.String newCountry) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ADDRESS__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ADDRESS__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ADDRESS__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case FhirDatatypePackage.ADDRESS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirDatatypePackage.ADDRESS__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirDatatypePackage.ADDRESS__LINE:
				return getLines();
			case FhirDatatypePackage.ADDRESS__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case FhirDatatypePackage.ADDRESS__DISTRICT:
				if (resolve) return getDistrict();
				return basicGetDistrict();
			case FhirDatatypePackage.ADDRESS__STATE:
				if (resolve) return getState();
				return basicGetState();
			case FhirDatatypePackage.ADDRESS__POSTAL_CODE:
				if (resolve) return getPostalCode();
				return basicGetPostalCode();
			case FhirDatatypePackage.ADDRESS__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case FhirDatatypePackage.ADDRESS__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case FhirDatatypePackage.ADDRESS__USE:
				setUse((Code)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__TYPE:
				setType((Code)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__LINE:
				getLines().clear();
				getLines().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__CITY:
				setCity((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__DISTRICT:
				setDistrict((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__STATE:
				setState((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__POSTAL_CODE:
				setPostalCode((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__COUNTRY:
				setCountry((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ADDRESS__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirDatatypePackage.ADDRESS__USE:
				setUse((Code)null);
				return;
			case FhirDatatypePackage.ADDRESS__TYPE:
				setType((Code)null);
				return;
			case FhirDatatypePackage.ADDRESS__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__LINE:
				getLines().clear();
				return;
			case FhirDatatypePackage.ADDRESS__CITY:
				setCity((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__DISTRICT:
				setDistrict((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__STATE:
				setState((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__POSTAL_CODE:
				setPostalCode((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__COUNTRY:
				setCountry((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ADDRESS__PERIOD:
				setPeriod((Period)null);
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
			case FhirDatatypePackage.ADDRESS__USE:
				return use != null;
			case FhirDatatypePackage.ADDRESS__TYPE:
				return type != null;
			case FhirDatatypePackage.ADDRESS__TEXT:
				return text != null;
			case FhirDatatypePackage.ADDRESS__LINE:
				return lines != null && !lines.isEmpty();
			case FhirDatatypePackage.ADDRESS__CITY:
				return city != null;
			case FhirDatatypePackage.ADDRESS__DISTRICT:
				return district != null;
			case FhirDatatypePackage.ADDRESS__STATE:
				return state != null;
			case FhirDatatypePackage.ADDRESS__POSTAL_CODE:
				return postalCode != null;
			case FhirDatatypePackage.ADDRESS__COUNTRY:
				return country != null;
			case FhirDatatypePackage.ADDRESS__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressImpl
