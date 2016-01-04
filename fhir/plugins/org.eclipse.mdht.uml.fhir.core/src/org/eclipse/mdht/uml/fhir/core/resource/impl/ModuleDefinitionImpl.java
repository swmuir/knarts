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

import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinition;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionCodeSystem;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionData;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionLibrary;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionModel;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionParameter;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getModels <em>Model</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getLibraries <em>Library</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getCodeSystems <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getValueSets <em>Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionImpl extends DomainResourceImpl implements ModuleDefinition {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

	/**
	 * The cached value of the '{@link #getModels() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionModel> models;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionLibrary> libraries;

	/**
	 * The cached value of the '{@link #getCodeSystems() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionCodeSystem> codeSystems;

	/**
	 * The cached value of the '{@link #getValueSets() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionValueSet> valueSets;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionParameter> parameters;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionData> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getModuleDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.MODULE_DEFINITION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MODULE_DEFINITION__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MODULE_DEFINITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionModel> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<ModuleDefinitionModel>(ModuleDefinitionModel.class, this, FhirResourcePackage.MODULE_DEFINITION__MODEL);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<ModuleDefinitionLibrary>(ModuleDefinitionLibrary.class, this, FhirResourcePackage.MODULE_DEFINITION__LIBRARY);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionCodeSystem> getCodeSystems() {
		if (codeSystems == null) {
			codeSystems = new EObjectContainmentEList<ModuleDefinitionCodeSystem>(ModuleDefinitionCodeSystem.class, this, FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM);
		}
		return codeSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionValueSet> getValueSets() {
		if (valueSets == null) {
			valueSets = new EObjectContainmentEList<ModuleDefinitionValueSet>(ModuleDefinitionValueSet.class, this, FhirResourcePackage.MODULE_DEFINITION__VALUE_SET);
		}
		return valueSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ModuleDefinitionParameter>(ModuleDefinitionParameter.class, this, FhirResourcePackage.MODULE_DEFINITION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ModuleDefinitionData>(ModuleDefinitionData.class, this, FhirResourcePackage.MODULE_DEFINITION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MODULE_DEFINITION__MODEL:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION__VALUE_SET:
				return ((InternalEList<?>)getValueSets()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.MODULE_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.MODULE_DEFINITION__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.MODULE_DEFINITION__MODEL:
				return getModels();
			case FhirResourcePackage.MODULE_DEFINITION__LIBRARY:
				return getLibraries();
			case FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM:
				return getCodeSystems();
			case FhirResourcePackage.MODULE_DEFINITION__VALUE_SET:
				return getValueSets();
			case FhirResourcePackage.MODULE_DEFINITION__PARAMETER:
				return getParameters();
			case FhirResourcePackage.MODULE_DEFINITION__DATA:
				return getData();
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
			case FhirResourcePackage.MODULE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__MODEL:
				getModels().clear();
				getModels().addAll((Collection<? extends ModuleDefinitionModel>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__LIBRARY:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends ModuleDefinitionLibrary>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM:
				getCodeSystems().clear();
				getCodeSystems().addAll((Collection<? extends ModuleDefinitionCodeSystem>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__VALUE_SET:
				getValueSets().clear();
				getValueSets().addAll((Collection<? extends ModuleDefinitionValueSet>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModuleDefinitionParameter>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ModuleDefinitionData>)newValue);
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
			case FhirResourcePackage.MODULE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MODULE_DEFINITION__MODEL:
				getModels().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__LIBRARY:
				getLibraries().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM:
				getCodeSystems().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__VALUE_SET:
				getValueSets().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__PARAMETER:
				getParameters().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION__DATA:
				getData().clear();
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
			case FhirResourcePackage.MODULE_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__VERSION:
				return version != null;
			case FhirResourcePackage.MODULE_DEFINITION__MODEL:
				return models != null && !models.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__LIBRARY:
				return libraries != null && !libraries.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__CODE_SYSTEM:
				return codeSystems != null && !codeSystems.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__VALUE_SET:
				return valueSets != null && !valueSets.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionImpl
