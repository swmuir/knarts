/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item Definition Property Group Price Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroupPriceComponent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PropertyGroup_PriceComponent'"
 * @generated
 */
public interface ChargeItemDefinitionPropertyGroupPriceComponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroupPriceComponent_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroupPriceComponent_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroupPriceComponent_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroupPriceComponent_Amount()
	 * @model containment="true"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // ChargeItemDefinitionPropertyGroupPriceComponent
