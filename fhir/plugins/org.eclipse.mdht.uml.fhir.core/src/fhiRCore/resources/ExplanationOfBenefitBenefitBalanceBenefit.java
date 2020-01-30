/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Benefit Balance Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getAllowedx <em>Allowedx</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getUsedx <em>Usedx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalanceBenefit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BenefitBalance_Benefit'"
 * @generated
 */
public interface ExplanationOfBenefitBenefitBalanceBenefit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalanceBenefit_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allowedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowedx</em>' containment reference.
	 * @see #setAllowedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalanceBenefit_Allowedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='allowed[x]'"
	 * @generated
	 */
	DataType getAllowedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getAllowedx <em>Allowedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowedx</em>' containment reference.
	 * @see #getAllowedx()
	 * @generated
	 */
	void setAllowedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Usedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usedx</em>' containment reference.
	 * @see #setUsedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitBenefitBalanceBenefit_Usedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='used[x]'"
	 * @generated
	 */
	DataType getUsedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit#getUsedx <em>Usedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usedx</em>' containment reference.
	 * @see #getUsedx()
	 * @generated
	 */
	void setUsedx(DataType value);

} // ExplanationOfBenefitBenefitBalanceBenefit
