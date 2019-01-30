/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getSubstanceReference <em>Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship()
 * @model extendedMetaData="name='SubstanceReferenceInformation.Relationship' kind='elementOnly'"
 * @generated
 */
public interface SubstanceReferenceInformationRelationship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance Reference</em>' containment reference.
	 * @see #setSubstanceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_SubstanceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getSubstanceReference <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Reference</em>' containment reference.
	 * @see #getSubstanceReference()
	 * @generated
	 */
	void setSubstanceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Substance Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #setSubstanceCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_SubstanceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstanceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 */
	void setSubstanceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getInteraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_IsDefining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDefining' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Range</em>' containment reference.
	 * @see #setAmountRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_AmountRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAmountRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountRange <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Range</em>' containment reference.
	 * @see #getAmountRange()
	 * @generated
	 */
	void setAmountRange(Range value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_AmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Text</em>' containment reference.
	 * @see #setAmountText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_AmountText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountText' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationRelationship#getAmountText <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Text</em>' containment reference.
	 * @see #getAmountText()
	 * @generated
	 */
	void setAmountText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationRelationship_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceReferenceInformationRelationship
