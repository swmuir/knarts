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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Library;
import org.hl7.fhir.LibraryCodeSystem;
import org.hl7.fhir.LibraryLibrary;
import org.hl7.fhir.LibraryModel;
import org.hl7.fhir.LibraryValueSet;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.ParameterDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getDataRequirement <em>Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends DomainResourceImpl implements Library {
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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryModel> model;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryLibrary> library;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryCodeSystem> codeSystem;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryValueSet> valueSet;

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
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Attachment document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getLibrary();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
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
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryModel> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<LibraryModel>(LibraryModel.class, this, FhirPackage.LIBRARY__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryLibrary> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<LibraryLibrary>(LibraryLibrary.class, this, FhirPackage.LIBRARY__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryCodeSystem> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<LibraryCodeSystem>(LibraryCodeSystem.class, this, FhirPackage.LIBRARY__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<LibraryValueSet>(LibraryValueSet.class, this, FhirPackage.LIBRARY__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDefinition> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterDefinition>(ParameterDefinition.class, this, FhirPackage.LIBRARY__PARAMETER);
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
			dataRequirement = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, FhirPackage.LIBRARY__DATA_REQUIREMENT);
		}
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Attachment newDocument, NotificationChain msgs) {
		Attachment oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Attachment newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.LIBRARY__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystem()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__DATA_REQUIREMENT:
				return ((InternalEList<?>)getDataRequirement()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__DOCUMENT:
				return basicSetDocument(null, msgs);
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
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.LIBRARY__MODEL:
				return getModel();
			case FhirPackage.LIBRARY__LIBRARY:
				return getLibrary();
			case FhirPackage.LIBRARY__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.LIBRARY__VALUE_SET:
				return getValueSet();
			case FhirPackage.LIBRARY__PARAMETER:
				return getParameter();
			case FhirPackage.LIBRARY__DATA_REQUIREMENT:
				return getDataRequirement();
			case FhirPackage.LIBRARY__DOCUMENT:
				return getDocument();
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
			case FhirPackage.LIBRARY__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.LIBRARY__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends LibraryModel>)newValue);
				return;
			case FhirPackage.LIBRARY__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends LibraryLibrary>)newValue);
				return;
			case FhirPackage.LIBRARY__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends LibraryCodeSystem>)newValue);
				return;
			case FhirPackage.LIBRARY__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends LibraryValueSet>)newValue);
				return;
			case FhirPackage.LIBRARY__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterDefinition>)newValue);
				return;
			case FhirPackage.LIBRARY__DATA_REQUIREMENT:
				getDataRequirement().clear();
				getDataRequirement().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case FhirPackage.LIBRARY__DOCUMENT:
				setDocument((Attachment)newValue);
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
			case FhirPackage.LIBRARY__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.LIBRARY__MODEL:
				getModel().clear();
				return;
			case FhirPackage.LIBRARY__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.LIBRARY__CODE_SYSTEM:
				getCodeSystem().clear();
				return;
			case FhirPackage.LIBRARY__VALUE_SET:
				getValueSet().clear();
				return;
			case FhirPackage.LIBRARY__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.LIBRARY__DATA_REQUIREMENT:
				getDataRequirement().clear();
				return;
			case FhirPackage.LIBRARY__DOCUMENT:
				setDocument((Attachment)null);
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
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.LIBRARY__MODEL:
				return model != null && !model.isEmpty();
			case FhirPackage.LIBRARY__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.LIBRARY__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
			case FhirPackage.LIBRARY__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case FhirPackage.LIBRARY__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.LIBRARY__DATA_REQUIREMENT:
				return dataRequirement != null && !dataRequirement.isEmpty();
			case FhirPackage.LIBRARY__DOCUMENT:
				return document != null;
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
