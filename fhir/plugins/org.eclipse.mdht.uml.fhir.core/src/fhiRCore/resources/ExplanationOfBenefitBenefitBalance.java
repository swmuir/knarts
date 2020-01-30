/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Benefit Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getNetwork <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getTerm <em>Term</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getFinancials <em>Financial</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_BenefitBalance'"
 * @generated
 */
public interface ExplanationOfBenefitBenefitBalance extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Category()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excluded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' containment reference.
	 * @see #setExcluded(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Excluded()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExcluded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getExcluded <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' containment reference.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Network()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getNetwork();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Unit()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Term()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTerm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Financial</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalance_Financial()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitBenefitBalanceBenefit> getFinancials();

} // ExplanationOfBenefitBenefitBalance
