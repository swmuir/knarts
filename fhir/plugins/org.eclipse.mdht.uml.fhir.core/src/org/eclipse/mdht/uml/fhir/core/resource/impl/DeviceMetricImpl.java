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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceMetric;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceMetricCalibration;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceMetricImpl#getCalibrations <em>Calibration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceMetricImpl extends DomainResourceImpl implements DeviceMetric {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Device source;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected DeviceComponent parent;

	/**
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected Code operationalStatus;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Code color;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Code category;

	/**
	 * The cached value of the '{@link #getMeasurementPeriod() <em>Measurement Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPeriod()
	 * @generated
	 * @ordered
	 */
	protected Timing measurementPeriod;

	/**
	 * The cached value of the '{@link #getCalibrations() <em>Calibration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceMetricCalibration> calibrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDeviceMetric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (CodeableConcept)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CodeableConcept newUnit) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Device)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Device newSource) {
		Device oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (DeviceComponent)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DeviceComponent newParent) {
		DeviceComponent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOperationalStatus() {
		if (operationalStatus != null && operationalStatus.eIsProxy()) {
			InternalEObject oldOperationalStatus = (InternalEObject)operationalStatus;
			operationalStatus = (Code)eResolveProxy(oldOperationalStatus);
			if (operationalStatus != oldOperationalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS, oldOperationalStatus, operationalStatus));
			}
		}
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalStatus(Code newOperationalStatus) {
		Code oldOperationalStatus = operationalStatus;
		operationalStatus = newOperationalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS, oldOperationalStatus, operationalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getColor() {
		if (color != null && color.eIsProxy()) {
			InternalEObject oldColor = (InternalEObject)color;
			color = (Code)eResolveProxy(oldColor);
			if (color != oldColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__COLOR, oldColor, color));
			}
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Code newColor) {
		Code oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Code)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getMeasurementPeriod() {
		if (measurementPeriod != null && measurementPeriod.eIsProxy()) {
			InternalEObject oldMeasurementPeriod = (InternalEObject)measurementPeriod;
			measurementPeriod = (Timing)eResolveProxy(oldMeasurementPeriod);
			if (measurementPeriod != oldMeasurementPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD, oldMeasurementPeriod, measurementPeriod));
			}
		}
		return measurementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing basicGetMeasurementPeriod() {
		return measurementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPeriod(Timing newMeasurementPeriod) {
		Timing oldMeasurementPeriod = measurementPeriod;
		measurementPeriod = newMeasurementPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD, oldMeasurementPeriod, measurementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceMetricCalibration> getCalibrations() {
		if (calibrations == null) {
			calibrations = new EObjectContainmentEList<DeviceMetricCalibration>(DeviceMetricCalibration.class, this, FhirResourcePackage.DEVICE_METRIC__CALIBRATION);
		}
		return calibrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DEVICE_METRIC__CALIBRATION:
				return ((InternalEList<?>)getCalibrations()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DEVICE_METRIC__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DEVICE_METRIC__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.DEVICE_METRIC__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case FhirResourcePackage.DEVICE_METRIC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FhirResourcePackage.DEVICE_METRIC__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				if (resolve) return getOperationalStatus();
				return basicGetOperationalStatus();
			case FhirResourcePackage.DEVICE_METRIC__COLOR:
				if (resolve) return getColor();
				return basicGetColor();
			case FhirResourcePackage.DEVICE_METRIC__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				if (resolve) return getMeasurementPeriod();
				return basicGetMeasurementPeriod();
			case FhirResourcePackage.DEVICE_METRIC__CALIBRATION:
				return getCalibrations();
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
			case FhirResourcePackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__SOURCE:
				setSource((Device)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__PARENT:
				setParent((DeviceComponent)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__COLOR:
				setColor((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__CATEGORY:
				setCategory((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				setMeasurementPeriod((Timing)newValue);
				return;
			case FhirResourcePackage.DEVICE_METRIC__CALIBRATION:
				getCalibrations().clear();
				getCalibrations().addAll((Collection<? extends DeviceMetricCalibration>)newValue);
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
			case FhirResourcePackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__SOURCE:
				setSource((Device)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__PARENT:
				setParent((DeviceComponent)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((Code)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__COLOR:
				setColor((Code)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__CATEGORY:
				setCategory((Code)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				setMeasurementPeriod((Timing)null);
				return;
			case FhirResourcePackage.DEVICE_METRIC__CALIBRATION:
				getCalibrations().clear();
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
			case FhirResourcePackage.DEVICE_METRIC__TYPE:
				return type != null;
			case FhirResourcePackage.DEVICE_METRIC__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.DEVICE_METRIC__UNIT:
				return unit != null;
			case FhirResourcePackage.DEVICE_METRIC__SOURCE:
				return source != null;
			case FhirResourcePackage.DEVICE_METRIC__PARENT:
				return parent != null;
			case FhirResourcePackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return operationalStatus != null;
			case FhirResourcePackage.DEVICE_METRIC__COLOR:
				return color != null;
			case FhirResourcePackage.DEVICE_METRIC__CATEGORY:
				return category != null;
			case FhirResourcePackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				return measurementPeriod != null;
			case FhirResourcePackage.DEVICE_METRIC__CALIBRATION:
				return calibrations != null && !calibrations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceMetricImpl
