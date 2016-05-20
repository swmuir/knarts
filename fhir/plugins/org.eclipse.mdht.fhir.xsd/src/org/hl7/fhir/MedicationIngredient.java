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
 * A representation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient()
 * @model extendedMetaData="name='Medication.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface MedicationIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_ItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_ItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationIngredient_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationIngredient#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Ratio value);

} // MedicationIngredient
