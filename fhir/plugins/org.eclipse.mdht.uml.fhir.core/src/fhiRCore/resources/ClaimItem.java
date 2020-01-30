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
 * A representation of the model object '<em><b>Claim Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getCareTeamSequences <em>Care Team Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getDiagnosisSequences <em>Diagnosis Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getProcedureSequences <em>Procedure Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getInformationSequences <em>Information Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getProgramCodes <em>Program Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getLocationx <em>Locationx</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getUdis <em>Udi</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getSubSites <em>Sub Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getEncounters <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimItem#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Claim_Item'"
 * @generated
 */
public interface ClaimItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Sequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Care Team Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Team Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Team Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_CareTeamSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getCareTeamSequences();

	/**
	 * Returns the value of the '<em><b>Diagnosis Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_DiagnosisSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisSequences();

	/**
	 * Returns the value of the '<em><b>Procedure Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_ProcedureSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getProcedureSequences();

	/**
	 * Returns the value of the '<em><b>Information Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Sequence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_InformationSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getInformationSequences();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Revenue()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRevenue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Category()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_ProductOrService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getProductOrService <em>Product Or Service</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Modifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_ProgramCode()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Servicedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='serviced[x]'"
	 * @generated
	 */
	DataType getServicedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getServicedx <em>Servicedx</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Locationx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='location[x]'"
	 * @generated
	 */
	DataType getLocationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getLocationx <em>Locationx</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getQuantity <em>Quantity</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_UnitPrice()
	 * @model containment="true"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getUnitPrice <em>Unit Price</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getFactor <em>Factor</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Net()
	 * @model containment="true"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Udi()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getUdis();

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimItem#getBodySite <em>Body Site</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_SubSite()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubSites();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEncounters();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimItemDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimItem_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimItemDetail> getDetails();

} // ClaimItem
