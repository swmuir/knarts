/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Add Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getFee <em>Fee</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem()
 * @model extendedMetaData="name='ExplanationOfBenefit.AddItem' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitAddItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of input service items which this service line is intended to replace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_ItemSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getItemSequence();

	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_DetailSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getDetailSequence();

	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_SubDetailSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subDetailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getSubDetailSequence();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Fee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fee charged for the professional service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fee</em>' containment reference.
	 * @see #setFee(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_Fee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fee' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getFee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitAddItem#getFee <em>Fee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee</em>' containment reference.
	 * @see #getFee()
	 * @generated
	 */
	void setFee(Money value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of note references to the notes provided below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitAddItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitAdjudication> getAdjudication();

} // ExplanationOfBenefitAddItem
