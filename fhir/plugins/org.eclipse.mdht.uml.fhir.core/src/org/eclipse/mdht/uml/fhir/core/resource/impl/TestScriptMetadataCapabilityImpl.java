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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.Conformance;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getOrigins <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptMetadataCapabilityImpl#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptMetadataCapabilityImpl extends BackboneElementImpl implements TestScriptMetadataCapability {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean required;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean validated;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getOrigins() <em>Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.Integer> origins;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer destination;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> links;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected Conformance conformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getTestScriptMetadataCapability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newRequired) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getValidated() {
		if (validated != null && validated.eIsProxy()) {
			InternalEObject oldValidated = (InternalEObject)validated;
			validated = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldValidated);
			if (validated != oldValidated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, oldValidated, validated));
			}
		}
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidated(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newValidated) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, oldValidated, validated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.Integer> getOrigins() {
		if (origins == null) {
			origins = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.Integer>(org.eclipse.mdht.uml.fhir.core.datatype.Integer.class, this, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN);
		}
		return origins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer newDestination) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Uri>(Uri.class, this, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance getConformance() {
		if (conformance != null && conformance.eIsProxy()) {
			InternalEObject oldConformance = (InternalEObject)conformance;
			conformance = (Conformance)eResolveProxy(oldConformance);
			if (conformance != oldConformance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE, oldConformance, conformance));
			}
		}
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance basicGetConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(Conformance newConformance) {
		Conformance oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE, oldConformance, conformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				if (resolve) return getValidated();
				return basicGetValidated();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return getOrigins();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return getLinks();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE:
				if (resolve) return getConformance();
				return basicGetConformance();
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
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				getOrigins().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.Integer>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE:
				setConformance((Conformance)newValue);
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
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE:
				setConformance((Conformance)null);
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
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				return required != null;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				return validated != null;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return origins != null && !origins.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				return destination != null;
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return links != null && !links.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY__CONFORMANCE:
				return conformance != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataCapabilityImpl
