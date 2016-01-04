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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.OperationOutcomeIssue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OperationOutcomeIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OperationOutcomeIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OperationOutcomeIssueImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OperationOutcomeIssueImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.OperationOutcomeIssueImpl#getLocations <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationOutcomeIssueImpl extends BackboneElementImpl implements OperationOutcomeIssue {
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept details;

	/**
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String diagnostics;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOutcomeIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getOperationOutcomeIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (Code)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDetails() {
		if (details != null && details.eIsProxy()) {
			InternalEObject oldDetails = (InternalEObject)details;
			details = (CodeableConcept)eResolveProxy(oldDetails);
			if (details != oldDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, details));
			}
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(CodeableConcept newDetails) {
		CodeableConcept oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDiagnostics() {
		if (diagnostics != null && diagnostics.eIsProxy()) {
			InternalEObject oldDiagnostics = (InternalEObject)diagnostics;
			diagnostics = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDiagnostics);
			if (diagnostics != oldDiagnostics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, oldDiagnostics, diagnostics));
			}
		}
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDiagnostics() {
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(org.eclipse.mdht.uml.fhir.core.datatype.String newDiagnostics) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDiagnostics = diagnostics;
		diagnostics = newDiagnostics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, oldDiagnostics, diagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.OPERATION_OUTCOME_ISSUE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				if (resolve) return getDetails();
				return basicGetDetails();
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				if (resolve) return getDiagnostics();
				return basicGetDiagnostics();
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return getLocations();
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
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)newValue);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
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
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)null);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)null);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)null);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
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
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return severity != null;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__CODE:
				return code != null;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return details != null;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				return diagnostics != null;
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationOutcomeIssueImpl
