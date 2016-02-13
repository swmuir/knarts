/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Adjudication1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAdjudication1()
 * @model extendedMetaData="name='ExplanationOfBenefit.Adjudication1' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitAdjudication1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAdjudication1_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjudication reason such as limit reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAdjudication1_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitory amount associated with the code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAdjudication1_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAdjudication1_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication1#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

} // ExplanationOfBenefitAdjudication1