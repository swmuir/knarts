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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestSecurity;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestSecurityCertificate;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Rest Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestSecurityImpl#getCors <em>Cors</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestSecurityImpl#getServices <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestSecurityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestSecurityImpl#getCertificates <em>Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceRestSecurityImpl extends BackboneElementImpl implements ConformanceRestSecurity {
	/**
	 * The cached value of the '{@link #getCors() <em>Cors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean cors;

	/**
	 * The cached value of the '{@link #getServices() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> services;

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
	 * The cached value of the '{@link #getCertificates() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestSecurityCertificate> certificates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceRestSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConformanceRestSecurity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getCors() {
		if (cors != null && cors.eIsProxy()) {
			InternalEObject oldCors = (InternalEObject)cors;
			cors = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldCors);
			if (cors != oldCors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS, oldCors, cors));
			}
		}
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetCors() {
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCors(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newCors) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldCors = cors;
		cors = newCors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS, oldCors, cors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CONFORMANCE_REST_SECURITY__SERVICE);
		}
		return services;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestSecurityCertificate> getCertificates() {
		if (certificates == null) {
			certificates = new EObjectContainmentEList<ConformanceRestSecurityCertificate>(ConformanceRestSecurityCertificate.class, this, FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE);
		}
		return certificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE:
				return ((InternalEList<?>)getCertificates()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS:
				if (resolve) return getCors();
				return basicGetCors();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__SERVICE:
				return getServices();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE:
				return getCertificates();
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
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS:
				setCors((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__SERVICE:
				getServices().clear();
				getServices().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE:
				getCertificates().clear();
				getCertificates().addAll((Collection<? extends ConformanceRestSecurityCertificate>)newValue);
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
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS:
				setCors((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__SERVICE:
				getServices().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE:
				getCertificates().clear();
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
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CORS:
				return cors != null;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__SERVICE:
				return services != null && !services.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY__CERTIFICATE:
				return certificates != null && !certificates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceRestSecurityImpl
