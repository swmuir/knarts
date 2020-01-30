/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism Organism General</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getKingdom <em>Kingdom</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getPhylum <em>Phylum</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getClass_ <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismOrganismGeneral()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Organism_OrganismGeneral'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganismOrganismGeneral extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Kingdom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kingdom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kingdom</em>' containment reference.
	 * @see #setKingdom(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismOrganismGeneral_Kingdom()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getKingdom();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getKingdom <em>Kingdom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kingdom</em>' containment reference.
	 * @see #getKingdom()
	 * @generated
	 */
	void setKingdom(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Phylum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phylum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phylum</em>' containment reference.
	 * @see #setPhylum(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismOrganismGeneral_Phylum()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPhylum();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getPhylum <em>Phylum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phylum</em>' containment reference.
	 * @see #getPhylum()
	 * @generated
	 */
	void setPhylum(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass_(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismOrganismGeneral_Class()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismOrganismGeneral_Order()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOrder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(CodeableConcept value);

} // SubstanceSourceMaterialOrganismOrganismGeneral
