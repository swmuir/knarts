/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.SubstanceAmount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Monomer Set Starting Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getMaterial <em>Material</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSetStartingMaterial()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MonomerSet_StartingMaterial'"
 * @generated
 */
public interface SubstancePolymerMonomerSetStartingMaterial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSetStartingMaterial_Material()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMaterial();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSetStartingMaterial_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defining</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSetStartingMaterial_IsDefining()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSetStartingMaterial_Amount()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

} // SubstancePolymerMonomerSetStartingMaterial
