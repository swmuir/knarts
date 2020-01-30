/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorDescription <em>Author Description</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Organism_Author'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganismAuthor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Author Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Type</em>' containment reference.
	 * @see #setAuthorType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor_AuthorType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAuthorType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorType <em>Author Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Type</em>' containment reference.
	 * @see #getAuthorType()
	 * @generated
	 */
	void setAuthorType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Description</em>' containment reference.
	 * @see #setAuthorDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor_AuthorDescription()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAuthorDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorDescription <em>Author Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Description</em>' containment reference.
	 * @see #getAuthorDescription()
	 * @generated
	 */
	void setAuthorDescription(fhiRCore.dataTypes.String value);

} // SubstanceSourceMaterialOrganismAuthor
