/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Issue</b></em>'.
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
 *   <li>{@link fhiRCore.resources.DetectedIssue#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getIdentifiedx <em>Identifiedx</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getImplicateds <em>Implicated</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getEvidences <em>Evidence</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getDetail <em>Detail</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssue#getMitigations <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue()
 * @model
 * @generated
 */
public interface DetectedIssue extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Severity()
	 * @model containment="true"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Patient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifiedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiedx</em>' containment reference.
	 * @see #setIdentifiedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Identifiedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='identified[x]'"
	 * @generated
	 */
	DataType getIdentifiedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getIdentifiedx <em>Identifiedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiedx</em>' containment reference.
	 * @see #getIdentifiedx()
	 * @generated
	 */
	void setIdentifiedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Author()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Implicated</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicated</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicated</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Implicated()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getImplicateds();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DetectedIssueEvidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<DetectedIssueEvidence> getEvidences();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Detail()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDetail();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DetectedIssue#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DetectedIssueMitigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssue_Mitigation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DetectedIssueMitigation> getMitigations();

} // DetectedIssue
