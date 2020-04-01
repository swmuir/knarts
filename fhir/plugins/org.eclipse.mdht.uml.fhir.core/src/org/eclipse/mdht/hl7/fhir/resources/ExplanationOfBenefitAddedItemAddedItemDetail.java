/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Added Item Added Item Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AddedItem_AddedItemDetail'"
 * @generated
 */
public interface ExplanationOfBenefitAddedItemAddedItemDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product Or Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Or Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Or Service</em>' containment reference.
	 * @see #setProductOrService(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_ProductOrService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getModifiers();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_UnitPrice()
	 * @model containment="true"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_Net()
	 * @model containment="true"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_NoteNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitAddedItemAddedItemDetail_SubDetail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail> getSubDetails();

} // ExplanationOfBenefitAddedItemAddedItemDetail
