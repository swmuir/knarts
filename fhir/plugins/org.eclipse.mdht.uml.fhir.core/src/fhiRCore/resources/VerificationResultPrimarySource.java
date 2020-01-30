/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Primary Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getCommunicationMethods <em>Communication Method</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getValidationDate <em>Validation Date</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getCanPushUpdates <em>Can Push Updates</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultPrimarySource#getPushTypeAvailables <em>Push Type Available</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VerificationResult_PrimarySource'"
 * @generated
 */
public interface VerificationResultPrimarySource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_Who()
	 * @model containment="true"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultPrimarySource#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Communication Method</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Method</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_CommunicationMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCommunicationMethods();

	/**
	 * Returns the value of the '<em><b>Validation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Status</em>' containment reference.
	 * @see #setValidationStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_ValidationStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getValidationStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultPrimarySource#getValidationStatus <em>Validation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Status</em>' containment reference.
	 * @see #getValidationStatus()
	 * @generated
	 */
	void setValidationStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Validation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Date</em>' containment reference.
	 * @see #setValidationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_ValidationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getValidationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultPrimarySource#getValidationDate <em>Validation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Date</em>' containment reference.
	 * @see #getValidationDate()
	 * @generated
	 */
	void setValidationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Can Push Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Push Updates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Push Updates</em>' containment reference.
	 * @see #setCanPushUpdates(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_CanPushUpdates()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCanPushUpdates();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultPrimarySource#getCanPushUpdates <em>Can Push Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Push Updates</em>' containment reference.
	 * @see #getCanPushUpdates()
	 * @generated
	 */
	void setCanPushUpdates(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Push Type Available</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push Type Available</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push Type Available</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultPrimarySource_PushTypeAvailable()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPushTypeAvailables();

} // VerificationResultPrimarySource
