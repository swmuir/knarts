/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Financial</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitQuantity <em>Benefit Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUsedQuantity <em>Benefit Used Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial()
 * @model extendedMetaData="name='ExplanationOfBenefit.Financial' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitFinancial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deductable, visits, benefit amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Benefit Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Unsigned Int</em>' containment reference.
	 * @see #setBenefitUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial_BenefitUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getBenefitUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Unsigned Int</em>' containment reference.
	 * @see #getBenefitUnsignedInt()
	 * @generated
	 */
	void setBenefitUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Benefit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Quantity</em>' containment reference.
	 * @see #setBenefitQuantity(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial_BenefitQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getBenefitQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitQuantity <em>Benefit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Quantity</em>' containment reference.
	 * @see #getBenefitQuantity()
	 * @generated
	 */
	void setBenefitQuantity(Money value);

	/**
	 * Returns the value of the '<em><b>Benefit Used Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Used Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Used Unsigned Int</em>' containment reference.
	 * @see #setBenefitUsedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial_BenefitUsedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUsedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getBenefitUsedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Used Unsigned Int</em>' containment reference.
	 * @see #getBenefitUsedUnsignedInt()
	 * @generated
	 */
	void setBenefitUsedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Benefit Used Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Used Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Used Quantity</em>' containment reference.
	 * @see #setBenefitUsedQuantity(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitFinancial_BenefitUsedQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUsedQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getBenefitUsedQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getBenefitUsedQuantity <em>Benefit Used Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Used Quantity</em>' containment reference.
	 * @see #getBenefitUsedQuantity()
	 * @generated
	 */
	void setBenefitUsedQuantity(Money value);

} // ExplanationOfBenefitFinancial
