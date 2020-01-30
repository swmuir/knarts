/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseError#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseError#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseError#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseError#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseError()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse_Error'"
 * @generated
 */
public interface ClaimResponseError extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Sequence</em>' containment reference.
	 * @see #setItemSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseError_ItemSequence()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getItemSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseError#getItemSequence <em>Item Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Sequence</em>' containment reference.
	 * @see #getItemSequence()
	 * @generated
	 */
	void setItemSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #setDetailSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseError_DetailSequence()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getDetailSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseError#getDetailSequence <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #getDetailSequence()
	 * @generated
	 */
	void setDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #setSubDetailSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseError_SubDetailSequence()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getSubDetailSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseError#getSubDetailSequence <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #getSubDetailSequence()
	 * @generated
	 */
	void setSubDetailSequence(PositiveInt value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseError_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseError#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

} // ClaimResponseError
