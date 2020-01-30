/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getForm <em>Form</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponse#getErrors <em>Error</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse()
 * @model
 * @generated
 */
public interface CoverageEligibilityResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Purpose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Code> getPurposes();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Servicedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicedx</em>' containment reference.
	 * @see #setServicedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Servicedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='serviced[x]'"
	 * @generated
	 */
	DataType getServicedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getServicedx <em>Servicedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicedx</em>' containment reference.
	 * @see #getServicedx()
	 * @generated
	 */
	void setServicedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requestor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Requestor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequestor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Outcome()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Disposition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisposition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Insurer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageEligibilityResponseInsurance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Insurance()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageEligibilityResponseInsurance> getInsurances();

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #setPreAuthRef(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_PreAuthRef()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPreAuthRef();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getPreAuthRef <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #getPreAuthRef()
	 * @generated
	 */
	void setPreAuthRef(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Form()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageEligibilityResponseErrors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponse_Error()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageEligibilityResponseErrors> getErrors();

} // CoverageEligibilityResponse
