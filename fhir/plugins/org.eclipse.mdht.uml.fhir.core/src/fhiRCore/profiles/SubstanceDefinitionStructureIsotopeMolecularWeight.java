/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Structure Isotope Molecular Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotopeMolecularWeight()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Isotope_MolecularWeight'"
 * @generated
 */
public interface SubstanceDefinitionStructureIsotopeMolecularWeight extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotopeMolecularWeight_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotopeMolecularWeight_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotopeMolecularWeight_Amount()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

} // SubstanceDefinitionStructureIsotopeMolecularWeight
