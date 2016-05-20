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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DecisionSupportServiceModule;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Service Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getDataRequirement <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportServiceModuleImpl extends DomainResourceImpl implements DecisionSupportServiceModule {
	/**
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerDefinition> trigger;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinition> parameter;

	/**
	 * The cached value of the '{@link #getDataRequirement() <em>Data Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> dataRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportServiceModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDecisionSupportServiceModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMetadata(ModuleMetadata newModuleMetadata, NotificationChain msgs) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		if (newModuleMetadata != moduleMetadata) {
			NotificationChain msgs = null;
			if (moduleMetadata != null)
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerDefinition> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<TriggerDefinition>(TriggerDefinition.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDefinition> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterDefinition>(ParameterDefinition.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getDataRequirement() {
		if (dataRequirement == null) {
			dataRequirement = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT);
		}
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT:
				return ((InternalEList<?>)getDataRequirement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER:
				return getTrigger();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return getParameter();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT:
				return getDataRequirement();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends TriggerDefinition>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterDefinition>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT:
				getDataRequirement().clear();
				getDataRequirement().addAll((Collection<? extends DataRequirement>)newValue);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER:
				getTrigger().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT:
				getDataRequirement().clear();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__DATA_REQUIREMENT:
				return dataRequirement != null && !dataRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportServiceModuleImpl
