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

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.GuidanceResponse;
import org.eclipse.mdht.uml.fhir.core.resource.GuidanceResponseAction;
import org.eclipse.mdht.uml.fhir.core.resource.OperationOutcome;
import org.eclipse.mdht.uml.fhir.core.resource.Parameters;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getEvaluationMessages <em>Evaluation Message</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.GuidanceResponseImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String requestId;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Resource module;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getEvaluationMessages() <em>Evaluation Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationOutcome> evaluationMessages;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters outputParameters;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getRequestId() {
		if (requestId != null && requestId.eIsProxy()) {
			InternalEObject oldRequestId = (InternalEObject)requestId;
			requestId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldRequestId);
			if (requestId != oldRequestId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, requestId));
			}
		}
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(org.eclipse.mdht.uml.fhir.core.datatype.String newRequestId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (Resource)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Resource newModule) {
		Resource oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationOutcome> getEvaluationMessages() {
		if (evaluationMessages == null) {
			evaluationMessages = new EObjectResolvingEList<OperationOutcome>(OperationOutcome.class, this, FhirResourcePackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getOutputParameters() {
		if (outputParameters != null && outputParameters.eIsProxy()) {
			InternalEObject oldOutputParameters = (InternalEObject)outputParameters;
			outputParameters = (Parameters)eResolveProxy(oldOutputParameters);
			if (outputParameters != oldOutputParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, outputParameters));
			}
		}
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters basicGetOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(Parameters newOutputParameters) {
		Parameters oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, outputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<GuidanceResponseAction>(GuidanceResponseAction.class, this, FhirResourcePackage.GUIDANCE_RESPONSE__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.GUIDANCE_RESPONSE__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID:
				if (resolve) return getRequestId();
				return basicGetRequestId();
			case FhirResourcePackage.GUIDANCE_RESPONSE__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case FhirResourcePackage.GUIDANCE_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessages();
			case FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				if (resolve) return getOutputParameters();
				return basicGetOutputParameters();
			case FhirResourcePackage.GUIDANCE_RESPONSE__ACTION:
				return getActions();
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
			case FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Resource)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				getEvaluationMessages().addAll((Collection<? extends OperationOutcome>)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Parameters)newValue);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends GuidanceResponseAction>)newValue);
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
			case FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Resource)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Parameters)null);
				return;
			case FhirResourcePackage.GUIDANCE_RESPONSE__ACTION:
				getActions().clear();
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
			case FhirResourcePackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return requestId != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE__MODULE:
				return module != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessages != null && !evaluationMessages.isEmpty();
			case FhirResourcePackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case FhirResourcePackage.GUIDANCE_RESPONSE__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
