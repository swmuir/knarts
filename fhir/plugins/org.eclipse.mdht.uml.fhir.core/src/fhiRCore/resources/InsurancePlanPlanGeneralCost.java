/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Plan General Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getGroupSize <em>Group Size</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getCost <em>Cost</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanGeneralCost()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan_GeneralCost'"
 * @generated
 */
public interface InsurancePlanPlanGeneralCost extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanGeneralCost_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Group Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Size</em>' containment reference.
	 * @see #setGroupSize(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanGeneralCost_GroupSize()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getGroupSize();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getGroupSize <em>Group Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Size</em>' containment reference.
	 * @see #getGroupSize()
	 * @generated
	 */
	void setGroupSize(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanGeneralCost_Cost()
	 * @model containment="true"
	 * @generated
	 */
	Money getCost();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Money value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanGeneralCost_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanGeneralCost#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // InsurancePlanPlanGeneralCost
