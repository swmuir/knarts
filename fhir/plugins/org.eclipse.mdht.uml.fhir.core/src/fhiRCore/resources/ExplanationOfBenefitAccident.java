/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Accident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAccident#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAccident#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitAccident#getLocationx <em>Locationx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAccident()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_Accident'"
 * @generated
 */
public interface ExplanationOfBenefitAccident extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAccident_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAccident#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAccident_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAccident#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitAccident_Locationx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='location[x]'"
	 * @generated
	 */
	DataType getLocationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitAccident#getLocationx <em>Locationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationx</em>' containment reference.
	 * @see #getLocationx()
	 * @generated
	 */
	void setLocationx(DataType value);

} // ExplanationOfBenefitAccident
