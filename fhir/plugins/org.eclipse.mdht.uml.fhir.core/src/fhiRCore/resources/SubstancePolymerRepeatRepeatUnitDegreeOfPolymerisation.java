/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.SubstanceAmount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation#getDegree <em>Degree</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RepeatUnit_DegreeOfPolymerisation'"
 * @generated
 */
public interface SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation_Degree()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDegree();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SubstanceAmount)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation_Amount()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

} // SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
