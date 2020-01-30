/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Added Item Added Item Detail Added Item Sub Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getAdjudications <em>Adjudication</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AddedItemDetail_AddedItemSubDetail'"
 * @generated
 */
public interface ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_ProductOrService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_Modifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getQuantity <em>Quantity</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_UnitPrice()
	 * @model containment="true"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getUnitPrice <em>Unit Price</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getFactor <em>Factor</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_Net()
	 * @model containment="true"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_NoteNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimResponseItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseAddedItemAddedItemDetailAddedItemSubDetail_Adjudication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClaimResponseItemAdjudication> getAdjudications();

} // ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail
