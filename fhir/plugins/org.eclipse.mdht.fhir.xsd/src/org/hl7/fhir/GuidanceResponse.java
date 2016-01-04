/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A guidance response is the formal response to a previous guidance request. It is a derivative of the knowledge response that provides additional information relevant specifically to clinical decision support such as a description of any proposed actions to be taken.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getModule <em>Module</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getEvaluationMessage <em>Evaluation Message</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse()
 * @model extendedMetaData="name='GuidanceResponse' kind='elementOnly'"
 * @generated
 */
public interface GuidanceResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Id</em>' containment reference.
	 * @see #setRequestId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_RequestId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequestId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getRequestId <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' containment reference.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a knowledge module involved in an interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Module()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getModule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(GuidanceResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GuidanceResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Evaluation Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluation Message</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_EvaluationMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluationMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEvaluationMessage();

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference.
	 * @see #setOutputParameters(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_OutputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOutputParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getOutputParameters <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameters</em>' containment reference.
	 * @see #getOutputParameters()
	 * @generated
	 */
	void setOutputParameters(Reference value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GuidanceResponseAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actions, if any, produced by the evaluation of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GuidanceResponseAction> getAction();

} // GuidanceResponse
