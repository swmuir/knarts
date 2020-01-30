/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getDetails <em>Details</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationOutcomeIssue#getExpressions <em>Expression</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationOutcome_Issue'"
 * @generated
 */
public interface OperationOutcomeIssue extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Severity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationOutcomeIssue#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationOutcomeIssue#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Details()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDetails();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationOutcomeIssue#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference.
	 * @see #setDiagnostics(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Diagnostics()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDiagnostics();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationOutcomeIssue#getDiagnostics <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics</em>' containment reference.
	 * @see #getDiagnostics()
	 * @generated
	 */
	void setDiagnostics(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLocations();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcomeIssue_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getExpressions();

} // OperationOutcomeIssue
