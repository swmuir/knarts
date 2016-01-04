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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRest;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestOperation;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceSearchParam;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestSecurity;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestSystemInteraction;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getTransactionMode <em>Transaction Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getOperations <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestImpl#getCompartments <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceRestImpl extends BackboneElementImpl implements ConformanceRest {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String documentation;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected ConformanceRestSecurity security;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestResource> resources;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestSystemInteraction> interactions;

	/**
	 * The cached value of the '{@link #getTransactionMode() <em>Transaction Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionMode()
	 * @generated
	 * @ordered
	 */
	protected Code transactionMode;

	/**
	 * The cached value of the '{@link #getSearchParams() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestResourceSearchParam> searchParams;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestOperation> operations;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> compartments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConformanceRest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Code)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.datatype.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestSecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(ConformanceRestSecurity newSecurity, NotificationChain msgs) {
		ConformanceRestSecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(ConformanceRestSecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CONFORMANCE_REST__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CONFORMANCE_REST__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ConformanceRestResource>(ConformanceRestResource.class, this, FhirResourcePackage.CONFORMANCE_REST__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestSystemInteraction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<ConformanceRestSystemInteraction>(ConformanceRestSystemInteraction.class, this, FhirResourcePackage.CONFORMANCE_REST__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getTransactionMode() {
		if (transactionMode != null && transactionMode.eIsProxy()) {
			InternalEObject oldTransactionMode = (InternalEObject)transactionMode;
			transactionMode = (Code)eResolveProxy(oldTransactionMode);
			if (transactionMode != oldTransactionMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE, oldTransactionMode, transactionMode));
			}
		}
		return transactionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetTransactionMode() {
		return transactionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionMode(Code newTransactionMode) {
		Code oldTransactionMode = transactionMode;
		transactionMode = newTransactionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE, oldTransactionMode, transactionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestResourceSearchParam> getSearchParams() {
		if (searchParams == null) {
			searchParams = new EObjectContainmentEList<ConformanceRestResourceSearchParam>(ConformanceRestResourceSearchParam.class, this, FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM);
		}
		return searchParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<ConformanceRestOperation>(ConformanceRestOperation.class, this, FhirResourcePackage.CONFORMANCE_REST__OPERATION);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectResolvingEList<Uri>(Uri.class, this, FhirResourcePackage.CONFORMANCE_REST__COMPARTMENT);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONFORMANCE_REST__SECURITY:
				return basicSetSecurity(null, msgs);
			case FhirResourcePackage.CONFORMANCE_REST__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONFORMANCE_REST__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParams()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONFORMANCE_REST__OPERATION:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONFORMANCE_REST__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case FhirResourcePackage.CONFORMANCE_REST__SECURITY:
				return getSecurity();
			case FhirResourcePackage.CONFORMANCE_REST__RESOURCE:
				return getResources();
			case FhirResourcePackage.CONFORMANCE_REST__INTERACTION:
				return getInteractions();
			case FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE:
				if (resolve) return getTransactionMode();
				return basicGetTransactionMode();
			case FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM:
				return getSearchParams();
			case FhirResourcePackage.CONFORMANCE_REST__OPERATION:
				return getOperations();
			case FhirResourcePackage.CONFORMANCE_REST__COMPARTMENT:
				return getCompartments();
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
			case FhirResourcePackage.CONFORMANCE_REST__MODE:
				setMode((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__SECURITY:
				setSecurity((ConformanceRestSecurity)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends ConformanceRestResource>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends ConformanceRestSystemInteraction>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE:
				setTransactionMode((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM:
				getSearchParams().clear();
				getSearchParams().addAll((Collection<? extends ConformanceRestResourceSearchParam>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__OPERATION:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ConformanceRestOperation>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__COMPARTMENT:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends Uri>)newValue);
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
			case FhirResourcePackage.CONFORMANCE_REST__MODE:
				setMode((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__SECURITY:
				setSecurity((ConformanceRestSecurity)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__RESOURCE:
				getResources().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST__INTERACTION:
				getInteractions().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE:
				setTransactionMode((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM:
				getSearchParams().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST__OPERATION:
				getOperations().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST__COMPARTMENT:
				getCompartments().clear();
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
			case FhirResourcePackage.CONFORMANCE_REST__MODE:
				return mode != null;
			case FhirResourcePackage.CONFORMANCE_REST__DOCUMENTATION:
				return documentation != null;
			case FhirResourcePackage.CONFORMANCE_REST__SECURITY:
				return security != null;
			case FhirResourcePackage.CONFORMANCE_REST__RESOURCE:
				return resources != null && !resources.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST__TRANSACTION_MODE:
				return transactionMode != null;
			case FhirResourcePackage.CONFORMANCE_REST__SEARCH_PARAM:
				return searchParams != null && !searchParams.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST__OPERATION:
				return operations != null && !operations.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST__COMPARTMENT:
				return compartments != null && !compartments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceRestImpl
