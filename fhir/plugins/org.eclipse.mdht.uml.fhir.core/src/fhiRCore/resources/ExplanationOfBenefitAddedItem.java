/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Added Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getItemSequences <em>Item Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getDetailSequences <em>Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getSubDetailSequences <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getProviders <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getProgramCodes <em>Program Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getLocationx <em>Locationx</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getSubSites <em>Sub Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_AddedItem'"
 * @generated
 */
public interface ExplanationOfBenefitAddedItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_ItemSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getItemSequences();

	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_DetailSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getDetailSequences();

	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_SubDetailSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getSubDetailSequences();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Provider()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getProviders();

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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_ProductOrService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getProductOrService <em>Product Or Service</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getModifiers();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_ProgramCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getProgramCodes();

	/**
	 * Returns the value of the '<em><b>Servicedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicedx</em>' containment reference.
	 * @see #setServicedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Servicedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='serviced[x]'"
	 * @generated
	 */
	DataType getServicedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getServicedx <em>Servicedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicedx</em>' containment reference.
	 * @see #getServicedx()
	 * @generated
	 */
	void setServicedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Locationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationx</em>' containment reference.
	 * @see #setLocationx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Locationx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='location[x]'"
	 * @generated
	 */
	DataType getLocationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getLocationx <em>Locationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationx</em>' containment reference.
	 * @see #getLocationx()
	 * @generated
	 */
	void setLocationx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getQuantity <em>Quantity</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_UnitPrice()
	 * @model containment="true"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getUnitPrice <em>Unit Price</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getFactor <em>Factor</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Net()
	 * @model containment="true"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_SubSite()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubSites();

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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_NoteNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitAddedItemAddedItemDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAddedItem_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddedItemAddedItemDetail> getDetails();

} // ExplanationOfBenefitAddedItem
