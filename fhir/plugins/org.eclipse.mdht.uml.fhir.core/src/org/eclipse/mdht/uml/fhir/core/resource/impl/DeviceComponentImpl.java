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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getLastSystemChange <em>Last System Change</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getOperationalStati <em>Operational Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getMeasurementPrinciple <em>Measurement Principle</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getProductionSpecifications <em>Production Specification</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceComponentImpl#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceComponentImpl extends DomainResourceImpl implements DeviceComponent {
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
	 * The cached value of the '{@link #getLastSystemChange() <em>Last System Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSystemChange()
	 * @generated
	 * @ordered
	 */
	protected Instant lastSystemChange;

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
	 * The cached value of the '{@link #getOperationalStati() <em>Operational Status</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStati()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> operationalStati;

	/**
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept parameterGroup;

	/**
	 * The cached value of the '{@link #getMeasurementPrinciple() <em>Measurement Principle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPrinciple()
	 * @generated
	 * @ordered
	 */
	protected Code measurementPrinciple;

	/**
	 * The cached value of the '{@link #getProductionSpecifications() <em>Production Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceComponentProductionSpecification> productionSpecifications;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept languageCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDeviceComponent();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getLastSystemChange() {
		if (lastSystemChange != null && lastSystemChange.eIsProxy()) {
			InternalEObject oldLastSystemChange = (InternalEObject)lastSystemChange;
			lastSystemChange = (Instant)eResolveProxy(oldLastSystemChange);
			if (lastSystemChange != oldLastSystemChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, oldLastSystemChange, lastSystemChange));
			}
		}
		return lastSystemChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetLastSystemChange() {
		return lastSystemChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSystemChange(Instant newLastSystemChange) {
		Instant oldLastSystemChange = lastSystemChange;
		lastSystemChange = newLastSystemChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, oldLastSystemChange, lastSystemChange));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getOperationalStati() {
		if (operationalStati == null) {
			operationalStati = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DEVICE_COMPONENT__OPERATIONAL_STATUS);
		}
		return operationalStati;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getParameterGroup() {
		if (parameterGroup != null && parameterGroup.eIsProxy()) {
			InternalEObject oldParameterGroup = (InternalEObject)parameterGroup;
			parameterGroup = (CodeableConcept)eResolveProxy(oldParameterGroup);
			if (parameterGroup != oldParameterGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP, oldParameterGroup, parameterGroup));
			}
		}
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetParameterGroup() {
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterGroup(CodeableConcept newParameterGroup) {
		CodeableConcept oldParameterGroup = parameterGroup;
		parameterGroup = newParameterGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP, oldParameterGroup, parameterGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMeasurementPrinciple() {
		if (measurementPrinciple != null && measurementPrinciple.eIsProxy()) {
			InternalEObject oldMeasurementPrinciple = (InternalEObject)measurementPrinciple;
			measurementPrinciple = (Code)eResolveProxy(oldMeasurementPrinciple);
			if (measurementPrinciple != oldMeasurementPrinciple) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, oldMeasurementPrinciple, measurementPrinciple));
			}
		}
		return measurementPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMeasurementPrinciple() {
		return measurementPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPrinciple(Code newMeasurementPrinciple) {
		Code oldMeasurementPrinciple = measurementPrinciple;
		measurementPrinciple = newMeasurementPrinciple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, oldMeasurementPrinciple, measurementPrinciple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceComponentProductionSpecification> getProductionSpecifications() {
		if (productionSpecifications == null) {
			productionSpecifications = new EObjectContainmentEList<DeviceComponentProductionSpecification>(DeviceComponentProductionSpecification.class, this, FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION);
		}
		return productionSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLanguageCode() {
		if (languageCode != null && languageCode.eIsProxy()) {
			InternalEObject oldLanguageCode = (InternalEObject)languageCode;
			languageCode = (CodeableConcept)eResolveProxy(oldLanguageCode);
			if (languageCode != oldLanguageCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE, oldLanguageCode, languageCode));
			}
		}
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(CodeableConcept newLanguageCode) {
		CodeableConcept oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return ((InternalEList<?>)getProductionSpecifications()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DEVICE_COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				if (resolve) return getLastSystemChange();
				return basicGetLastSystemChange();
			case FhirResourcePackage.DEVICE_COMPONENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FhirResourcePackage.DEVICE_COMPONENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FhirResourcePackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				return getOperationalStati();
			case FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				if (resolve) return getParameterGroup();
				return basicGetParameterGroup();
			case FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				if (resolve) return getMeasurementPrinciple();
				return basicGetMeasurementPrinciple();
			case FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return getProductionSpecifications();
			case FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				if (resolve) return getLanguageCode();
				return basicGetLanguageCode();
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
			case FhirResourcePackage.DEVICE_COMPONENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				setLastSystemChange((Instant)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__SOURCE:
				setSource((Device)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PARENT:
				setParent((DeviceComponent)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				getOperationalStati().clear();
				getOperationalStati().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				setParameterGroup((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				setMeasurementPrinciple((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				getProductionSpecifications().clear();
				getProductionSpecifications().addAll((Collection<? extends DeviceComponentProductionSpecification>)newValue);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				setLanguageCode((CodeableConcept)newValue);
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
			case FhirResourcePackage.DEVICE_COMPONENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				setLastSystemChange((Instant)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__SOURCE:
				setSource((Device)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PARENT:
				setParent((DeviceComponent)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				getOperationalStati().clear();
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				setParameterGroup((CodeableConcept)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				setMeasurementPrinciple((Code)null);
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				getProductionSpecifications().clear();
				return;
			case FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				setLanguageCode((CodeableConcept)null);
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
			case FhirResourcePackage.DEVICE_COMPONENT__TYPE:
				return type != null;
			case FhirResourcePackage.DEVICE_COMPONENT__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				return lastSystemChange != null;
			case FhirResourcePackage.DEVICE_COMPONENT__SOURCE:
				return source != null;
			case FhirResourcePackage.DEVICE_COMPONENT__PARENT:
				return parent != null;
			case FhirResourcePackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				return operationalStati != null && !operationalStati.isEmpty();
			case FhirResourcePackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				return parameterGroup != null;
			case FhirResourcePackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				return measurementPrinciple != null;
			case FhirResourcePackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return productionSpecifications != null && !productionSpecifications.isEmpty();
			case FhirResourcePackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				return languageCode != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceComponentImpl
