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

import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.LocationPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.LocationPositionImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.LocationPositionImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.LocationPositionImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationPositionImpl extends BackboneElementImpl implements LocationPosition {
	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected Decimal longitude;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected Decimal latitude;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected Decimal altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getLocationPosition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getLongitude() {
		if (longitude != null && longitude.eIsProxy()) {
			InternalEObject oldLongitude = (InternalEObject)longitude;
			longitude = (Decimal)eResolveProxy(oldLongitude);
			if (longitude != oldLongitude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LOCATION_POSITION__LONGITUDE, oldLongitude, longitude));
			}
		}
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(Decimal newLongitude) {
		Decimal oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LOCATION_POSITION__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getLatitude() {
		if (latitude != null && latitude.eIsProxy()) {
			InternalEObject oldLatitude = (InternalEObject)latitude;
			latitude = (Decimal)eResolveProxy(oldLatitude);
			if (latitude != oldLatitude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LOCATION_POSITION__LATITUDE, oldLatitude, latitude));
			}
		}
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(Decimal newLatitude) {
		Decimal oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LOCATION_POSITION__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAltitude() {
		if (altitude != null && altitude.eIsProxy()) {
			InternalEObject oldAltitude = (InternalEObject)altitude;
			altitude = (Decimal)eResolveProxy(oldAltitude);
			if (altitude != oldAltitude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LOCATION_POSITION__ALTITUDE, oldAltitude, altitude));
			}
		}
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(Decimal newAltitude) {
		Decimal oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LOCATION_POSITION__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.LOCATION_POSITION__LONGITUDE:
				if (resolve) return getLongitude();
				return basicGetLongitude();
			case FhirResourcePackage.LOCATION_POSITION__LATITUDE:
				if (resolve) return getLatitude();
				return basicGetLatitude();
			case FhirResourcePackage.LOCATION_POSITION__ALTITUDE:
				if (resolve) return getAltitude();
				return basicGetAltitude();
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
			case FhirResourcePackage.LOCATION_POSITION__LONGITUDE:
				setLongitude((Decimal)newValue);
				return;
			case FhirResourcePackage.LOCATION_POSITION__LATITUDE:
				setLatitude((Decimal)newValue);
				return;
			case FhirResourcePackage.LOCATION_POSITION__ALTITUDE:
				setAltitude((Decimal)newValue);
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
			case FhirResourcePackage.LOCATION_POSITION__LONGITUDE:
				setLongitude((Decimal)null);
				return;
			case FhirResourcePackage.LOCATION_POSITION__LATITUDE:
				setLatitude((Decimal)null);
				return;
			case FhirResourcePackage.LOCATION_POSITION__ALTITUDE:
				setAltitude((Decimal)null);
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
			case FhirResourcePackage.LOCATION_POSITION__LONGITUDE:
				return longitude != null;
			case FhirResourcePackage.LOCATION_POSITION__LATITUDE:
				return latitude != null;
			case FhirResourcePackage.LOCATION_POSITION__ALTITUDE:
				return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //LocationPositionImpl
