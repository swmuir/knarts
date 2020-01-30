/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Timing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result</b></em>'.
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
 *   <li>{@link fhiRCore.resources.VerificationResult#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getTargetLocations <em>Target Location</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getNeed <em>Need</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getValidationProcesses <em>Validation Process</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getLastPerformed <em>Last Performed</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getNextScheduled <em>Next Scheduled</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getFailureAction <em>Failure Action</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getPrimarySources <em>Primary Source</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getAttestation <em>Attestation</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResult#getValidators <em>Validator</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult()
 * @model
 * @generated
 */
public interface VerificationResult extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getTargets();

	/**
	 * Returns the value of the '<em><b>Target Location</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Location</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_TargetLocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getTargetLocations();

	/**
	 * Returns the value of the '<em><b>Need</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' containment reference.
	 * @see #setNeed(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Need()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getNeed();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getNeed <em>Need</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' containment reference.
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_StatusDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Validation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Type</em>' containment reference.
	 * @see #setValidationType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_ValidationType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getValidationType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getValidationType <em>Validation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Type</em>' containment reference.
	 * @see #getValidationType()
	 * @generated
	 */
	void setValidationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Validation Process</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Process</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_ValidationProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getValidationProcesses();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Timing)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Frequency()
	 * @model containment="true"
	 * @generated
	 */
	Timing getFrequency();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Timing value);

	/**
	 * Returns the value of the '<em><b>Last Performed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Performed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Performed</em>' containment reference.
	 * @see #setLastPerformed(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_LastPerformed()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getLastPerformed();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getLastPerformed <em>Last Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Performed</em>' containment reference.
	 * @see #getLastPerformed()
	 * @generated
	 */
	void setLastPerformed(DateTime value);

	/**
	 * Returns the value of the '<em><b>Next Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Scheduled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Scheduled</em>' containment reference.
	 * @see #setNextScheduled(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_NextScheduled()
	 * @model containment="true"
	 * @generated
	 */
	Date getNextScheduled();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getNextScheduled <em>Next Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Scheduled</em>' containment reference.
	 * @see #getNextScheduled()
	 * @generated
	 */
	void setNextScheduled(Date value);

	/**
	 * Returns the value of the '<em><b>Failure Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Action</em>' containment reference.
	 * @see #setFailureAction(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_FailureAction()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFailureAction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getFailureAction <em>Failure Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Action</em>' containment reference.
	 * @see #getFailureAction()
	 * @generated
	 */
	void setFailureAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.VerificationResultPrimarySource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_PrimarySource()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationResultPrimarySource> getPrimarySources();

	/**
	 * Returns the value of the '<em><b>Attestation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attestation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attestation</em>' containment reference.
	 * @see #setAttestation(VerificationResultAttestation)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Attestation()
	 * @model containment="true"
	 * @generated
	 */
	VerificationResultAttestation getAttestation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResult#getAttestation <em>Attestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attestation</em>' containment reference.
	 * @see #getAttestation()
	 * @generated
	 */
	void setAttestation(VerificationResultAttestation value);

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.VerificationResultValidator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResult_Validator()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationResultValidator> getValidators();

} // VerificationResult
