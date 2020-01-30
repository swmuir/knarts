/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getAdjustmentReason <em>Adjustment Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponsePayment#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse_Payment'"
 * @generated
 */
public interface ClaimResponsePayment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment</em>' containment reference.
	 * @see #setAdjustment(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_Adjustment()
	 * @model containment="true"
	 * @generated
	 */
	Money getAdjustment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getAdjustment <em>Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' containment reference.
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(Money value);

	/**
	 * Returns the value of the '<em><b>Adjustment Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustment Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment Reason</em>' containment reference.
	 * @see #setAdjustmentReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_AdjustmentReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAdjustmentReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getAdjustmentReason <em>Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment Reason</em>' containment reference.
	 * @see #getAdjustmentReason()
	 * @generated
	 */
	void setAdjustmentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_Amount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponsePayment_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponsePayment#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

} // ClaimResponsePayment
