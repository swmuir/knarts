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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseAction;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getEvaluationMessage <em>Evaluation Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getDataRequirement <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requestId;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Reference module;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GuidanceResponseStatus status;

	/**
	 * The cached value of the '{@link #getEvaluationMessage() <em>Evaluation Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evaluationMessage;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Reference outputParameters;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseAction> action;

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
		return FhirPackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestId(org.hl7.fhir.String newRequestId, NotificationChain msgs) {
		org.hl7.fhir.String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, newRequestId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(org.hl7.fhir.String newRequestId) {
		if (newRequestId != requestId) {
			NotificationChain msgs = null;
			if (requestId != null)
				msgs = ((InternalEObject)requestId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, null, msgs);
			if (newRequestId != null)
				msgs = ((InternalEObject)newRequestId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, null, msgs);
			msgs = basicSetRequestId(newRequestId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, newRequestId, newRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Reference newModule, NotificationChain msgs) {
		Reference oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE, oldModule, newModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Reference newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE, null, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE, null, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(GuidanceResponseStatus newStatus, NotificationChain msgs) {
		GuidanceResponseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GuidanceResponseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEvaluationMessage() {
		if (evaluationMessage == null) {
			evaluationMessage = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(Reference newOutputParameters, NotificationChain msgs) {
		Reference oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(Reference newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<GuidanceResponseAction>(GuidanceResponseAction.class, this, FhirPackage.GUIDANCE_RESPONSE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getDataRequirement() {
		if (dataRequirement == null) {
			dataRequirement = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT);
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return basicSetRequestId(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return basicSetModule(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return ((InternalEList<?>)getEvaluationMessage()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return getRequestId();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return getModule();
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessage();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return getAction();
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				getEvaluationMessage().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends GuidanceResponseAction>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				getAction().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return requestId != null;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return module != null;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessage != null && !evaluationMessage.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return dataRequirement != null && !dataRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
